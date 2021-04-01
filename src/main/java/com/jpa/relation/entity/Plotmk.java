package com.jpa.relation.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="plotmk")
public class Plotmk {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private long id_dosen;
	private long nim;
	
	 @ManyToMany(cascade= CascadeType.ALL)
	 @JoinTable(
		        name = "soal_details", 
		        joinColumns = { @JoinColumn(name = "plotmk_id", referencedColumnName = "id") }, 
		        inverseJoinColumns = { @JoinColumn(name = "soal_id",referencedColumnName = "id") })
	 
	 List<Soal> lstSoal = new ArrayList<Soal>();
}