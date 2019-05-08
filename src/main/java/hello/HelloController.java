package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "This is auto clud build, Greetings from Spring Boot, Hey run this in GKE !! ";
    }
    
}
