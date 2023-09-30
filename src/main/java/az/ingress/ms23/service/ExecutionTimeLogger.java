package az.ingress.ms23.service;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.function.Consumer;

@Aspect
@Component
@Slf4j
public class ExecutionTimeLogger {
    @Pointcut("execution( * az.ingress.ms23.service.HelloServiceImpl.*(..))")
    public void logExecutionTimePc(){

    }
    @Around(value = "logExecutionTimePc()")
    @SneakyThrows
    public void logExecutionTime(ProceedingJoinPoint pc) {
        long started = System.currentTimeMillis();
        log.info("Shahindi bratva");
        pc.proceed();
        long ended = System.currentTimeMillis();
        log.info("Elapsed Time {}",ended-started);
    }
    @SneakyThrows
    @Before(value = "logExecutionTimePc()")
    public void logExecutionTime(JoinPoint joinPoint){
        Arrays.stream(joinPoint.getArgs())
                .forEach((arg)->log.info("arguments are {}",arg));
    }
}
