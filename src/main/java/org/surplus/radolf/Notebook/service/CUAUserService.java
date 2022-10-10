package org.surplus.radolf.Notebook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.surplus.radolf.Notebook.entity.CUAUser;
import org.surplus.radolf.Notebook.entity.IdNumber;
import org.surplus.radolf.Notebook.repository.CUaUserRepository;

import java.util.List;

@Service
public class CUAUserService {
    private CUaUserRepository cUaUserRepository;

    @Autowired
    public void setcUaUserRepository(CUaUserRepository cUaUserRepository){this.cUaUserRepository=cUaUserRepository;}

    public Page<CUAUser> findAllByOrderByInsertedAsc(Pageable pageable) {
        return cUaUserRepository.findAllByOrderByInsertedAsc(pageable);
    }

    public Page<CUAUser> findAll(Pageable pageable) {
        return cUaUserRepository.findAll(pageable);
    }

    ;

    public Page<CUAUser> findAllByOrderByInsertedDesc(Pageable pageable) {
        return cUaUserRepository.findAllByOrderByInsertedDesc(pageable);
    }

    public void saveCUAUser(CUAUser CUAUser) {
        cUaUserRepository.save(CUAUser);
    }

    public List<CUAUser> findAllByUserName(String username) {
        return cUaUserRepository.findAllByNumber(username);
    }

}
