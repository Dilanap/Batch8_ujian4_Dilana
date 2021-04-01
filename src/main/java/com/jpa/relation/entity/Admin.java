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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="admin")
public class Admin {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;

	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="adminid",referencedColumnName="id")
	// private List<Dosen>lstComment=new ArrayList<Dosen>();
	 //private List<Mahasiswa>lstComment1=new ArrayList<Mahasiswa>();
	private List<Matakuliah>lstComment2=new ArrayList<Matakuliah>();
	

}