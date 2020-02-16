package org.volodich.pc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class ProductHelloController {
    @Value("${app.helloString}")
    private String helloString;

    @GetMapping
    public String sayHello() {
        return "Hello from " +helloString;
    }
}
