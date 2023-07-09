package pro.sky.skyprocalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorConroller {
    private final CalculationService calculationsService;

    public CalculatorConroller(CalculationService calculationsService) {
        this.calculationsService = calculationsService;
    }

    @GetMapping(path = "")
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1")int number1, @RequestParam("num2")int number2) {
        return calculationsService.plus(number1, number2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculationsService.minus(number1, number2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculationsService.multiply(number1, number2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        if (number2 == 0) {
            return "На ноль делить нельзя";
        }
        return calculationsService.divide(number1, number2);
    }
}
