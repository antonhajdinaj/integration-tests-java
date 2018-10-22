package com.anton.it;

import org.junit.Ignore;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Anton Hajdinaj
 */
@Ignore
public class HelloTest {


    private Hello hello = new HelloImpl();

    @Test
    public void test() {
        assertThat(hello.sayHello()).isEqualTo("Hello from Anton");
    }

}
