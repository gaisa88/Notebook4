package org.surplus.radolf.Notebook.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.surplus.radolf.Notebook.entity.IdNumber;

import java.util.List;

public interface IdNumberRepository extends JpaRepository<IdNumber, Long> {
    Page<IdNumber> findAllByOrderByInsertedAsc(Pageable pageable);
    Page<IdNumber> findAllByOrderByInsertedDesc(Pageable pageable);
    Page<IdNumber> findAll(Pageable pageable);

    @Query("SELECT c from IdNumber c where c.Number = :Number")
    List findAllByNumber(@Param("Number")String Number);

//    @Query("SELECT c from IdNumber c join c.creditinfoId s")
//    List findAllNumbers(Pageable pageable);


}
