# Java Representation of the IDS Information Model
This repository contains the Java source files of `de.fraunhofer.iais.eis.ids.infomodel:java:<version>` [maven artifact](https://maven.iais.fraunhofer.de/ui/repos/tree/General/eis-ids-public/de/fraunhofer/iais/eis/ids/infomodel/java) in the latest version. These are generated automatically using the International Data Spaces Java Code Generation Tool on and are based on the [InformationModel](https://github.com/International-Data-Spaces-Association/InformationModel).

## Usage
### Preparation
To use the Java classes in a maven project, add the following dependency to your `pom.xml` and replace `X.X.X` with your desired version number (e.g. `5.0.3`):

```xml
<dependency>
    <groupId>de.fraunhofer.iais.eis.ids.infomodel</groupId>
    <artifactId>java</artifactId>
    <version>X.X.X</version>
</dependency>
```

### Object Creation

Now, a Java representation of a `ids:TextResource` can be created in the following way:
```Java
import de.fraunhofer.iais.eis.*;

...

TextResource textResource = new TextResourceBuilder()
    ._version_("1.0")
    ._title_(new TypedLiteral("European highway statistics", "en"))
    ._description_(new TypedLiteral("Detailed traffic analysis report based on European highway statistics data 2000 - 2017.", "en"))
    ._keyword_(
        List.of(
            new TypedLiteral("report"),
            new TypedLiteral("highway"),
            new TypedLiteral("statistics"),
            new TypedLiteral("Europe")
        )
    )
    ._language_(Language.EN)
    ._representation_(
        new RepresentationBuilder()
            ._instance_(new ArtifactBuilder()
                ._fileName_("traffic-analysis-statistics-europe.pdf")
                ._checkSum_("9fbec0317bee2d81e64d0bd2315954f672c02335fa7dc30a50c7f818b36e12c9")
                .build()
            )
            ._mediaType_(new IANAMediaTypeBuilder(
                URI.create("https://www.iana.org/assignments/media-types/application/pdf")).build())
            .build()
    )
    .build();
```

Creating a `ids:BaseConnector` that contains the the `ids:TextResource` defined above can be done in the following way:
```Java
BaseConnector baseConnector = new BaseConnectorBuilder()
    ._curatorAsUri_(URI.create("http://example.com/participant/curator/1"))
    ._hasAgent_(URI.create("http://example.com/participant/agent/2"))
    ._maintainerAsObject_(new ParticipantBuilder(URI.create("http://example.com/participant/maintainer/1"))
        ._version_("2")
        ._legalForm_("Some legal form")
        ._corporateEmailAddress_("maintainer@example-connector.de")
        ._primarySite_(new SiteBuilder()
            ._siteAddress_("https://maintainer.example.de/")
            .build()
        )
        ._description_(new TypedLiteral("Example maintainer of the connector.", "en"))
        .build()
    )
    ._hasDefaultEndpoint_(new ConnectorEndpointBuilder()
        ._accessURL_(URI.create("http://example.com/endpoint/1"))
        .build()
    )
    ._inboundModelVersion_("4.4.4")
    ._outboundModelVersion_("4.4.4")
    ._securityProfile_(SecurityProfile.BASE_SECURITY_PROFILE)
    ._resourceCatalog_(new ResourceCatalogBuilder()
        ._offeredResourceAsObject_(textResource)
        .build()
    )
    .build();
```
By doing so a Java representation of the following `ids:BaseConnector` (serialized in JSON-LD) has been created:
```JSON
{
  "@context" : {
    "ids" : "https://w3id.org/idsa/core/",
    "idsc" : "https://w3id.org/idsa/code/"
  },
  "@type" : "ids:BaseConnector",
  "@id" : "https://w3id.org/idsa/autogen/baseConnector/7196c6b0-6a4f-4606-ba4f-fc1f31e2a783",
  "ids:securityProfile" : {
    "@type" : "ids:SecurityProfile",
    "@id" : "https://w3id.org/idsa/code/BASE_SECURITY_PROFILE"
  },
  "ids:outboundModelVersion" : "4.4.4",
  "ids:inboundModelVersion" : [ "4.4.4" ],
  "ids:hasDefaultEndpoint" : {
    "@type" : "ids:ConnectorEndpoint",
    "@id" : "https://w3id.org/idsa/autogen/connectorEndpoint/97852304-bac8-4639-85b6-2c5f585ddfdc",
    "ids:accessURL" : {
      "@id" : "http://example.com/endpoint/1"
    }
  },
  "ids:hasAgent" : [ {
    "@id" : "http://example.com/participant/agent/2"
  } ],
  "ids:curator" : {
    "@id" : "http://example.com/participant/curator/1"
  },
  "ids:resourceCatalog" : [ {
    "@type" : "ids:ResourceCatalog",
    "@id" : "https://w3id.org/idsa/autogen/resourceCatalog/aa30b0e9-9470-423c-aa25-05e900b4babe",
    "ids:requestedResource" : [ ],
    "ids:offeredResource" : [ {
      "@type" : "ids:TextResource",
      "@id" : "https://w3id.org/idsa/autogen/textResource/0942f57c-89d3-4f6e-ae79-38ab9229966e",
      "ids:representation" : [ {
        "@type" : "ids:Representation",
        "@id" : "https://w3id.org/idsa/autogen/representation/cf4d74ad-6fdb-459b-8878-e1cd3cb5b1a4",
        "ids:instance" : [ {
          "@type" : "ids:Artifact",
          "@id" : "https://w3id.org/idsa/autogen/artifact/0db30d80-f1cd-4224-b5b5-129853e90ac0",
          "ids:checkSum" : "9fbec0317bee2d81e64d0bd2315954f672c02335fa7dc30a50c7f818b36e12c9",
          "ids:fileName" : "traffic-analysis-statistics-europe.pdf"
        } ],
        "ids:mediaType" : {
          "@type" : "ids:IANAMediaType",
          "@id" : "https://www.iana.org/assignments/media-types/application/pdf"
        }
      } ],
      "ids:keyword" : [ {
        "@value" : "report",
        "@type" : "http://www.w3.org/2001/XMLSchema#string"
      }, {
        "@value" : "highway",
        "@type" : "http://www.w3.org/2001/XMLSchema#string"
      }, {
        "@value" : "statistics",
        "@type" : "http://www.w3.org/2001/XMLSchema#string"
      }, {
        "@value" : "Europe",
        "@type" : "http://www.w3.org/2001/XMLSchema#string"
      } ],
      "ids:title" : [ {
        "@value" : "European highway statistics",
        "@language" : "en"
      } ],
      "ids:version" : "1.0",
      "ids:description" : [ {
        "@value" : "Detailed traffic analysis report based on European highway statistics data 2000 - 2017.",
        "@language" : "en"
      } ],
      "ids:language" : [ {
        "@type" : "ids:Language",
        "@id" : "https://w3id.org/idsa/code/EN"
      } ]
    } ]
  } ],
  "ids:maintainer" : {
    "@type" : "ids:Participant",
    "@id" : "http://example.com/participant/maintainer/1",
    "ids:version" : "2",
    "ids:description" : [ {
      "@value" : "Example maintainer of the connector.",
      "@language" : "en"
    } ],
    "ids:corporateEmailAddress" : [ "maintainer@example-connector.de" ],
    "ids:primarySite" : {
      "@type" : "ids:Site",
      "@id" : "https://w3id.org/idsa/autogen/site/3a655b13-a3a3-4d09-a1c2-03395e0a57c2",
      "ids:siteAddress" : "https://maintainer.example.de/"
    },
    "ids:legalForm" : "Some legal form"
  }
}
```