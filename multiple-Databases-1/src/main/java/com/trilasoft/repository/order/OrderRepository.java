package com.trilasoft.repository.order;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.trilasoft.dto.OrderDetailsDto;
import com.trilasoft.entity.order.OrderDetails;

@Repository
public interface OrderRepository extends JpaRepository<OrderDetails, Long>{
	
	@Query(value="select u from OrderDetails as u")
	List<OrderDetails> getOrderList();

	OrderDetails save(OrderDetailsDto request);

}