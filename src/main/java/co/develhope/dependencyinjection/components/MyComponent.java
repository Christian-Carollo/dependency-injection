package co.develhope.dependencyinjection.components;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private String myComponentName;

    public MyComponent(){
        System.out.println("MyComponent costruttore è stato chiamato");
        this.myComponentName = "Christian Carollo";
    }

    public String getMyComponentName(){
        System.out.println("MyComponent.getMyComponentName() è stato chiamato");
        return myComponentName;
    }

}
