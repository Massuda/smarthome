package helloworld;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "helloWorld", eager = true)
public class HelloWorld {
    public HelloWorld() {
        System.out.println("HelloWorls started!");
    }

    public String getMessage() {
        return "Hello World!";
    }
}