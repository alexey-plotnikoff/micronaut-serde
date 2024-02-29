package am.plotnikov.serde.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public record Request(
        Courier courier
) {
}
