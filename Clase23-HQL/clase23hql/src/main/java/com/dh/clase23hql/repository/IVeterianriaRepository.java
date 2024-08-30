package com.dh.clase23hql.repository;

import com.dh.clase23hql.entity.Veterinaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVeterianriaRepository extends JpaRepository<Veterinaria, Long> {
}
