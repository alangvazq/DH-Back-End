package com.repaso.estudiantes.repository;

import com.repaso.estudiantes.modelo.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstudianteRepository extends JpaRepository<Estudiante, Long> {
}
