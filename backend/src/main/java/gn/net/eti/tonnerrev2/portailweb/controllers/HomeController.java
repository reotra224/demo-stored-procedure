package gn.net.eti.tonnerrev2.portailweb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @création 18/03/2021
 * @projet portailweb
 * @auteur mohamed.bangoura
 * @package gn.net.eti.tonnerrev2.portailweb.controllers
 */

@RestController
public class HomeController {
    @GetMapping("/home")
    public String home() {
        return "Bienvenue sur le portail web.";
    }
}
