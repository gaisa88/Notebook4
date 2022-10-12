package org.surplus.radolf.Notebook.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.surplus.radolf.Notebook.entity.Subjects;
import org.surplus.radolf.Notebook.service.SubjectsService;


@Controller

public class SubjectsController {

    private SubjectsService subjectsService;
    private String sortInsertedMethod = "ASC";
    private String filterMethod = "ALL";

    public SubjectsController(SubjectsService subjectsService) {
        this.subjectsService = subjectsService;
    }
    @GetMapping("/providers")
    public String list(Model model, Pageable pageable) {
        Page<Subjects> SubjectsPage = SortSubjects(pageable);
        PageWrapper<Subjects> page = new PageWrapper<Subjects>(SubjectsPage, "/providers");
        model.addAttribute("Subjectss", page.getContent());
        model.addAttribute("sort", sortInsertedMethod);
        model.addAttribute("filter", filterMethod);
        model.addAttribute("page", page);
        return "/providers";
    }
    @GetMapping("/providers/sort/{sortInserted}")
    public String sortChoose(@PathVariable String sortInserted) {
        sortInsertedMethod = sortInserted;
        return "redirect:/providers";
    }

    @GetMapping("/searchLastname")
    public String searchLastname() {
        return "operations/searchLastname";
    }


    @GetMapping("/search1")
    public String indexWithQuery(@RequestParam("lastname") String lastname, Model model, Pageable pageable) {
        Page<Subjects> SubjectsPage = SortSubjects(pageable);
        PageWrapper<Subjects> page = new PageWrapper<Subjects>(SubjectsPage, "/providers");
        model.addAttribute("Subjectss", subjectsService.findAllByLastname(lastname));
        model.addAttribute("sort", sortInsertedMethod);
        model.addAttribute("filter", filterMethod);
        model.addAttribute("page", page);
        return "/providers";
    }

    private Page<Subjects> SortSubjects(Pageable pageable) {
        Page<Subjects> page = null;
        switch (filterMethod) {
            case "ALL":
                switch (sortInsertedMethod) {
                    case "ASC":
                        page = subjectsService.findAllByOrderByInsertedAsc(pageable);
                        break;
                    case "DESC":
                        page = subjectsService.findAllByOrderByInsertedDesc(pageable);
                        break;
                }
        }
        return page;
    }}
