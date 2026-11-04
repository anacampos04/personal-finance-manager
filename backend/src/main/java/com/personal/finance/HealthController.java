package com.personal.finance;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/api/health")
    public String checkHealth() {
        return "Backend de Finanzas funcionando correctamente (sin BBDD)";
    }
}