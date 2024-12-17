package com.tekarch.accountmanagementMS.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/account")
    public String createAccount()
    {
        return "This is account management microservice";
    }

}
