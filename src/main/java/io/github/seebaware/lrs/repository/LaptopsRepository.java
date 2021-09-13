package io.github.seebaware.lrs.repository;

import io.github.seebaware.lrs.model.Laptops;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LaptopsRepository extends MongoRepository<Laptops, String> {

    List<Laptops> findByModel(String model);

}
