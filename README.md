# random

A Java library for random

# Features
- Random Picker:
## Targets

La idea del Target es asignarle un valor de superficie  para que luego el PackTarget, compuesto de Target, lance un 'dart' a la superficie formada por todos los Target que contiene. El Target alcanzado por el 'dart' será el escogido aleatoriamente.

### Download
- Gradle:
Add Repository:
```gradle
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

Add Dependency:
```gradle
dependencies {
  implementation 'com.github.ByDSA:random:1.0'
}
```

- Maven:
Add Repository:
```xml
<repositories>
	<repository>
		<id>jitpack.io</id>
		<url>https://jitpack.io</url>
	</repository>
</repositories>
```

Add Dependency:
```xml
<dependency>
	<groupId>com.github.ByDSA</groupId>
	<artifactId>random</artifactId>
	<version>1.0</version>
</dependency>
```
[random 1.0 jar](https://github.com/ByDSA/random/releases/download/1.0/es.dsa-random-1.0.jar) download are available from Github project's Releases.

[![Build Status](https://travis-ci.org/ByDSA/random.svg?branch=master)](https://travis-ci.org/ByDSA/random)

### Source Code
```sh
$ git clone https://github.com/ByDSA/random
```

or

```sh
$ git clone https://gitlab.com/danisales/random
```