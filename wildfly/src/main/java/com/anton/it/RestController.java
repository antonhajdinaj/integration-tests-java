package com.anton.it;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author Anton Hajdinaj
 */
@Singleton
@Path("/")
public class RestController {

    @GET
    @Path("/home")
    public String home(){
        return "hello";
    }
}
