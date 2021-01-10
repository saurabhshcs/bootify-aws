# bootify-aws Introduction

This application is basically containing the examples of the Amazon Web Service - Simple Notification Service (Which was the amazon's first web service that was introdiced the world a decade ago.) and amazon's Simple Queue service to provide facilitate event sourcing to your application.

# How to run this application

## Machine Prerequisite
- Java 8 or later
- Docker
- Docker compose

Both docker and docker compose come with an installation of Docker Desktop. 


To clone this repository AND all submodules execute the following:
```
git clone https://github.com/saurabhshcs/bootify-aws.git
```

## Local environment

In order to run the Integration tests a Postgres database is required.

In order to run this service locally, an ActiveMQ service is required. 

Create Postgres database and ActiveMQ service with docker-compose:
 
```
docker-compose up -d
```

This will install and setup Postgres database with correct database name, username and password,
likewise for ActiveMQ.

### Running service for the first time
In order to force the download of dependencies outside of IntelliJ:

`./gradlew build --refresh-dependencies`

### Run any service

`./gradlew bootRun`

### Test and build

#### Run tests (also runs big tests)
`./gradlew clean test`

#### Run big tests only
`./gradlew clean bigTest`

#### Build conditionally on tests
`./gradlew clean build`  


