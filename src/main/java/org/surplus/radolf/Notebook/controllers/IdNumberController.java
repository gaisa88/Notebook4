package org.surplus.radolf.Notebook.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.surplus.radolf.Notebook.entity.IdNumber;
import org.surplus.radolf.Notebook.service.IdNumberService;

@Controller
public class IdNumberController {

    private IdNumberService idnumberservice;
    private String sortInsertedMethod = "ASC";

    public IdNumberController(IdNumberService idnumberservice) {
        this.idnumberservice = idnumberservice;
    }

    @GetMapping("/idnumber")
    public String list(Model model, Pageable pageable) {
        Page<IdNumber> IdNumberPage = SortIdNumber(pageable);
        PageWrapper<IdNumber> page = new PageWrapper<IdNumber>(IdNumberPage, "/idnumber");
        model.addAttribute("IdNumbers", page.getContent());
        model.addAttribute("sort", sortInsertedMethod);
        String filterMethod = "ALL";
        model.addAttribute("filter", filterMethod);
        model.addAttribute("page", page);
        return "idnumber";
    }
    @GetMapping("/idnumber/sort/{sortInserted}")
    public String sortChoose(@PathVariable String sortInserted) {
        sortInsertedMethod = sortInserted;
        return "redirect:/idnumber";
    }

    private Page<IdNumber> SortIdNumber(Pageable pageable) {
        Page<IdNumber> page = null;
        switch (sortInsertedMethod) {
            case "ASC":
                page= idnumberservice.findAll(pageable);

//                page = idnumberservice.findAllByOrderByInsertedAsc(pageable);
                break;
            case "DESC":
                page = idnumberservice.findAllByOrderByInsertedDesc(pageable);
                break;

        }
        return page;
    }
}
