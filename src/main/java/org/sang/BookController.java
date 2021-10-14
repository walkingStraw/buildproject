package org.sang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    private Book book;
    @GetMapping("/book")
    public Book book(){
        int i = 1 / 0;
        return book;
    }
}
