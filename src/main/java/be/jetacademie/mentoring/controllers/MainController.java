package be.jetacademie.mentoring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/jet-academy")
    public String jetAcademy() {
        return "jetAcademy"; // Bu sayfa henüz tanımlanmadı, Jet Academy sayfası için bir HTML dosyası oluşturulacak.
    }

    @GetMapping("/digital-library")
    public String digitalLibrary() {
        return "digitalLibrary"; // Aynı şekilde Digital Library için de bir sayfa oluşturulacak.
    }

    // Diğer kartlar için de yönlendirmeler buraya eklenecek.
}
