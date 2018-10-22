package com.anton.it;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.Properties;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Anton Hajdinaj
 */
@Ignore
public class HelloTestIT {

    Context context;
    Hello hello;

    @Before
    public void before() throws Exception {
        Properties props = new Properties();

        String port = System.getProperty("wildfly.remote.port");
        if (port != null) {
            props.setProperty("remote.connection.default.port", port);
        }

        context = new InitialContext(props);
        hello = (Hello) context.lookup("ejb:/it//HelloImpl!com.anton.it.Hello");
    }

    @After
    public void after() throws Exception {
        if (context != null) {
            context.close();
        }
    }

    @Test
    public void test() {
        assertThat(hello.sayHello()).isEqualTo("Hello from Anton");
    }

}
