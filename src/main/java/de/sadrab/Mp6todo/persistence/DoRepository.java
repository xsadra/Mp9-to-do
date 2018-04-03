package de.sadrab.Mp6todo.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface DoRepository extends MongoRepository<Do,String> {
    @Override
    List<Do> findAll();

    @Override
    Optional<Do> findById(String s);

    Do save(Do todo);
}
