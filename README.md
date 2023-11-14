# XLTournaments API
This repository provides a stripped version of [XLTournaments](https://www.spigotmc.org/resources/xltournaments.70630/) for use of developers.

## Installation

### Maven
[![](https://jitpack.io/v/ItzSave/XLTournamentsAPI.svg)](https://jitpack.io/#ItzSave/XLTournamentsAPI)
```bash
<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>
```
```bash
<dependency>
    <groupId>com.github.ItzSave</groupId>
    <artifactId>XLTournamentsAPI</artifactId>
    <version>{VERSION}</version>
</dependency>
```

```bash
	dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}
```

```bash
	dependencies {
	        implementation 'com.github.ItzSave:XLTournamentsAPI:{VERSION}'
	}
```
