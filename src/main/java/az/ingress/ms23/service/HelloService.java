package az.ingress.ms23.service;

import az.ingress.ms23.dto.XDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service

public interface HelloService {
    XDto sayHello1(String language);
    XDto sayHello2();
    XDto sayHello3();

}
