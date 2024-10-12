package be.jetacademie.mentoring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/jet-academy")
    public String jetAcademy() {
        return "index";
    }

    @GetMapping("/library")
    public String digitalLibrary() {
        return "library";
    }

    @GetMapping("/mentoring")
    public String digitalMentoring() {
        return "mentoring";
    }


}
