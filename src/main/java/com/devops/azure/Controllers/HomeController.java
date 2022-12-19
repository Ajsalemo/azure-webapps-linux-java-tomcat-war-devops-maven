package com.devops.azure.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    String message = "This is a war file from Azure DevOps pipelines with the Azure Maven plugin!";

    @GetMapping("/")
    public String index() {
        return message;
    }
}
