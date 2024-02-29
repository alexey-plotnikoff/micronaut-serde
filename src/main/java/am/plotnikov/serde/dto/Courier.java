package am.plotnikov.serde.dto;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Courier {

    UPS("ups"),
    USPS("usps"),
    UPS_MAIL_INNOVATION("ups-mi"),
    ASENDIA("asendia-usa"),
    DHL("dhl-gm");

    private final String code;

    Courier(String code) {
        this.code = code;
    }

    @JsonValue
    public String getCode() {
        return code;
    }
}
