package com.example.spring5webbapp.repositories;

import com.example.spring5webbapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
