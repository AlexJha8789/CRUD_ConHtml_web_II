package com.cibertec.campania.controller;

import com.cibertec.campania.model.Campania;
import com.cibertec.campania.service.CampaniaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CampaniaController {

    @Autowired
    private CampaniaService campaniaService;

    @GetMapping("/")
    public String verPaginaInicio(Model model) {
        model.addAttribute("listaCampanias", campaniaService.listarCampanias());
        return "index";
    }

    @GetMapping("/nuevoCampania")
    public String nuevoCampania(Model model) {
        Campania campania = new Campania();
        model.addAttribute("campania", campania);
        return "nuevoCampania";
    }

    @PostMapping("/guardarCampania")
    public String guardarCampania(@ModelAttribute("campania") Campania campania) {
        campaniaService.guardarCampania(campania);
        return "redirect:/";
    }

    @GetMapping("/actualizarCampania/{id}")
    public String actualizarCampania(@PathVariable(value = "id") long id, Model model) {
        Campania campania = campaniaService.obtenerCampaniaPorId(id);
        model.addAttribute("campania", campania);
        return "actualizarCampania";

    }

    @GetMapping("/eliminarCampania/{id}")
    public String eliminarCampania(@PathVariable(value = "id") long id) {
        campaniaService.eliminarCampania(id);
        return "redirect:/";
    }


}
