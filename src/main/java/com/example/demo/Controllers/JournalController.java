package com.example.demo.Controllers;

import com.example.demo.Service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class JournalController {

    @Autowired
    private JournalService journalService;

//    @GetMapping("/journal")
//    public String showJournal(Model model) {
//        List<Journal> allJournals = journalService.getAllJournals();
//        model.addAttribute("allJournals", allJournals);
//        model.addAttribute("journal","Журнал");
//        return "journal";
//
//    }

}
