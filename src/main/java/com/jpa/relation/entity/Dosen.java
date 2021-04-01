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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="dosen")
public class Dosen {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="nama")
	private String nama;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="id_dosen",referencedColumnName="id")
	 private List<Nilai>abcde=new ArrayList<Nilai>();
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="iddosen",referencedColumnName="id")
	 private List<Mahasiswa>abcdef=new ArrayList<Mahasiswa>();

}
