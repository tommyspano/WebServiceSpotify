package com.spotify.server;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.servlet.ServletContainer;

public class Main {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        ServletContextHandler context = new ServletContextHandler(server, "/");
        ServletHolder servletHolder = new ServletHolder(new ServletContainer(new org.glassfish.jersey.server.ResourceConfig()
                .packages("com.spotify.api")));
        context.addServlet(servletHolder, "/*");

        try {
            server.start();
            server.join();
        } finally {
            server.destroy();
        }
    }
}
