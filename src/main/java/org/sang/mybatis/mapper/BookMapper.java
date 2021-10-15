package org.sang.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.sang.mybatis.Book;

import java.util.List;

public interface BookMapper {
    int addBook(Book book);
    int deleteBookById(Integer id);
    int updateBookById(Book book);
    Book getBookById(Integer id);
    List<Book> getAllBooks();
}
