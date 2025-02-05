package com.trilasoft.repository.payment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trilasoft.dto.PaymentDetailsDto;
import com.trilasoft.entity.payment.PaymentDetails;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentDetails, Long>{

	PaymentDetails save(PaymentDetailsDto request);

}