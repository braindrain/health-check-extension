# quarkus-health-check-extension
Quarkus Extension Demo

Adds health-check endpoint to Quarkus application: 
`/health`

#Installation steps:
* mvn clean install
* add maven dependency to Quarkus project: 
```
  <dependency>
            <groupId>com.workshop</groupId>
            <artifactId>health-check-extension</artifactId>
            <version>1.0.0-SNAPSHOT</version>
  </dependency>
```

```
2023-02-23 17:42:24,636 INFO  [io.quarkus] (Quarkus Main Thread) Installed features: [..., health-check-extension, ...]
```
