package br.com.carlospepato.certification_nlw.modules.students.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import br.com.carlospepato.certification_nlw.modules.students.entities.CertificationStudentEntity;
import java.util.UUID;
import org.springframework.data.jpa.repository.Query;


@Repository
public interface CertificationStudentRepository extends JpaRepository<CertificationStudentEntity, UUID> {

    @Query("SELECT c FROM certifications c INNER JOIN c.studentEntity std WHERE std.email = :email AND c.technology = :technology")
    List<CertificationStudentEntity> findByStudentEmailAndTechnology(String email, String technology);
}