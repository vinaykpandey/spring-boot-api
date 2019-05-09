package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "V.6.0, Auto Build, Need to Deploy New Image using Kubectl set Image !! GKE  !! V.6.0 !!";
    }
    
}
