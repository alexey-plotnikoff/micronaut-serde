Micronaut 4.3.4 with `micronaut-serde-jackson`.
`@JsonValue` doesn't work.

Run application:
```
./gradlew run
```

and you will see:
```
body: {"courier":"UPS_MAIL_INNOVATION"}
```
but should be:
```
body: {"courier":"ups-mi"}
```

Issue [#780](https://github.com/micronaut-projects/micronaut-serialization/issues/780).