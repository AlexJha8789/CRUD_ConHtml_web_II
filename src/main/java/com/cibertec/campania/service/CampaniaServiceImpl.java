package com.cibertec.campania.service;

import com.cibertec.campania.model.Campania;
import com.cibertec.campania.repository.CampaniaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CampaniaServiceImpl implements CampaniaService{


    @Autowired
    private CampaniaRepository campaniaRepository;

    @Override
    public List<Campania> listarCampanias() {
        return campaniaRepository.findAll();
    }

    @Override
    public void guardarCampania(Campania campania) {
        campaniaRepository.save(campania);

    }

    @Override
    public Campania obtenerCampaniaPorId(long id) {
        Optional<Campania> opcional=campaniaRepository.findById(id);
        Campania campania;
        if(opcional.isPresent()){
            campania=opcional.get();
        }else {
            throw new RuntimeException("Campaña no encontrada por el id:"+id);
        }
        return campania;
    }

    @Override
    public void eliminarCampania(long id) {
        campaniaRepository.deleteById(id);

    }
}
