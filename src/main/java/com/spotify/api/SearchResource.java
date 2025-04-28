package com.spotify.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/search")
public class SearchResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String testAPI() {
        return "API funzionante! 🎶";
    }
}
