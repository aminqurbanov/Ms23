package az.ingress.ms23.service;

import az.ingress.ms23.dto.XDto;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@Slf4j
@RequiredArgsConstructor
public class HelloServiceImpl implements HelloService{
    @Override
    @SneakyThrows
    public XDto sayHello1(String language){
        Thread.sleep(new Random().nextInt(1000));
        return new XDto("hello world1");
    }
    @Override
    @SneakyThrows
    public XDto sayHello2(){
        Thread.sleep(new Random().nextInt(1000));
        return new XDto("hello world2");
    }
    @Override
    @SneakyThrows
    public XDto sayHello3(){
        Thread.sleep(new Random().nextInt(1000));
        return new XDto("hello world3");
    }
}
