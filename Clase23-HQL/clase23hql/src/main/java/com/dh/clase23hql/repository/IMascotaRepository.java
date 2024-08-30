package com.dh.clase23hql.repository;

import com.dh.clase23hql.entity.Mascota;
import com.dh.clase23hql.entity.Veterinaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMascotaRepository extends JpaRepository<Mascota, Long> {

    List<Veterinaria> findByVeterinariaId(Long veterinariaId);

    List<Mascota> findByTipo(String tipo);
}
