package com.mongo.api_rest_mongo_trabajo.repository;

import com.mongo.api_rest_mongo_trabajo.model.ProductDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductDAO extends MongoRepository<ProductDTO, String> {


}