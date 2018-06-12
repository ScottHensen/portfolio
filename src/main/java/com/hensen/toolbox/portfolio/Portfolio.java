package com.hensen.toolbox.portfolio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Portfolio {

	private Long id;
	private String symbol;
	private int shares;

}
