package com.devreads.dev_reads.repository;

import com.devreads.dev_reads.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Long> {
}
