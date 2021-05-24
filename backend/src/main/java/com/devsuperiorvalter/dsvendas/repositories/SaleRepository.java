package com.devsuperiorvalter.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperiorvalter.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
