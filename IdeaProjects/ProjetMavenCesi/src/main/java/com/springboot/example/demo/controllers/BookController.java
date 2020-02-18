package com.springboot.example.demo.controllers;

import com.springboot.example.demo.entities.Book;
import com.springboot.example.demo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(final BookService bookService){
        this.bookService = bookService;
    }

    @RequestMapping(value = "/books/{bookId}", method = RequestMethod.GET)
    @ResponseBody
    Book getBookById(@PathVariable final Integer bookId) {
        return this.bookService.getBookById(bookId);
    }

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    @ResponseBody
    List<Book> getAllBooks() {
        return this.bookService.getAllBooks();
    }

    @RequestMapping(value = "/books", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    void addBook(@RequestBody Book book){
        this.bookService.addBook(book);
    }

}
