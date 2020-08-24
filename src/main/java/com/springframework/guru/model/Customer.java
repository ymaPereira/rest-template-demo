package com.springframework.guru.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer implements Serializable {

	private final static long serialVersionUID = -4147860869854333663L;
	private String firstname;
	private String lastname;

}
