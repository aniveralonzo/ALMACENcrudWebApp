package edu.academik.telus.almacencrudwebapp.controller;

import edu.academik.telus.almacencrudwebapp.service.ProveedorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {

    @GetMapping("/index")
    public String get(Model model) {
        model.addAttribute("proveedorList",ProveedorService.proveedorList);
        return "index";
    }
}


