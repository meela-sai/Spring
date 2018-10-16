package us.mi.state.dhs.bridges.ws.rest.test;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    @Autowired
    private Greeting greet;

    @RequestMapping(value = "/greeting", produces = "application/vnd.api.v1+json")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
    	if(name.equalsIgnoreCase("Ravi"))
    		name = name + " Kanth" ;
         greet.setContent(String.format(template, name));
         greet.setId(counter.incrementAndGet());
         return greet;
    }
 
   
}