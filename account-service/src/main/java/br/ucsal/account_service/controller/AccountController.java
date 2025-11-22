package br.ucsal.account_service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class AccountController {

    @Value("${account.message}")
    private String message;

    @Value("${account.daily-limit}")
    private Integer dailyLimit;

    @GetMapping("/config")
    public String getConfig() {
        return "Mensagem: " + message + " | Limite Diário: " + dailyLimit;
    }
}
