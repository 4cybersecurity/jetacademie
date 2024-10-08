package be.jetacademie.mentoring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/jet-academy")
    public String jetAcademy() {
        return "jetAcademy"; // Bu sayfa henüz tanımlanmadı, Jet Academy sayfası için bir HTML dosyası oluşturulacak.
    }

    @GetMapping("/library")
    public String digitalLibrary() {
        return "library"; // Aynı şekilde Digital Library için de bir sayfa oluşturulacak.
    }

    // Diğer kartlar için de yönlendirmeler buraya eklenecek.
}
