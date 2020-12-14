package com.rest.webservices.restfulwebservices.helloWorld;

public class HelloWorldBean {

    String helloWorld;

    public HelloWorldBean(String helloWorld) {
        this.helloWorld = helloWorld;
    }

    public String getHelloWorld() {
        return helloWorld;
    }

    public void setHelloWorld(String helloWorld) {
        this.helloWorld = helloWorld;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "helloWorld='" + helloWorld + '\'' +
                '}';
    }
}
