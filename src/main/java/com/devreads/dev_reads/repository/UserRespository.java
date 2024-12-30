package com.devreads.dev_reads.repository;

import com.devreads.dev_reads.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRespository extends MongoRepository<User, String> {
}
