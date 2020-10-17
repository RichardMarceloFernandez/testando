package br.edu.usj.ads.lpii.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
        
    @GetMapping(value="helloworld")
    public String getHelloWorld() {
        return "Wello World!";
    }
    
}