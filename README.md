# Spring Boot Auth Server [![Build Status](https://travis-ci.org/aukhatov/spring-boot-auth.svg?branch=master)](https://travis-ci.org/aukhatov/spring-boot-auth)
## Build Jar

```shell
./gradlew clean build
```

## Launch

```shell
java -jar build/libs/auth-server-0.1.0.jar
```

## Build Docker Image

```shell
./gradlew clean buildImage
```

## Launch Docker Container

```shell
docker run -ti --rm -p 8100:8100 aukhatov/srping-boot-auth-server:0.1.0
```

## Get auth token
```shell
curl aaukhatov:ZAQxsw2@localhost:8100/oauth/token -d grant_type=password -d username=arthur -d password=secret
```
