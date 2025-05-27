package com.example.demo.repo;

import com.example.demo.Entity.Journal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface JournalRepository extends JpaRepository<Journal, Long> {

}
