package com.anton.it;

import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * @author Anton Hajdinaj
 */
@Stateless
@Remote(Hello.class)
public class HelloImpl implements Hello {

    @Override
    public String sayHello() {
        return "Hello from Anton";
    }

}
