package dev.leehis.leeflix;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LeeflixHomeController {
    
    @GetMapping("/online")
    public String home() {
        return "Leeflix is running on Azure";
    }
}
