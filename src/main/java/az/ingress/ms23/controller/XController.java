package az.ingress.ms23.controller;

import az.ingress.ms23.dto.XDto;
import az.ingress.ms23.service.HelloService;
import az.ingress.ms23.service.HelloServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hello")
public class XController {
    private final HelloServiceImpl service;
    @GetMapping("/1")
    public XDto sayHello1(){
        return service.sayHello1("engilish");

    }
    @GetMapping("/2")
    public XDto sayHello2() {
        return service.sayHello2();
    }
    @GetMapping("/3")
    public XDto sayHello3() {
        return service.sayHello3();
    }
}
