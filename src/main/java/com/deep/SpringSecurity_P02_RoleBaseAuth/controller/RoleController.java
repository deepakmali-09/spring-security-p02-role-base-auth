package com.deep.SpringSecurity_P02_RoleBaseAuth.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RestController
public class RoleController {

    @PreAuthorize("ADMIN")
    @GetMapping("/transfer")
    public String admin() {
        return "I am Admin";
    }

    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    @GetMapping("/update")
    public String user() {
        return "I am User";
    }

}
