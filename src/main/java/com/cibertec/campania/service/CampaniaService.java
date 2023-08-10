package com.cibertec.campania.service;

import com.cibertec.campania.model.Campania;

import java.util.List;

public interface CampaniaService {
    List<Campania> listarCampanias();
    void guardarCampania(Campania campania);
    Campania obtenerCampaniaPorId(long id);
    void eliminarCampania(long id);
}
