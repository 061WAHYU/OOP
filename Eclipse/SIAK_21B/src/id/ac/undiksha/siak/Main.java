package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.*;

public class Main {

	public static void main(String[] args) {
		
		//Mahasiswa
		Mahasiswa mhs1 = new Mahasiswa();
		System.out.print(mhs1.getNim());
		
		Manusia mhs2 = new Mahasiswa();
		System.out.print(mhs2.getNama());
		

		//Dosen
		Manusia dsn = new Dosen();
		System.out.println(dsn.getNama());
		
		Dosen dsn1 = new Dosen();
		System.out.println(dsn1.getNip());
		
		//Pegawai
		Manusia pgw = new Dosen();
		System.out.println(pgw.getNama());
		
		Dosen pgw2 = new Dosen();
		System.out.println(pgw2.getNip());
	}

}
