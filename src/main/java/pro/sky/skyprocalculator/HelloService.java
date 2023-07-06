package pro.sky.skyprocalculator;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String hello() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }
}
