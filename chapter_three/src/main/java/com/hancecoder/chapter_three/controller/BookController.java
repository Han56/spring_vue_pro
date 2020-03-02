package com.hancecoder.chapter_three.controller;

import com.hancecoder.chapter_three.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    @GetMapping("/books")
    public ModelAndView books() {
        List<Book> books = new ArrayList<>();
        Book b1 = new Book();
        b1.setId(1);
        b1.setAuthor("撒师宣");
        b1.setName("数据库系统概述");
        Book b2 = new Book();
        b2.setId(2);
        b2.setAuthor("王珊");
        b2.setName("计算机操作系统");
        books.add(b1);
        books.add(b2);
        ModelAndView mv = new ModelAndView();
        mv.addObject("books", books);
        mv.setViewName("books");
        return mv;
    }
}
