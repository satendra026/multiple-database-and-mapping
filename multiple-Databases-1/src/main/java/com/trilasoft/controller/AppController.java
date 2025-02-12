package com.trilasoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.trilasoft.dto.OrderDetailsDto;
import com.trilasoft.dto.PaymentDetailsDto;
import com.trilasoft.entity.order.OrderDetails;
import com.trilasoft.entity.payment.PaymentDetails;
import com.trilasoft.repository.order.OrderRepository;
import com.trilasoft.repository.payment.PaymentRepository;

@RestController
@RequestMapping(value = "/multidb")
public class AppController {
	
	@Autowired
	OrderRepository orderRepo;
	
	@Autowired
	PaymentRepository paymentRepo;
	
//	@Autowired
//	ModelMapper modelMapper;
//	
	@PostMapping("/order")
	public ResponseEntity<OrderDetails> saveOrderDetails(@RequestBody OrderDetailsDto request){

		OrderDetails entityRequest=new OrderDetails();
		entityRequest.setPrice(request.getPrice());
		entityRequest.setQuantity(request.getQuantity());
		entityRequest.setItemsList(request.getItemsList());
		
		OrderDetails entity =orderRepo.save(entityRequest);
		
		return new ResponseEntity<OrderDetails>(entity,HttpStatus.OK);
	}
	
	@PostMapping("/payment")
	public ResponseEntity<PaymentDetails> saveOrderDetails(@RequestBody PaymentDetailsDto request){
		
		//PaymentDetails entity = modelMapper.map(request, PaymentDetails.class);
		PaymentDetails entity = paymentRepo.save(request);
		return new ResponseEntity<PaymentDetails>(entity,HttpStatus.OK);
	}
	
	@GetMapping("/orders")
	public List<OrderDetails> getOrders(){
		return orderRepo.getOrderList();
	}

	@DeleteMapping("/deleteorder/{id}")
	public ResponseEntity<String> deleteOrders(@PathVariable Long id){
		 orderRepo.deleteById(id);
		 return new ResponseEntity<>("order deleted successfully",HttpStatus.OK);
    }
	

}