package org.surplus.radolf.Notebook.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.surplus.radolf.Notebook.entity.IdNumber;
import org.surplus.radolf.Notebook.entity.Subjects;
import org.surplus.radolf.Notebook.service.IdNumberService;

@Controller
public class IdNumberController {

    private IdNumberService idnumberservice;
    private String sortInsertedMethod = "ASC";
    private String filterMethod = "ALL";

    public IdNumberController(IdNumberService idnumberservice) {
        this.idnumberservice = idnumberservice;
    }

    @GetMapping("/")
    public String list(Model model, Pageable pageable) {
        Page<IdNumber> IdNumberPage = SortIdNumber(pageable);
        PageWrapper<IdNumber> page = new PageWrapper<IdNumber>(IdNumberPage, "/");
        model.addAttribute("IdNumbers", page.getContent());
        model.addAttribute("sort", sortInsertedMethod);
        model.addAttribute("filter", filterMethod);
        model.addAttribute("page", page);
        return "index";
    }
    @GetMapping("/sort/{sortInserted}")
    public String sortChoose(@PathVariable String sortInserted) {
        sortInsertedMethod = sortInserted;
        return "redirect:/";
    }
    @GetMapping("/new")
    public String newIdNumber() {
        return "operations/new";
    }

    @PostMapping("/save")
    public String updateIdNumber(@RequestParam String Number) {
        idnumberservice.saveIdNumber(new IdNumber());
        return "redirect:/";
    }

    @GetMapping("/searchNumber")
    public String searchNumber() {
        return "operations/searchNumber";
    }
    @GetMapping("/searchbyiin")
    public String searchNumberByIIN() {
        return "operations/searchNumberByIIN";
    }

    @GetMapping("/search")
    public String indexWithQuery(@RequestParam("Number") String Number, Model model, Pageable pageable) {
        Page<IdNumber> IdNumberPage = SortIdNumber(pageable);
        PageWrapper<IdNumber> page = new PageWrapper<IdNumber>(IdNumberPage, "/");
        model.addAttribute("IdNumbers", idnumberservice.findAllByNumber(Number));
        model.addAttribute("sort", sortInsertedMethod);
        model.addAttribute("filter", filterMethod);
        model.addAttribute("page", page);
        return "index";
    }
//    @GetMapping("/searchbiin")
//    public String indexWithQuery1(@RequestParam("Number") String Number, Model model, Pageable pageable) {
//        Page<IdNumber> IdNumberPage = SortIdNumber(pageable);
//        PageWrapper<IdNumber> page = new PageWrapper<IdNumber>(IdNumberPage, "/providersdocs");
//        model.addAttribute("IdNumbers", idnumberservice.FindAllWithDescriptionQuery(Number));
//        model.addAttribute("sort", sortInsertedMethod);
//        model.addAttribute("filter", filterMethod);
//        model.addAttribute("page", page);
//        return "/providersdocs";
//    }

    private Page<IdNumber> SortIdNumber(Pageable pageable) {
        Page<IdNumber> page = null;
        switch (filterMethod) {
            case "ALL":
                switch (sortInsertedMethod) {
                    case "ASC":
                        page = idnumberservice.findAllByOrderByInsertedAsc(pageable);
                        break;
                    case "DESC":
                        page = idnumberservice.findAllByOrderByInsertedDesc(pageable);
                        break;
                }
        }
        return page;
    }}