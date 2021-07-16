# Changelog for Java Representation of Information Model Version 4.1 (Infomodel Nightly 2021-07-XX)
**Changes:**
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


**New features:**
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