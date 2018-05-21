package com.shoron.demo.demoapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoron.demo.demoapplication.repository.NoteRepository;

@RestController
@RequestMapping("/note")
public class NoteController {

	@Autowired
	NoteRepository noteRepository;
	
    // Get All Notes	

    // Create a new Note

    // Get a Single Note

    // Update a Note

    // Delete a Note
}
