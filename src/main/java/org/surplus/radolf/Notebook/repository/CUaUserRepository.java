package org.surplus.radolf.Notebook.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.surplus.radolf.Notebook.entity.CUAUser;

import java.util.List;

public interface CUaUserRepository extends JpaRepository<CUAUser, Long> {
   Page<CUAUser> findAllByOrderByInsertedAsc(Pageable pageable);
    Page<CUAUser> findAllByOrderByInsertedDesc(Pageable pageable);
   Page<CUAUser> findAll(Pageable pageable);

   @Query("SELECT c from CUAUser c where c.username = :username")
   List findAllByNumber(@Param("username")String username);
}
