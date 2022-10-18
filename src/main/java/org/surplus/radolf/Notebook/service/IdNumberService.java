package org.surplus.radolf.Notebook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.surplus.radolf.Notebook.entity.IdNumber;
import org.surplus.radolf.Notebook.repository.IdNumberRepository;

import java.util.List;

@Service
public class IdNumberService {

    private IdNumberRepository idNumberRepository;

    @Autowired
    public void setProductRepository(IdNumberRepository idNumberRepository) {
        this.idNumberRepository = idNumberRepository;
    }

    public Page<IdNumber> findAllByOrderByInsertedAsc(Pageable pageable) {
        return idNumberRepository.findAllByOrderByInsertedAsc(pageable);
    }

    public Page<IdNumber> findAll(Pageable pageable) {
        return idNumberRepository.findAll(pageable);
    }

    ;

    public Page<IdNumber> findAllByOrderByInsertedDesc(Pageable pageable) {
        return idNumberRepository.findAllByOrderByInsertedDesc(pageable);
    }

    public void saveIdNumber(IdNumber IdNumber) {
        idNumberRepository.save(IdNumber);
    }

    public List<IdNumber> findAllByNumber(String Number) {
        return idNumberRepository.findAllByNumber(Number);
    }
//    public List<IdNumber> findAllNumbers(Pageable pageable) {
//        return idNumberRepository.findAllNumbers(pageable);
//    }
    public List FindAllWithDescriptionQuery(String Number) {
        return idNumberRepository.FindAllWithDescriptionQuery(Number);
    }
}
