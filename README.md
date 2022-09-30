# Mars Sim REST Pilot

This project is a simple SpringBoot RestAPI server to prototype an API for the mars-sim project to support a ReactJS client.

## Projects
There are 2 sub-projects:

### Rest-server
A Spring boot Java app that provides a RestAPI of entities. It uses the [MapStruct](https://mapstruct.org) to automatically generate the mapping code from the model objects to the various DTO equivalents. There is a _model_ package that emulates the model objects of the Simulation. The package _dto_ contains the DTO exposed to the client. The _mapper_ package contains the Mappers that define any custom mappings needed for the DTOs. MapStruct has a default mapping logic but it can be overridden.

The Rest API is exposed under the _/api_ endpoint and follows the standard approach of entity & idenfitier as URL paths. Filters applied as request parameters.

Also it uses [Lombok](https://projectlombok.org/features/all) to reduce the amount of code needed in the DTOs. In addition has the Swagger UI enabled.

The App can proivde access to the production compiled ReactJS client.

### ReactJS-client
This is a ReactJS clients using the ResetAPI provided by the rest-server. This is a standard NPM application but also has a Maven POM as well to compile the client from scratch to be inculded in the rest-server deployment. Note this installs a local transient copy of `npm`.

It heavily uses some `Components` that are customatumised to support the concepts of the simulation.

## Building/Running
The whole solution can be compiled by running
>mvn package

This will compile the ReactJS app into the production ready JavaScript representation. These script will then be copied into the rest-server JAr as well. The server app is run via
> mvn spring-boot:run

Once deployed the following URL are available:
- http://localhost:8080/ - The ReactJS application
- http://localhost:8080/swagger-ui/index.html - Swagger UI of the provided RestAPI
- http://localhost:8080/api - The RestAPI endpoint

For development the ReactJS can also be run directly using `npm`
> npm start

The application is exposed on http://localhost:3000
In this mode changes to ReactJS code will be immediately available. To avoid CORS problems, the `package.json` defines a proxy for the api to automatically redirect to teh real Rest server on http://localhost:8080

## Building the Docker Image
The Spring Boot jar must contain all dependencies, Spring boot provides support for this.
> cd rest-server
>
> mvn package spring-boot:repackage

Note that the 'package' must be included on the same execution. Then a Docket images can be created
> docker build . -t <image name>
>
> docket run -dp 8080:8080 <image name>
>
> docker push <image name> 