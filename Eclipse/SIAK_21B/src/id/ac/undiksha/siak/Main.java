package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.*;

public class Main {

	public static void main(String[] args) {
		
		//Mahasiswa
		System.out.println("Data Mahasiswa");
		Mahasiswa mhs1 = new Mahasiswa();
		System.out.println(mhs1.getNim());
		
		mhs1.getProdi().getKoordinatorProdi().getNama();
		
	}

}
