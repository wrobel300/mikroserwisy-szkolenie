package pl.altkom.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/add/{a}/{b}")
    public double add(@PathVariable double a, @PathVariable double b) {
        return a + b;
    }

    @GetMapping("/subtract/{a}/{b}")
    public double subtract(@PathVariable double a, @PathVariable double b) {
        return a - b;
    }

    @GetMapping("/multiple")
    public double multiple(@RequestParam(name = "a") double a, @RequestParam(name = "b") double b) {
        return a * b;
    }

    @GetMapping("/divide")
    public double divide(@RequestParam(name = "a") double a, @RequestParam(name = "b") double b) {
        return a / b;
    }

}


// TODO 3 utwórz pakiet controller
// TODO 4 utwórz klasę CalculatorController
// TODO 5 zadeklaruj utworzoną klasę jako kontroler
// TODO 6 utwórz 4 metody (po utworzeniu kolejnej metody, uzupełniaj dla niej test):
/*

    każda z nich dla jednego działania arytmetycznego

    każda obsługuje GET

    Metody przyjmują 2 wartości double, zwracają wynik double

    Metoda dla dodawania i odejmowania - dla pobrania wartości argumentów z requestu, użyj @PathVariable
    przykładowa deklaracja w metodzie "/add/{n1}/{n2}", przykładowy request "/add/1/2"

    Metoda dla mnożenia i dzielenia - dla pobrania wartości argumentów z requestu, użyj @RequestParam
*/