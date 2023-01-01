package com.threebee.starentertainment.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "ENTERTAINER")
public class EntertainerEntity {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String birth;
	
	@Column
	private String unit;
	

	
	@OneToMany(mappedBy = "entertainer", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE) 
	@JsonIgnoreProperties("entertainer") 
	private List<MusicEntity> music;
	
	@OneToMany(mappedBy = "entertainer", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE) 
	@JsonIgnoreProperties("entertainer") 
	private List<MovieEntity> movie;
	
	@OneToMany(mappedBy = "entertainer", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE) 
	@JsonIgnoreProperties("entertainer") 
	private List<ProgramEntity> entertainment;
	
}
