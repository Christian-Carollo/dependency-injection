package co.develhope.dependencyinjection.services;

import co.develhope.dependencyinjection.components.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private MyComponent myComponent;

    @Autowired
    public MyService(MyComponent myComponent){
        System.out.println("MyService costruttore è stato chiamato");
        this.myComponent = myComponent;
    }

    public String getName(){
        System.out.println("MyService.getName() è stato chiamato");
        return myComponent.getMyComponentName();
    }

}
