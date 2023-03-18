package com.example.mjs.repository;

import com.example.mjs.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotozRepository extends CrudRepository<Photo, Integer> {
}