# rest-boot project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./gradlew quarkusDev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:

```shell script
./gradlew build
```

It produces the `quarkus-run.jar` file in the `build/quarkus-app/` directory. Be aware that it’s not an _über-jar_ as
the dependencies are copied into the `build/quarkus-app/lib/` directory.

If you want to build an _über-jar_, execute the following command:

```shell script
./gradlew build -Dquarkus.package.type=uber-jar
```

The application is now runnable using `java -jar build/quarkus-app/quarkus-run.jar`.

## Creating a native executable

You can create a native executable using:

```shell script
./gradlew build -Dquarkus.package.type=native
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./gradlew build -Dquarkus.package.type=native -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./build/rest-boot-1.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/gradle-tooling.

## Related guides

- OpenShift ([guide](https://quarkus.io/guides/openshift)): Generate OpenShift resources from annotations
- OpenShift Client ([guide](https://quarkus.io/guides/kubernetes-client)): Interact with OpenShift and develop OpenShift
  Operators
- RESTEasy JAX-RS ([guide](https://quarkus.io/guides/rest-json)): REST endpoint framework implementing JAX-RS and more
- Quarkus Extension for Spring Web API ([guide](https://quarkus.io/guides/spring-web)): Use Spring Web annotations to
  create your REST services
- SmallRye JWT ([guide](https://quarkus.io/guides/security-jwt)): Secure your applications with JSON Web Token
- Kubernetes ([guide](https://quarkus.io/guides/kubernetes)): Generate Kubernetes resources from annotations
- Quarkus Extension for Spring Boot properties ([guide](https://quarkus.io/guides/spring-boot-properties)): Use Spring
  Boot properties annotations to configure your application
- Kubernetes Client ([guide](https://quarkus.io/guides/kubernetes-client)): Interact with Kubernetes and develop
  Kubernetes Operators
- OpenID Connect ([guide](https://quarkus.io/guides/security-openid-connect)): Secure your applications with OpenID
  Connect Adapter and IDP such as Keycloak
- Quarkus Extension for Spring Cloud Config Client ([guide](https://quarkus.io/guides/spring-cloud-config-client)): Use
  properties from Spring Cloud Config as bootstrap properties sources
- Kubernetes Config ([guide](https://quarkus.io/guides/kubernetes-config)): Read runtime configuration from Kubernetes
  ConfigMaps and Secrets

## Provided examples

### RESTEasy JAX-RS example

REST is easy peasy with this Hello World RESTEasy resource.

[Related guide section...](https://quarkus.io/guides/getting-started#the-jax-rs-resources)

### Spring Web example

Spring, the Quarkus way! A Hello World Spring Web Controller.

[Related guide section...](https://quarkus.io/guides/spring-web#greetingcontroller)
