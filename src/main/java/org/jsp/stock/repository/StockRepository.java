package org.jsp.stock.repository;

import org.jsp.stock.dto.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, String> {

}