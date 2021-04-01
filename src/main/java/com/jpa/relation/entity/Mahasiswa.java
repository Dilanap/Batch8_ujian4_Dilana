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
@Table(name="mahasiswa")
public class Mahasiswa {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long nim;
	@Column(name="password")
	private String password;
	@Column(name="jk")
	private String jk;
	@Column(name="nama")
	private String nama;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="test_id",referencedColumnName="nim")
	 private List<Soal>abc=new ArrayList<Soal>();
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="id_mhs",referencedColumnName="nim")
	 private List<Nilai>abcd=new ArrayList<Nilai>();

}
