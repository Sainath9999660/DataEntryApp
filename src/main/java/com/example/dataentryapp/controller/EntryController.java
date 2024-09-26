package com.example.dataentryapp.controller;

import com.example.dataentryapp.model.Entry;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EntryController {

    private List<Entry> entries = new ArrayList<>();

    // Display the form
    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("entry", new Entry());
        model.addAttribute("entries", entries);
        return "form";
    }

    // Handle form submission and show confirmation page
    @PostMapping("/submit")
    public String submitForm(@Valid @ModelAttribute("entry") Entry entry, BindingResult result, Model model) {
        if (result.hasErrors()) {
            // If validation fails, show the form again
            model.addAttribute("entries", entries);
            return "form";
        }

        // Add the new entry to the list of previous entries
        entries.add(entry);

        // Show the confirmation page
        model.addAttribute("entry", entry);
        model.addAttribute("entries", entries);
        return "confirmation";
    }
}
