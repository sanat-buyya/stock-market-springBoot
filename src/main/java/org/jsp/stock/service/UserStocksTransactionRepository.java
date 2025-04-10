package org.jsp.stock.service;

import org.jsp.stock.dto.UserStocksTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserStocksTransactionRepository extends JpaRepository<UserStocksTransaction, Integer> {

}