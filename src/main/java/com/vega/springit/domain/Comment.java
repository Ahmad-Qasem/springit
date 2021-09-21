package com.vega.springit.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor // we are adding this annotation because @data is adding args constructor and we don't want it
public class Comment {

	@Id
	@GeneratedValue
	private Long id;
	@NonNull
	private String body;

	// body

}
