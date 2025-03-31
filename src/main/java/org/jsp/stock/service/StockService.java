package org.jsp.stock.service;

import org.jsp.stock.dto.User;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

public interface StockService {

	String register(User user, Model model);

	String register(User user, BindingResult result);

	String verifyOtp(int id, int otp);

}