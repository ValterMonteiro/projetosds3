package com.devsuperiorvalter.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperiorvalter.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
