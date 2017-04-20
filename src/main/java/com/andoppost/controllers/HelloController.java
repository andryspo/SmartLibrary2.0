package com.andoppost.controllers;

import com.andoppost.entities.Book;
import com.andoppost.repo.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private TestRepo repo;

    @RequestMapping("/")
    public String index() {

        List<Book> books = (List<Book>) repo.findAll();
        return "Books: " + books.get(0).getTitle();
    }
}