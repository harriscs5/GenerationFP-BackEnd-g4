package org.generation.ItemsAPI.repository;

import org.generation.ItemsAPI.repository.entity.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called itemRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface ItemRepository extends CrudRepository<Item, Integer> {

}