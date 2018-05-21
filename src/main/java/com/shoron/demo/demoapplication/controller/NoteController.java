package com.shoron.demo.demoapplication.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoron.demo.demoapplication.exception.ResourceNotFoundException;
import com.shoron.demo.demoapplication.model.Note;
import com.shoron.demo.demoapplication.repository.NoteRepository;

@RestController
@RequestMapping("/note")
public class NoteController {

	@Autowired
	NoteRepository noteRepository;
	
    // Get All Notes -> findAll()
	@GetMapping("/notes")
	public List<Note> getAllNotes() {
	    return noteRepository.findAll();
	}
	
    // Create a new Note 

	// Get a Single Note -> findById(noteId)
	@GetMapping("/notes/{id}")
	public Note getNoteById(@PathVariable(value = "id") Long noteId) {
	    return noteRepository.findById(noteId)
	            .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));
	}
	
	
    // Update a Note

    // Delete a Note
}
