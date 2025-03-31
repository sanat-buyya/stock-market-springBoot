package org.jsp.stock.repository;

import org.jsp.stock.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>{

	boolean existsByEmail(String email);

	boolean existsByMobile(long mobile);

}