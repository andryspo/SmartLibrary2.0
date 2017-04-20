package com.andoppost.repo;

import com.andoppost.entities.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepo extends CrudRepository<Book, Long> {
    @Override
    Iterable<Book> findAll();
}
