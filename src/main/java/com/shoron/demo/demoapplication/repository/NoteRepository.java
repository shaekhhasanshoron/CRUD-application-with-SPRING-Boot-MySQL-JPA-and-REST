package com.shoron.demo.demoapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shoron.demo.demoapplication.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long>{

	// save(), findOne(), findAll(), count(), delete()
}
