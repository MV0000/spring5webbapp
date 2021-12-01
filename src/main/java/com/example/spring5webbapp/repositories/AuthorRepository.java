package com.example.spring5webbapp.repositories;

import com.example.spring5webbapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {

}
