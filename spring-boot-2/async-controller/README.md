# Async Controller

* Problem Statement
```
Consume 3 API asynchronously. Return final response wrapping response of 3 API calls. 3 API calls run in parallel
```

## Create project using maven
```
mvn archetype:generate -DgroupId=async.controller -DartifactId=async-controller -Dversion=1.0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

## Add gradle
```
gradle init --type pom
```

## Versions
* Maven **3.5.2**
* Gradle **5.0**

## Steps
* Add spring boot dependencies. Refer [pom.xml](pom.xml) or [build.gradle](build.gradle)
* Create [config](async/controller/config/AppConfig.java) class. Declare annotation **org.springframework.scheduling.annotation.EnableAsync**
* Create [service](async/controller/service/AsyncService.java) class. Declare methods calling API with annotation **org.springframework.scheduling.annotation.Async**
* All async methods in service class return **java.util.concurrent.CompletableFuture**
* Create [controller](async/controller/controller/AsyncController.java). Call API consuming method in service class

## API
* Refer [files](files)

## Run this project
* Import project into IDE as Maven or Gradle project
* Execute App class in each package

## Run using maven
```
mvn clean compile spring-boot:run
```

## Run using gradle
```
gradlew clean compileJava bootRun
```

## Create package using maven
```
mvn clean compile package
```

## Create package using gradle
```
gradlew clean compileJava build
```

## Execute jar
```
java -jar [path-to-jar]\async-controller.jar
```