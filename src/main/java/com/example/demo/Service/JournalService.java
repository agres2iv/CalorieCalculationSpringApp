package com.example.demo.Service;

import com.example.demo.Entity.Journal;
import com.example.demo.repo.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalService {

    @Autowired
    private JournalRepository journalRepository;
    public List<Journal> getAllJournals() {
        return journalRepository.findAll();

    }

}
