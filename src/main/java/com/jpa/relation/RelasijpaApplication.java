package com.jpa.relation;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.jpa.relation.entity.Admin;
import com.jpa.relation.entity.Dosen;
import com.jpa.relation.entity.Mahasiswa;
import com.jpa.relation.entity.Matakuliah;
import com.jpa.relation.entity.Plotmk;
import com.jpa.relation.entity.Soal;
import com.jpa.relation.entity.Nilai;
import com.jpa.relation.entity.Pertanyaan;
import com.jpa.relation.repository.AdminRepository;
import com.jpa.relation.repository.DosenRepository;
import com.jpa.relation.repository.MatakuliahRepository;
import com.jpa.relation.repository.MahasiswaRepository;
import com.jpa.relation.repository.PlotmkRepository;
import com.jpa.relation.repository.SoalRepository;
import com.jpa.relation.repository.NilaiRepository;
@SpringBootApplication
public class RelasijpaApplication implements CommandLineRunner  {

	public static void main(String[] args) {
		SpringApplication.run(RelasijpaApplication.class, args);
	}

	@Autowired
	AdminRepository adminRepository;
	
	@Autowired
	MatakuliahRepository matakuliahRepository;
	
	@Autowired
	PlotmkRepository plotmkRepository;
	
	@Autowired
	SoalRepository soalRepository;

	@Autowired
	MahasiswaRepository mahasiswaRepository;
	
	@Autowired
	NilaiRepository nilaiRepository;
	
	@Autowired
	DosenRepository dosenRepository;
	
	@Override
	public void run(String... args) throws Exception {
		//ONE TO MANY
		//ADMIN-MAHASISWA
		//ADMIN-MK
		//ADMIN-DOSEN
		
		/*Admin admin=new  Admin();
	    admin.setUsername("Admin");
		admin.setPassword("Admin");*/
		
		/*Dosen dosen1=new Dosen();
		dosen1.setNama("Yanto");
		dosen1.setUsername("yanto123");
		dosen1.setPassword("AHS728821");
		
		Dosen dosen2=new Dosen();
		dosen2.setNama("Nani Wijaya");
		dosen2.setUsername("Nani123");
		dosen2.setPassword("AHS728821");
		
		Dosen dosen3=new Dosen();
		dosen3.setNama("Enggar Pratama");
		dosen3.setUsername("Enggar123");
		dosen3.setPassword("AH7728331");*/
		
	   /* Mahasiswa mahasiswa=new Mahasiswa();
		mahasiswa.setNama("Dilana Pritasia");
		mahasiswa.setJk("Perempuan");
		mahasiswa.setPassword("D2721819");
		
		Mahasiswa mahasiswa2=new Mahasiswa();
	    mahasiswa2.setNama("Suryono");
	    mahasiswa2.setJk("Laki-laki");
	    mahasiswa2.setPassword("D2721889");*/
		
		/*Matakuliah mk1=new Matakuliah();
		mk1.setNama_mk("Pengantar Management");
		Matakuliah mk2=new Matakuliah();
		mk2.setNama_mk("Matematika Dasar");*/
		
		/*List<Dosen> dosen=new ArrayList<Dosen>();
		dosen.add(dosen1);
		dosen.add(dosen2);
		dosen.add(dosen3);*/
	
		
		/*List<Mahasiswa> students=new ArrayList<Mahasiswa>();
		students.add(mahasiswa);
		students.add(mahasiswa2);*/
		
		/*List<Matakuliah> subject=new ArrayList<Matakuliah>();
		subject.add(mk1);
		subject.add(mk2);*/
		
		//admin.setLstComment(dosen);
		//admin.setLstComment1(students);
		//admin.setLstComment2(subject);
		//this.adminRepository.save(admin);
		
		//ONE TO MANY
		//MATKUL-PLOTMK
	/*	Matakuliah matkul=new Matakuliah();
	    matkul.setNama_mk("Pengantar Industri");
		
	    Plotmk pk=new Plotmk();
		pk.setId_dosen(1);
		pk.setNim(1);
		
		Plotmk pk2=new Plotmk();
		pk2.setId_dosen(1);
		pk2.setNim(2);
		
		List<Plotmk> plot=new ArrayList<Plotmk>();
		plot.add(pk);
		plot.add(pk2);
		
		matkul.setA1(plot);
		this.matakuliahRepository.save(matkul);*/
		
		//MANY to MANY
		//PLOT MK-SOAL
		
		/*Plotmk pk3 = new Plotmk();
		pk3.setId_dosen(2);
		pk3.setNim(2);
		
		Soal soal1 = new Soal();
		soal1.setNama_soal("Algoritma membuat Coffee");
		soal1.setStatus("Easy");
		
		Soal soal2 = new Soal();
		soal2.setNama_soal("Buatlah aplikasi menghitung luas tabung");
		soal2.setStatus("Difficult");
		
	    List<Soal>lstSoal = new ArrayList<Soal>();
	    lstSoal.add(soal1);
	    lstSoal.add(soal2);
		
	   pk3.setLstSoal(lstSoal);
	   this.plotmkRepository.save(pk3);
		
		
		List<Plotmk> lstPlotmk = new ArrayList<Plotmk>();
		lstPlotmk.add(pk3);
		
		Soal soal3 = new Soal();
		soal3.setNama_soal("Buatlah aplikasi menghitung luas Kerucut");
		soal3.setStatus("Difficult");
		soal3.setLstplotmk(lstPlotmk);

		this.soalRepository.save(soal3);*/

		//ONE TO MANY
		//MAHASISWA MENJAWAB BANYAK SOAL
		/*Mahasiswa mahasiswa4=new Mahasiswa();
	    mahasiswa4.setNama("Suryono");
	    mahasiswa4.setJk("Laki-laki");
	    mahasiswa4.setPassword("D2721889");
	   
	    Soal soal4 = new Soal();
		soal4.setNama_soal("Matematika Dasar");
		soal4.setStatus("Difficult");
		
		Soal soal5 = new Soal();
		soal5.setNama_soal("Buatlah aplikasi menghitung luas Persegi");
		soal5.setStatus("Difficult");
		
		List<Soal> ab=new ArrayList<Soal>();
		ab.add(soal4);
		ab.add(soal5);
		mahasiswa4.setAbc(ab);
		this.mahasiswaRepository.save(mahasiswa4);*/
		
		
		//ONE TO MANY
		//Satu soal berisi banyak pertanyaan
		/* Soal soal6 = new Soal();
		 soal6.setNama_soal("Matematika Dasar Pemrograman");
		 soal6.setStatus("Difficult");
		 
		 Pertanyaan pertanyaan1=new Pertanyaan();
		 pertanyaan1.setPertanyaan("Apa yang dimaksud java programming?");
		 pertanyaan1.setJawaban1("237723788");
		 pertanyaan1.setJawaban2("237723788");
		 pertanyaan1.setJawaban3("237723788");
		 pertanyaan1.setJawaban4("237723788");
		 pertanyaan1.setJawabanbenar("237723788");
		 pertanyaan1.setStatusgambar("237723788");
		 
		 Pertanyaan pertanyaan2=new Pertanyaan();
		 pertanyaan2.setPertanyaan("Apa yang dimaksud VB.Net?");
		 pertanyaan2.setJawaban1("23234334");
		 pertanyaan2.setJawaban2("232323434");
		 pertanyaan2.setJawaban3("234322343");
		 pertanyaan2.setJawaban4("2434334");
		 pertanyaan2.setJawabanbenar("2343434");
		 pertanyaan2.setStatusgambar("23334243");
		 
		 List<Pertanyaan> p1=new ArrayList<Pertanyaan>();
	     p1.add(pertanyaan1);
	     p1.add(pertanyaan2);
		 soal6.setLstpertanyaan(p1);
		this.soalRepository.save(soal6);*/
		
		
		//ONE TO ONE
		//satu soal mendapat satu nilai
		
		/*Nilai nilai = new Nilai();
		nilai.setNilai(90);
		
		
		Soal soal= new Soal();
		soal.setNama_soal("Matematika Diskrit");
		soal.setStatus("Difficult");
		
		nilai.setSoal(soal);
		
		this.nilaiRepository.save(nilai);*/
		 
		//ONE TO MANY
		//MAHASISWA MELIHAT BANYAK NILAI
		/*Mahasiswa mahasiswa6=new Mahasiswa();
	    mahasiswa6.setNama("Gisa");
	    mahasiswa6.setJk("Perempuan");
	    mahasiswa6.setPassword("D333223");
	    
	    Nilai nilai1 = new Nilai();
		nilai1.setNilai(100);
		
		Nilai nilai2 = new Nilai();
		nilai2.setNilai(90);
	    
		 List<Nilai> n1=new ArrayList<Nilai>();
	     n1.add(nilai1);
	     n1.add(nilai2);
		 mahasiswa6.setAbcd(n1);
		this.mahasiswaRepository.save(mahasiswa6);*/
		
		//ONE TO MANY
		//DOSEN AKSES BANYAK NILAI
		/*Dosen dosen4=new Dosen();
		dosen4.setNama("Farah Wijaya");
		dosen4.setUsername("Fasy123");
		dosen4.setPassword("AH23723821");
		
		 Nilai nilai3 = new Nilai();
			nilai3.setNilai(100);
			
			Nilai nilai4 = new Nilai();
			nilai4.setNilai(90);
			
			 List<Nilai> n2=new ArrayList<Nilai>();
		     n2.add(nilai3);
		     n2.add(nilai4);
			 dosen4.setAbcde(n2);
			this.dosenRepository.save(dosen4);*/
		
		//ONE TO MANY
		//DOSEN MENGAKSES BANYAK MAHASISWA
		Dosen dosen5=new Dosen();
		dosen5.setNama("Mahisya");
		dosen5.setUsername("Masy123");
		dosen5.setPassword("A5DE23821");
		
		Mahasiswa mahasiswa7=new Mahasiswa();
		mahasiswa7.setNama("Dilaa");
		mahasiswa7.setJk("Perempuan");
		mahasiswa7.setPassword("D2779819");
		
		Mahasiswa mahasiswa8=new Mahasiswa();
	    mahasiswa8.setNama("Sabar Nayid");
	    mahasiswa8.setJk("Laki-laki");
	    mahasiswa8.setPassword("D27789889");
		
	    List<Mahasiswa> n3=new ArrayList<Mahasiswa>();
	     n3.add(mahasiswa7);
	     n3.add(mahasiswa8);
		 dosen5.setAbcdef(n3);
		this.dosenRepository.save(dosen5);
		
}
	}