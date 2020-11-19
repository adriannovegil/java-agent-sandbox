# Java Agents Examples

Examples about how to implement a Java Agent using different approaches

## Build the project

To buid the project, you have to execute the following command:

```
 $ ./mvnw clean install
```

## Run experiments

__Byte Buddy examples__

 * `java -javaagent:byte-buddy/get-methods/target/byte-buddy-get-methods-0.0.1-SNAPSHOT.jar -jar example-apps/basic-app/target/basic-app-0.0.1-SNAPSHOT.jar`
 * `java -javaagent:byte-buddy/execution-time/target/byte-buddy-execution-time-0.0.1-SNAPSHOT.jar -jar example-apps/basic-app/target/basic-app-0.0.1-SNAPSHOT.jar`
 * `java -javaagent:byte-buddy/constructor-instrument/target/byte-buddy-constructor-instrument-0.0.1-SNAPSHOT.jar -jar example-apps/basic-app/target/basic-app-0.0.1-SNAPSHOT.jar`
 * `java -javaagent:byte-buddy/add-field/target/byte-buddy-add-field-0.0.1-SNAPSHOT.jar -jar example-apps/basic-app/target/basic-app-0.0.1-SNAPSHOT.jar`
 * `java -javaagent:byte-buddy/add-method/target/byte-buddy-add-method-0.0.1-SNAPSHOT.jar -jar example-apps/basic-app/target/basic-app-0.0.1-SNAPSHOT.jar`
 * `java -javaagent:byte-buddy/ignore-class/target/byte-buddy-ignore-class-0.0.1-SNAPSHOT.jar -jar example-apps/basic-app/target/basic-app-0.0.1-SNAPSHOT.jar`
 * `java -javaagent:byte-buddy/get-parameters/target/byte-buddy-get-parameters-0.0.1-SNAPSHOT.jar -jar example-apps/basic-app/target/basic-app-0.0.1-SNAPSHOT.jar`
 * `java -javaagent:byte-buddy/ignore-class/target/byte-buddy-ignore-class-0.0.1-SNAPSHOT.jar -jar example-apps/basic-app/target/basic-app-0.0.1-SNAPSHOT.jar`