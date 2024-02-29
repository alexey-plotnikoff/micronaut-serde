Micronaut 4.3.4 with `micronaut-serde-jackson`.
`@JsonValue` doesn't work.

Run application:

```
./gradlew run
```

Run and application prints

```
body: {"courier":"UPS_MAIL_INNOVATION"}
```

but should print:

```
body: {"courier":"ups-mi"}
```
