package com.cibertec.campania.repository;

import com.cibertec.campania.model.Campania;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampaniaRepository extends JpaRepository<Campania,Long> {
}
