package com.example.spring5webbapp.repositories;

import com.example.spring5webbapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
