package io.vertx.example;

import io.vertx.core.Handler;
import io.vertx.core.http.HttpServerRequest;
import org.springframework.stereotype.Component;

/**
 * Created by prangain on 6/15/2016.
 */
@Component
public class SomeHandler implements Handler<HttpServerRequest> {
    @Override
    public void handle(HttpServerRequest request) {
        request.response().end("Hello World!");
    }
}
