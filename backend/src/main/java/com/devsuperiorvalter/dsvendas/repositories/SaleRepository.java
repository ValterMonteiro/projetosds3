package com.devsuperiorvalter.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperiorvalter.dsvendas.dto.SaleSuccessDTO;
import com.devsuperiorvalter.dsvendas.dto.SaleSumDTO;
import com.devsuperiorvalter.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	@Query("SELECT new com.devsuperiorvalter.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ "FROM Sale As obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();

	@Query("SELECT new com.devsuperiorvalter.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ "FROM Sale As obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();


}