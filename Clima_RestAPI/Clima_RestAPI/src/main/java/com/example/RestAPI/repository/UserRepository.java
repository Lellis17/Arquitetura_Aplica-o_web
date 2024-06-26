package com.example.RestAPI.repository;

import com.example.RestAPI.model.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<UserEntity, String> {
    // Métodos de CRUD já estão disponíveis
    //findAll, findById, save, deleteById

    // Utilizando consultas personalizadas
    List<UserEntity> findByCountry(String country);
    List<UserEntity> findByDate(String date);
    List<UserEntity> findByText(String text);
}