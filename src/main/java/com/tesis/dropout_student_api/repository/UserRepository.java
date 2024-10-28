package com.tesis.dropout_student_api.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.tesis.dropout_student_api.model.User;

public interface UserRepository extends CosmosRepository<User, String> {
    User findByUsername(String username);
}
