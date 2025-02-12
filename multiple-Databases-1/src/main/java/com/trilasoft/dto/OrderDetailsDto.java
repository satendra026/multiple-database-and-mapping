package com.trilasoft.dto;
import com.trilasoft.entity.order.Items;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailsDto {
	
	private String quantity;
	private String price;
	List<Items> itemsList;

}