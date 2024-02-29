package am.plotnikov.serde;

import am.plotnikov.serde.dto.Courier;
import am.plotnikov.serde.dto.Request;
import io.micronaut.runtime.Micronaut;
import io.micronaut.serde.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws IOException {
        var context = Micronaut.run(Application.class, args);

        var request = new Request(Courier.UPS_MAIL_INNOVATION);
        var body = context.getBean(ObjectMapper.class).writeValueAsString(request);

        log.info("body: {}", body);

        System.exit(0);
    }
}