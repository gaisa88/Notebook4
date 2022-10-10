package org.surplus.radolf.Notebook.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.surplus.radolf.Notebook.entity.CUAUser;
import org.surplus.radolf.Notebook.service.CUAUserService;

@Controller
public class CUaUserController {

    private CUAUserService cuaUserService;
    private String sortInsertedMethod = "ASC";
    private String filterMethod = "ALL";

    public CUaUserController(CUAUserService cuaUserService) {
        this.cuaUserService = cuaUserService;
    }

    @GetMapping("/cuauser")
    public String list(Model model, Pageable pageable) {
        Page<CUAUser> CUAUserPage = SortCUAUser(pageable);
        PageWrapper<CUAUser> page = new PageWrapper<CUAUser>(CUAUserPage, "/cuauser");
        model.addAttribute("CUAUsers", page.getContent());
        model.addAttribute("sort", sortInsertedMethod);
        model.addAttribute("filter", filterMethod);
        model.addAttribute("page", page);
        return "redirect:/cuauser";
    }
    @GetMapping("/cuauser/sort/{sortInserted}")
    public String sortChoose(@PathVariable String sortInserted) {
        sortInsertedMethod = sortInserted;
        return "redirect:/cuauser";
    }


    private Page<CUAUser> SortCUAUser(Pageable pageable) {
        Page<CUAUser> page = null;
        switch (filterMethod) {
            case "ALL":
                switch (sortInsertedMethod) {
                    case "ASC":
                        page = cuaUserService.findAllByOrderByInsertedAsc(pageable);
                        break;
                    case "DESC":
                        page = cuaUserService.findAllByOrderByInsertedDesc(pageable);
                        break;
                }
        }
        return page;
    }}
