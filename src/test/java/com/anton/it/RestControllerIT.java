package com.anton.it;

import org.junit.Before;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import java.util.Properties;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Anton Hajdinaj
 */
public class RestControllerIT {


    private Client client;
    private WebTarget target;

    @Before
    public void before() throws Exception {
        Properties props = new Properties();
        System.out.println("TEST");

        String port = System.getProperty("wildfly.remote.port");
        if (port != null) {
            props.setProperty("remote.connection.default.port", port);
        }

        client = ClientBuilder.newClient();
//        target = client.target("http://localhost:" + port + "/rest");
        target = client.target("http://localhost:38001/tests/rest");
    }


    @Test
    public void test() {
        String result = target.path("/home").request().get(String.class);

        assertThat(result).isEqualTo("hello");
    }

}
