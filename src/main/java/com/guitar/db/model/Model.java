package com.guitar.db.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="Model.findAllModelsByType", query="select m from Model m where m.modelType.name = :name")
@Data
public class Model {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String name;	
	private BigDecimal price;
	private int frets;
	private String woodType;
	private Date yearFirstMade;
	
	@ManyToOne
	private Manufacturer manufacturer;

	@ManyToOne
	private ModelType modelType;

}
