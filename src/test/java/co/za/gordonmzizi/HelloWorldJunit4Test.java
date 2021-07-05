package co.za.gordonmzizi;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldJunit4Test {

    @Test
    public void getNumber() {
        HelloWorldJunit4 helloWorldJunit4 = new HelloWorldJunit4();
        assertEquals(100,helloWorldJunit4.getNumber());
    }
}