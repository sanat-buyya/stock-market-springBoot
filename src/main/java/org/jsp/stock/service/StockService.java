package org.jsp.stock.service;
 
 import org.jsp.stock.dto.User;
 
 import jakarta.servlet.http.HttpSession;
 
 public interface StockService {
 
 	String login(User user, HttpSession session);
 
 }