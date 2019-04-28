package com.guitar.db.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
@Data
public class ModelType {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String name;	

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="MODELTYPE_ID")
	private List<Model> models = new ArrayList<Model>();

}
