# vehicle-registration-info-service
This API microservice is implemented to provide Vehicle Registration information.

## What's configured
- Spring boot starter
- Basic Spring boot Actuator
- Lombok
- Junit tests

## How to run it locally
To Build the package execute below command 
```sh
mvn package
```
To Run the service execute below command
```sh
mvn spring-boot:run
```
### Test locally
Application will run on port `9556` with context path `/registration-info`

API to fetch all Astronaut list 
```sh
http://localhost:9556/registration-info/api/v1/registrations
```

API to fetch the health of service (Actuator) - 
```sh
http://localhost:9556/registration-info/actuator/health
```

## Structure

Code is structred in the following way under package

`com.snsw.vehicleregistrationinfo`

| Package | Description |
| ------ | ------ |
|`rest.registrations`|registrations controller and service classes|
|`rest.registrations.model`|registrations entity & dto classes|
|`rest.registrations.repository`|repository class extending CrudRepository interface|

### REST API Class Structure

- `RegistrationsController` - REST controller for APIs
- `RegistrationsService` - Service class for API. This is where interaction with database is made to fetch registrations details
- `RegistrationsDto` - Data Transfer Object for API `Response`
