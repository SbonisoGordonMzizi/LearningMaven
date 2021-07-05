package co.za.gordonmzizi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Junit 5

class HelloWorldTest {

    @Test
    void getHello() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello World",helloWorld.getHello());
    }
}