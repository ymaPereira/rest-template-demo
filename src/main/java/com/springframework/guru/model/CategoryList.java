package com.springframework.guru.model;

import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class CategoryList implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7823332240856894418L;
	@Setter
	@Getter
	private List<Category> categories;
}
