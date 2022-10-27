
# Changelog for Java Representation of Information Model
All notable changes to this project will be documented in this file.

## [5.0.3] - 2022-10-26
### Changed
- `@NotNull` constraint on `ids:pipEndpoint` has been removed (ids:Contraint).

## [5.0.2] - 2022-09-15
*no changes*, just updating version number for alignment with other IDS tools.

## [5.0.1] - 2022-06-30
*no changes*, just updating version number for alignment with other IDS tools.

## [5.0.0] - 2022-03-23
### (Breaking) Change - Relaxation of Enums V2
- Enums are replaced with interface, implementation and builder to represent the RDF classes from the ontology where default values are provided. Additionally, it is also possible to create custom instances using interfaces, implementations and builders that are now available again.
- The default values are now available as static instances in the interfaces.
- e.g. `ids:Action`
  - **Before**:
    - *Ontology* (`InformationModel/codes/Action.ttl`):
    ```
    ...
    idsc:ANONYMIZE
      a ids:Action ;
      rdfs:comment "To anonymize all, parts or certain attributes of the resource."@en .
    ...
    ```
    - *Java Representation* (version 4.2.7 and before, version 4.3.0) - `Action.java`
    ```
    public enum Action implements ModelClass {
        ...
        ANONYMIZE(
          "https://w3id.org/idsa/code/ANONYMIZE",
          Arrays.asList(new TypedLiteral("anonymize", "en")),
          Arrays.asList(new TypedLiteral("To anonymize all, parts or certain attributes of the resource.", "en"))),
        ...
    }
    ```
    - The values provided in the could be used as e.g. `Action.ANONYMIZE`. But the choices were limited to the provided values. No custom Actions were possible.
  - **New**:
    - *Java Representation* (version 5.0.0):
      - `interface Action`, `class ActionBuilder`, `class ActionImpl`
      -
      ```
      public interface Action extends ModelClass {
          // standard methods ...
          Action ANONYMIZE = new ActionBuilder(URI.create("https://w3id.org/idsa/code/ANONYMIZE")).build();
          ...
      }

      ```
    - The values provided by the ontology are collected in `interface Action` and can by used as e.g. `Action.ANONYMIZE`.
    - Additionally, the interface, builder and implementation can be used to create custom instances of an `ids:Action`.
  - *affected enums*:
    - ids:Action
    - ids:AppEndpointType
    - ids:AppExecutionResources
    - ids:ArtifactState
    - ids:Audience
    - ids:AuditGuarantee
    - ids:AuthenticationGuarantee
    - ids:AuthStandard
    - ids:BinaryOperator
    - ids:CertificationLevel
    - ids:ComponentCertificationLevel
    - ids:ConnectorDeployMode
    - ids:ConnectorStatus
    - ids:ContentType
    - ids:Frequency
    - ids:IntegrityGuarantee
    - ids:IntegrityVerificationScopeGuarantee
    - ids:KeyType
    - ids:Language
    - ids:LeftOperand
    - ids:LocalDataConfidentialityGuarantee
    - ids:LogLevel
    - ids:ParticipantCertificationLevel
    - ids:PaymentModality
    - ids:QueryLanguage
    - ids:QueryScope
    - ids:QueryTarget
    - ids:RejectionReason
    - ids:SecurityGuarantee
    - ids:SecurityProfile
    - ids:ServiceIsolationGuarantee
    - ids:TokenFormat
    - ids:UsageControlGuarantee
    - ids:UsagePolicyClass
  - *(indirectly) affected classes*: Every class using at least one enum value is affected. But instead of the approach in version 4.2.8, the direct references to a *old* enum, e.g. `Action.ANONYMIZE`, **don't** need to be adjusted but stay compatible with the new approach. Alternatively, a custom class can be created using the new interface, implementation and builder for each former enum class.
  - *Notice*: The object that is behind the call to e.g. `Action.ANONYMIZE` is not a value of an enum anymore! This means that some Java constructs using these objects might need to be adjusted. E.g. `switch`-statements will no longer work with the new approach to *enums*.
- *Consequences for JSON-LD*: This is not a breaking change for how to write JSON-LD messages using the default instances.
  - e.g. the following would still be valid:
    ```
    ...
    "ids:action": {
       "@id": "https://w3id.org/idsa/code/ANONYMIZE"
    }
    ...
    ```
- **But** it is still **recommended** to annotate **all** statements using classes having predefined instances with the respective `@type` information.
  - This will work in the same way as the above example, but is more precise:
    ```
    ...
    "ids:action": {
       "@id": "https://w3id.org/idsa/code/ANONYMIZE",
       "@type": "ids:Action"
    }
    ...
    ```
  - This will **NOT** work because the short notation is only supported for predefined instances:
    ```
    ...
    "ids:action": {
       "@id": "https://w3id.org/idsa/code/MY_CUSTOM_ACTION"
    }
    ...
    ```
  - To **use custom instances** it is mandatory to annotate them with a `@type` statement (as for every other class without, too). The following would be the correct way to write a custom instance:
    ```
    ...
    "ids:action": {
       "@id": "https://w3id.org/idsa/code/MY_CUSTOM_ACTION",
       "@type": "ids:Action"
    }
    ...
    ```

### (Breaking) Change - Relaxation of Properties V2
- For certain RDF properties in the InformationModel it should be allowed to use a full-object representation or just a URI as a reference to such an object. E.g. the property `ids:maintainer` should be allowed to link a `ids:BaseConnector` to a URI or a `ids:Participant`.
  - *affected properties*:
    - ids:publisher (ids:AppResource, ids:AudioResource, ids:DataResource, ids:ImageResource, ids:Resource, ids:SoftwareResource, ids:TextResource, ids:VideoResource)
    - ids:sovereign (ids:AppResource, ids:AudioResource, ids:DataResource, ids:ImageResource, ids:Resource, ids:SoftwareResource, ids:TextResource, ids:VideoResource)
    - ids:offeredResource (ids:ResourceCatalog)
    - ids:requestedResource (ids:ResourceCatalog)
    - ids:member (ids:ParticipantCatalog)
    - ids:maintainer (ids:AppStore, ids:BaseConnector, ids:Broker, ids:ClearingHouse, ids:DAPS, ids:IdentityProvider, ids:InfrastructureComponent, ids:ParIS, ids:TrustedConnector)
    - ids:curator (ids:AppStore, ids:BaseConnector, ids:Broker, ids:ClearingHouse, ids:DAPS, ids:IdentityProvider, ids:InfrastructureComponent, ids:ParIS, ids:TrustedConnector)
- To realize this behavior in Java, for each affected property an additional field in Java has been added. In this version, the original field **and** the new field have an additional suffix indicating the field types.
  - e.g. `ids:maintainer`
    - *Before*: `protected URI _maintainer`
    - *New*: `protected URI _maintainerAsUri` and `protected Participant _maintainerAsObject`
- *Notice*: This means getting and setting these fields in Java **will cause errors** when upgrading from version 4.3.0 to 5.0.0 and needs to be taken care of!!
- *Notice*: As in version 4.2.7, there is a method for each affected property `public UriOrModelClass get<propertName>()`. This returns an object of the reintroduced helper class `UriOrModelClass` from the `de.fraunhofer.iais.eis.util`-package. This is **only for serialization purposes** and is **not** supposed to be used directly. For access to the information content of the now two fields for some properties it is **highly recommended** to use the dedicated getter methods for these fields.
- The two fields holding ArrayLists representing the same property **can** be used in parallel.
  - e.g. in Java:
    ```
    ResourceCatalog resourceCatalog = new ResourceCatalogBuilder()
            ._offeredResourceAsObject_(new ResourceBuilder(URI.create("http://example.org/resource/r1"))
                    // add properties here
                    .build()
            )
            ._offeredResourceAsUri_(new ArrayList<>(Arrays.asList(
                    URI.create("http://example.org/resource/r2"),
                    URI.create("http://example.org/resource/r3")))
            )
            ...
            .build();
    ```
  - e.g. in JSON-LD:
    ```
    "ids:offeredResource" : [ {
        "@type" : "ids:Resource",
        "@id" : "http://example.org/resource/r1",
        ...
      }, {
        "@id" : "http://example.org/resource/r2"
      }, {
        "@id" : "http://example.org/resource/r3"
      } ],
    ```
- The same is **NOT** true for fields containing **single values**. If e.g. for `ids:maintainer` there is an entry for both `_maintainerAsUri` and `_maintainerAsObject` then the field with *potentially more* information is **always** chosen for serialization which is the `_maintainerAsObject`.
- While the handling of the Java objects requires the user to use different fields for URIs or complex objects, in RDF the property can be used in the same way for both options.
  - e.g. `ids:maintainer`
    - *JSON-LD*:
      ```
      {
        ...
        "ids:maintainer": {
          "@id": "https://example.org/maintainer/m1"
        }
        ...
      }
      ```
      OR
      ```
      {
        ...
        "ids:maintainer": {
          "@id": "https:example.org/maintainer/m2",
          "@type": "ids:Participant",
          // add more properties here
        }
        ...
      }
      ```
    - *Java*:
      ```
      BaseConnector baseConnector = new BaseConnectorBuilder()
            ._maintainerAsUri(URI.create("https://example.org/maintainer/m1"))
            ...
            .build();
      ```
      OR
      ```
      BaseConnector baseConnector = new BaseConnectorBuilder()
            ._maintainerAsObject(new ParticipantBuilder(URI.create("https://example.org/maintainer/m2"))
                  // add more properties here
                  ...
                  .build())
            ...
            .build();
      ```

### Added
- `List<IdsProtocolSpecification> _apiSpecifiation` (ids:AppEndpoint, ids:ConnectorEndpoint, ids:Endpoint, ids:GenericEndpoint)
- `ids:IdsProtocolSpecification` with interface, implementation, builder and static instances in the interface.
- Implementation and builder for `ids:InfrastructureComponent` which is no longer only an abstract class.
- `ids:PIP` with interface, implementation and builder.
- `ids:PXP` with interface, implementation and builder.
- `ids:UsageControlComponent` with interface, implementation and builder.

### Added - Mixins
- A mixin for each class is added to enable the `de.fraunhofer.iais.eis.ids.jsonld.Serializer` to process the mapping of two Java fields onto one JSON-LD field correctly.

### Changed
- `ids:pipEndpoint` changed range from `URI` to `ids:PIP`. Java field representation of this property switched type accordingly from `URI` to `PIP`. (ids:Constraint)
- replaced processing of `byte[]` fields in the `hashCode()` method to using `Arrays.hashCode`.


## <s>[4.3.0] - 2022-09-03</s>
**THIS VERSION WAS DELETED!** Version 4.3.0 does not exist anymore because this was a versioning mistake. For anyone potentially still using this version, please change to version 4.2.3 because these two are identical.

## [4.2.8] - 2021-12-12
**Unstable version. It is highly recommended to skip this one!**

### (Breaking) Change - Relaxation of Enums
- Enums now provide default values but it is also possible to create custom instances using interfaces, implementations and builders that are now available, too.
- e.g. `ids:Action`
  - **Before**:
    - *Ontology* (`InformationModel/codes/Action.ttl`):
      ```
      ...
      idsc:ANONYMIZE
        a ids:Action ;
        rdfs:comment "To anonymize all, parts or certain attributes of the resource"@en .
      ...
      ```
    - *Java Representation* (version 4.2.7 and before) - `Action.java`
      ```
      public enum Action implements ModelClass {
          ...
          ANONYMIZE(
            "https://w3id.org/idsa/code/ANONYMIZE",
            Arrays.asList(new TypedLiteral("anonymize", "en")),
            Arrays.asList(new TypedLiteral("To anonymize all, parts or certain attributes of the resource.", "en"))),
          ...
      }
      ```
    - The values provided in the could be used as e.g. `Action.ANONYMIZE`. But the choices were limited to the provided values. No custom Actions were possible.
  - **New**:
    - *Java Representation* (version 4.2.8):
      - `interface Action`, `class ActionBuilder`, `class ActionImpl`, `enum DefaultAction`
    - The values provided by the ontology are collected in `enum DefaultAction` and can by used as e.g. `DefaultAction.ANONYMIZE`.
    - Additionally, the interface, builder and implementation can be used to create custom instances of an `ids:Action`.
  - *affected classes*: Every class using at least one enum value is affected. This means that every reference to a *old* enum, e.g. `Action.XXX`, need to be adjusted to include the new enum prefix `Default`, e.g. `DefaultAction.XXX`. Alternatively, a custom class can be created using the new interface, implementation and builder for each enum.  

### Renamed
- All enums were prefixed with `Default`, i.e. `enum Action` is now `enum DefaultAction`.
  - *affected enums*:
    - ids:Action
    - ids:AppEndpointType
    - ids:AppExecutionResources
    - ids:ArtifactState
    - ids:Audience
    - ids:AuditGuarantee
    - ids:AuthenticationGuarantee
    - ids:AuthStandard
    - ids:BinaryOperator
    - ids:CertificationLevel
    - ids:ComponentCertificationLevel
    - ids:ConnectorDeployMode
    - ids:ConnectorStatus
    - ids:ContentType
    - ids:Frequency
    - ids:IntegrityGuarantee
    - ids:IntegrityVerificationScopeGuarantee
    - ids:KeyType
    - ids:Language
    - ids:LeftOperand
    - ids:LocalDataConfidentialityGuarantee
    - ids:LogLevel
    - ids:ParticipantCertificationLevel
    - ids:PaymentModality
    - ids:QueryLanguage
    - ids:QueryScope
    - ids:QueryTarget
    - ids:RejectionReason
    - ids:SecurityGuarantee
    - ids:SecurityProfile
    - ids:ServiceIsolationGuarantee
    - ids:TokenFormat
    - ids:UsageControlGuarantee
    - ids:UsagePolicyClass

### Added
- Enum DefaultIANAMediaType, enum DefaultCustomMediaType. These two already had interfaces, implementations and builders but not default values before.
- Interface, implementation and builder for all RDF classes that were translated to enums before.
  - *affected enums*:
    - ids:Action
    - ids:AppEndpointType
    - ids:AppExecutionResources
    - ids:ArtifactState
    - ids:Audience
    - ids:AuditGuarantee
    - ids:AuthenticationGuarantee
    - ids:AuthStandard
    - ids:BinaryOperator
    - ids:CertificationLevel
    - ids:ComponentCertificationLevel
    - ids:ConnectorDeployMode
    - ids:ConnectorStatus
    - ids:ContentType
    - ids:Frequency
    - ids:IntegrityGuarantee
    - ids:IntegrityVerificationScopeGuarantee
    - ids:KeyType
    - ids:Language
    - ids:LeftOperand
    - ids:LocalDataConfidentialityGuarantee
    - ids:LogLevel
    - ids:ParticipantCertificationLevel
    - ids:PaymentModality
    - ids:QueryLanguage
    - ids:QueryScope
    - ids:QueryTarget
    - ids:RejectionReason
    - ids:SecurityGuarantee
    - ids:SecurityProfile
    - ids:ServiceIsolationGuarantee
    - ids:TokenFormat
    - ids:UsageControlGuarantee
    - ids:UsagePolicyClass

### Changed/Added - Relaxation of properties
- Additional relaxation fields for `ids:assignee`, `ids:assigner`, `ids:target`.
  - New logic for naming convention:
    - For the field representing a property link to a complex object no suffix is added.
    - For the field representing a property link to a URI the suffix `AsUri`.
  - Results in the following new/renamed fields:
    - `protected List<Participant> _assignee` and `protected List<Participant> _assigneeAsUri`
    - `protected List<Participant> _assigner` and `protected List<Participant> _assignerAsUri`
    - `protected Asset _target` and `protected Asset _targetAsUri`
    - **NOTICE**: There was a bug in the generation causing **BOTH** fields to only hold the complex objects!!!
  - *affected classes*: Rule, Permission, Prohibition, Duty

### Deleted
- Additional relaxation fields for `ids:maintainer`, `ids:curator`, `ids:member`, `ids:offeredResource` and `ids:requestedResource` (`_maintainerAsParticipant`, `_curatorAsParticipant`, `_memberAsUri`, `_offeredResourceAsUri`, `_requestedResourceAsUri`) and respective additional getter and setter methods that were introduced in version 4.2.7 .

## [4.2.7] - 2021-11-03
### New Feature - Relaxation of Java Representation of certain Properties
- For certain RDF properties in the InformationModel it should be allowed to use a full-object representation or just a URI as a reference to such an object. E.g. the property `ids:maintainer` should be allowed to link a `ids:BaseConnector` to a URI or a `ids:Participant`.
  - *affected properties*:
    - ids:curator (ids:AppStore, ids:BaseConnector, ids:Broker, ids:ClearingHouse, ids:DAPS, ids:IdentityProvider, ids:InfrastructureComponent, ids:ParIS, ids:TrustedConnector)
    - ids:maintainer (ids:AppStore, ids:BaseConnector, ids:Broker, ids:ClearingHouse, ids:DAPS, ids:IdentityProvider, ids:InfrastructureComponent, ids:ParIS, ids:TrustedConnector)
    - ids:member (ids:ParticipantCatalog)
    - ids:offeredResource (ids:ResourceCatalog)
    - ids:requestedResource (ids:ResourceCatalog)
- To realize this behavior in Java, for each affected property an additional field in Java has been added. To ensure backward compatibility, the original field has not been changed. The additional field has the same name with a suffix indicating the new field type.
  - e.g. `ids:maintainer`
    - *Before*: `protected URI _maintainer`
    - *New*: `protected URI _maintainer` and `protected Participant _maintainerAsParticipant`
  - e.g. `ids:offeredResource`
    - *Before*: `protected List<Resource> _offeredResource`
    - *New*: `protected List<Resource> _offeredResource` and `protected List<URI> _offeredResourceAsUri`
- The two fields representing the same property cannot be used in parallel. This means that setting the value for one of the fields deletes the value in the other one.
- While the handling of the Java objects requires the user to use different fields for URIs or complex objects, in RDF the property can be used in the same way for both options.
  - e.g. `ids:maintainer`
    - *JSON-LD*:
      ```
        {
          ...
          "ids:maintainer": {
            "@id": "https://example.org/maintainer/m1"
          }
          ...
        }
        ```
        OR
        ```
        {
          ...
          "ids:maintainer": {
            "@id": "https:example.org/maintainer/m2",
            "@type": "ids:Participant",
            // add more properties here
          }
          ...
        }
        ```
    - *Java*:
      ```
      BaseConnector baseConnector = new BaseConnectorBuilder()
            .maintainer(URI.create("https://example.org/maintainer/m1"))
            ...
            .build();
      ```
      OR
      ```
      BaseConnector baseConnector = new BaseConnectorBuilder()
            ._maintainerAsParticipant(new ParticipantBuilder(URI.create("https://example.org/maintainer/m2"))
                  // add more properties here
                  ...
                  .build())
            ...
            .build();
      ```

## Added
- Additional field with getter and setter methods for all affected properties, i.e. `_curatorAsParticipant`, `_maintainerAsParticipant`, `_memberAsUri`, `_offeredResourceAsUri`, `_requestedResourceAsUri`.
- Additional method for each affected property `public UriOrModelClass get<propertName>AsObject()`. This returns an object of the *new* helper class `UriOrModelClass` from the `de.fraunhofer.iais.eis.util`-package. This is only for serialization purposes and is **not** supposed to be used directly. For access to the information content of the now two fields for some properties it is **highly recommended** to use the dedicated getter methods for these fields.

## [4.2.6] - 2021-10-25
### Changed - MediaTypes
- Reverted the changes from version 4.2.5 to the *old* handling of MediaTypes from version 4.2.4 and before. MediaType, CustomMediaType and IanaMediaType are represented with interface, implementation and builder classes again.
- *affected classes*:
  - ids:AppEndpoint (ids:appEndpointMediaType)
  - ids:AppRepresentation (ids:mediaType)
  - ids:AudioRepresentation (ids:mediaType)
  - ids:DataRepresentation (ids:mediaType)
  - ids:ImageRepresentation (ids:mediaType)
  - ids:Representation (ids:mediaType)
  - ids:SoftwareRepresentation (ids:mediaType)
  - ids:TextRepresentation (ids:mediaType)
  - ids:VideoRepresentation (ids:mediaType)

### Deleted
- enum MediaType
- enum CustomMediaType
- enum IanaMediaType

### Added
- interface MediaType
- interface CustomMediaType, class CustomMediaTypeBuilder, class CustomMediaTypeImpl
- interface IanaMediaType, class IanaMediaTypeBuilder, class IanaMediaTypeImpl


## [4.2.5] - 2021-10-05
### Changed - MediaTypes
- `MediaType` handling changed from interfaces and classes to enums.
  - *Before*: Create a CustomMediaType or IanaMediaType with the respective builder class.
  - *New*: Use the predefined enum instances. Available instances `MediaType.JSON`, `MediaType.OTHER_MEDIATYPE`, `CustomMediaType.OTHER_MEDIATYPE`, `IanaMediaType.JSON` .
  - *affected classes*:
    - ids:AppEndpoint (ids:appEndpointMediaType)
    - ids:AppRepresentation (ids:mediaType)
    - ids:AudioRepresentation (ids:mediaType)
    - ids:DataRepresentation (ids:mediaType)
    - ids:ImageRepresentation (ids:mediaType)
    - ids:Representation (ids:mediaType)
    - ids:SoftwareRepresentation (ids:mediaType)
    - ids:TextRepresentation (ids:mediaType)
    - ids:VideoRepresentation (ids:mediaType)

### Deleted
- interface MediaType
- interface CustomMediaType, class CustomMediaTypeBuilder, class CustomMediaTypeImpl
- interface IanaMediaType, class IanaMediaTypeBuilder, class IanaMediaTypeImpl

### Added
- enum MediaType
- enum CustomMediaType
- enum IanaMediaType

## [4.2.4] - 2021-09-21
### Changed
- replaced processing of `byte[]` fields in the `hashCode()` method to using `Arrays.hashCode`.

## [4.2.3] - 2021-09-07
*no changes*, just updating version number for alignment with other IDS tools.

## [4.2.1] - 2021-08-30
*no changes*, just updating version number for alignment with other IDS tools.

## [4.2.0] - 2021-08-16
*no changes*, just updating version number for alignment with other IDS tools.

## [4.1.3] - 2021-08-16
### Changed
- `ids:paymentModality` in `ids:Resource` changed from `protected List<PaymentModality> _paymentModality` to single field `protected PaymentModality _paymentModality;`.
  - *affected classes*:
    - ids:AppResource
    - ids:AudioResource
    - ids:DataResource
    - ids:ImageResource
    - ids:Resource
    - ids:SoftwareResource
    - ids:TextResource
    - ids:VideoResource

## [4.1.2] - 2021-07-30
### Added
- `ids:Representation` is now a subclass of `ids:Described`. Therefore, the properties `ids:title`, `ids:description` are added in ids:AppRepresentation, ids:AudioRepresentation, ids:DataRepresentation, ids:ImageRepresentation, ids:Representation, ids:SoftwareRepresentation, ids:TextRepresentation, ids:VideoRepresentation
- New `ids:Frequency` instances (`EVERY_1_MINUTES`, `EVERY_5_MINUTES`, `EVERY_10_MINUTES`, `EVERY_15_MINUTES`, `EVERY_30_MINUTES`, `HOURLY`, `BIHOURLY`, `EVERY_THREE_HOURS`, `TWO_TIMES_A_DAY`)
- `ids:CommandMessage` has a implementation and builder class now.

## [4.1.1] - 2021-07-19
### Changed
- removed unused import statements
- removed redundant javadoc from impls
- removed redundant `public` declaration of interface methods
- most of the javadoc is now in interfaces
- `@JsonProperty`-Annotation in interfaces
- all classes extend a new common interface `ModelClass` defining the standard methods
- builder and impl methods are not `final` anymore
- `@Override` for getter and setter methods in impls
- all lists are initialized as `new ArrayList<>()`
- `toString()` now generates the same output as `toRdf()`


### Added
- interfaces declare setter methods (previously, only getter methods)
- new *beta* method `deepCopy()` for every impl
- builder have a common interface `Builder<T>`
- builder have additional methods for adding a single value to a list:
    - e.g. for a property like `List<String> _legalName` in the respective builder there only was one method to update the whole list providing a new list:
        ```java
        public ParticipantBuilder _legalName_(List<String> _legalName_) {
            this.participantImpl.setLegalName(_legalName_);
            return this;
        }
        ```
    - now there is also a builder method to add a single element to the existing list:
        ```java
        public ParticipantBuilder _legalName_(String _legalName_) {
            this.participantImpl.getLegalName().add(_legalName_);
            return this;
        }
        ```
