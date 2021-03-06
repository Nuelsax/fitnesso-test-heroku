package com.decagon.fitnessoapp.repository;

import com.decagon.fitnessoapp.model.product.ShoppingItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingItem, Long> {

}
