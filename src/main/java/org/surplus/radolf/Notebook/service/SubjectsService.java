package org.surplus.radolf.Notebook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import org.surplus.radolf.Notebook.entity.Subjects;
import org.surplus.radolf.Notebook.repository.SubjectsRepository;

import java.util.List;

@Service
public class SubjectsService {
    private SubjectsRepository subjectsRepository;

    @Autowired
    public void setSubjectsRepository(SubjectsRepository subjectsRepository){this.subjectsRepository=subjectsRepository;}

    public Page<Subjects> findAllByOrderByInsertedAsc(Pageable pageable) {
        return subjectsRepository.findAllByOrderByInsertedAsc(pageable);
    }

    public Page<Subjects> findAll(Pageable pageable) {
        return subjectsRepository.findAll(pageable);
    }

    public Page<Subjects> findAllByOrderByInsertedDesc(Pageable pageable) {
        return subjectsRepository.findAllByOrderByInsertedDesc(pageable);
    }

    public void saveCuaUser(Subjects subjects) {
        subjectsRepository.save(subjects);
    }

    public List<Subjects> findAllByLastname(String lastname) {
        return subjectsRepository.findAllByNumber(lastname);
    }

}
