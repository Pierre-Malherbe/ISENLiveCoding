package com.isen.demoasm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ASMController {
    @GetMapping("/")
    public String mainController() {
        return "J'aime l'ASM !";
    }
}
