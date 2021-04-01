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
@Table(name="pertanyaan")
public class Pertanyaan {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="pertanyaan")
	private String pertanyaan;
	@Column(name="jawaban1")
	private String jawaban1;
	@Column(name="jawaban2")
	private String jawaban2;
	@Column(name="jawaban3")
	private String jawaban3;
	@Column(name="jawaban4")
	private String jawaban4;
	@Column(name="jawabanbenar")
	private String jawabanbenar;
	@Column(name="statusgambar")
	private String statusgambar;
}