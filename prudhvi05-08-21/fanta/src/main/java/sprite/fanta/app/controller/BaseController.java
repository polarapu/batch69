package sprite.fanta.app.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

public class BaseController {

    @ModelAttribute("common")
    public void common(Model model) {

    }
}
