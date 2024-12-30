package com.devreads.dev_reads.service;

import com.devreads.dev_reads.dto.BookDTO;
import com.devreads.dev_reads.model.Book;
import com.devreads.dev_reads.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;

    @Override
    public void addBook(BookDTO bookDTO) {
        Book book = Book.builder()
                .title(bookDTO.getTitle())
                .author(bookDTO.getAuthor())
                .createdAt(new Date())
                .build();
        bookRepository.save(book);
    }
}
