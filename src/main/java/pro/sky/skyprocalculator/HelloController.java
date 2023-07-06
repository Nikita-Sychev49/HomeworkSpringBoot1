package pro.sky.skyprocalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final HelloService helloService;

    private final CalculationsService calculationsService;

    public HelloController(HelloService helloService, CalculationsService calculationsService) {
        this.helloService = helloService;
        this.calculationsService = calculationsService;
    }

    @GetMapping(path = "/calculator")
    public String hello() {
        return helloService.hello();
    }

    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam("num1")int number1, @RequestParam("num2")int number2) {
        return calculationsService.plus(number1, number2);
    }

    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculationsService.minus(number1, number2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculationsService.multiply(number1, number2);
    }

    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculationsService.divide(number1, number2);
    }
}
