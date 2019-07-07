package undertow.handlers;

import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;

/*
 * Depends on Metrics so it is here instead of in stubbornjava-undertow
 */
public class TimingHttpHandler implements HttpHandler {
    private final HttpHandler handler;

    public TimingHttpHandler(HttpHandler handler, String name) {
        super();
        this.handler = handler;
    }

    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {

            handler.handleRequest(exchange);

    }
}
