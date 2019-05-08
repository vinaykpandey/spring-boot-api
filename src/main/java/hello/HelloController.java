package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "V.22222222222222222222222222222222222222222222222222222222222222222222222222222222222";
    }
    
}
