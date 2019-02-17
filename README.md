# Open Bank API demo

This is project is to demonstrate OpenAPI 3.0 and OAuth2 technology.

`cds.yaml` is the API spec in OpenAPI 3.0 format. It is converted from [the doc in OpenAPI 2.0 format](https://raw.githubusercontent.com/ConsumerDataStandardsAustralia/standards/master/swagger-gen/cds_full.json). 

The spec exposes a set of banking related APIs and a common customer API. I have added OAuth2 security scheme onto it.

The `server` folder contains 2 projects:
* `auth` is the OAuth2 server
* `resource` is the Resource server (API end points provider)

Both projects are implemented with Spring boot 2 framework.



### System requirements:

1. Install [JDK 8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

2. Install [Maven 3](https://maven.apache.org/download.cgi)

### Get started

1. Open a terminal and navigate to `server/auth` folder and run `mvn spring-boot:run` to start OAuth2 server at http://localhost:9090
2. Open another terminal navigate to `server/resource` folder and run `mvn spring-boot:run` to start Resource server at http://localhost:8080
3. Open a browser and navigate to http://localost:8080 and you should see the swagger UI.
![Screen](screen.png)
