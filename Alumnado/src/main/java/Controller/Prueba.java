package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Prueba {
    @GetMapping("/hello")
    public String helloWorld() {
        System.out.println("Hola Mundo");
        return "Hola Mundo";
    }
}
