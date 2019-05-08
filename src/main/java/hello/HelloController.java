package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Auto Build : Hey !!!! Its done us-central1-a  !!!! Cool !!! ";
    }
    
}
