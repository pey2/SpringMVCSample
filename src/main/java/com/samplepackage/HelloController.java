package com.samplepackage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/")
    public String display() {
        return "index";
    }

    @RequestMapping("/viewpage")
        public String viewPage() {
            return "viewpage";
        }
    @RequestMapping("/final")
        public String finalPage() {
            return "final";
    }
}
