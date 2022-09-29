package org.surplus.radolf.Notebook.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.surplus.radolf.Notebook.entity.IdNumber;

public interface IdNumberRepository extends JpaRepository<IdNumber, Long> {

    Page<IdNumber> findAllByOrderByInsertedAsc(Pageable pageable);
    Page<IdNumber> findAllByOrderByInsertedDesc(Pageable pageable);

    Page<IdNumber> findAll(Pageable pageable);
}
