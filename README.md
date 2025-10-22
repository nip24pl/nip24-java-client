# NIP24 Client for Java

This is the official repository for [NIP24](https://nip24.pl) Client for Java

This library contains validators for common Polish tax numbers like NIP, REGON and KRS. Validators for EU VAT ID
and IBAN are also included. After registration at [NIP24](https://nip24.pl) Portal this library could be used for
various on-line validations of Polish and EU companies. Please, visit our web page for more details.

## Documentation

The documentation and samples are available [here](https://nip24.pl/dokumentacja/).

## Build

OpenJDK 11+ and Apache Maven 3.8+ are required to build this library. The Javadoc JAR and sources JAR
will be built as well. 

```bash
git clone https://github.com/nip24pl/nip24-java-client.git
cd nip24-java-client
mvn package
```

To use the built version locally in your project, install it into your local Maven repository.

```bash
mvn install
```

## How to use

Add the following dependency to your project's POM:

```xml
<dependency>
    <groupId>pl.nip24</groupId>
    <artifactId>nip24-client</artifactId>
    <version>1.4.4</version>
</dependency>
```

The release version of the library is also published in our Maven repository. If you don't want to build the library
yourself, you can use our published version from this location:

```xml
<repository>
    <id>nip24</id>
    <url>https://www.nip24.pl/maven/releases</url>
</repository>
```

## License

This project is delivered under Apache License, Version 2.0:

- [![License (Apache 2.0)](https://img.shields.io/badge/license-Apache%20version%202.0-blue.svg?style=flat-square)](http://www.apache.org/licenses/LICENSE-2.0)