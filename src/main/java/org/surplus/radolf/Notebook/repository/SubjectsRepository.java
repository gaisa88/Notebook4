package org.surplus.radolf.Notebook.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.surplus.radolf.Notebook.entity.Subjects;

import java.util.List;

public interface SubjectsRepository extends JpaRepository<Subjects, Long> {
    Page<Subjects> findAllByOrderByInsertedAsc(Pageable pageable);
    Page<Subjects> findAllByOrderByInsertedDesc(Pageable pageable);
    Page<Subjects> findAll(Pageable pageable);

    @Query("SELECT c from Subjects c where c.lastname = :lastname")
    List findAllByNumber(@Param("lastname")String lastname);
}
