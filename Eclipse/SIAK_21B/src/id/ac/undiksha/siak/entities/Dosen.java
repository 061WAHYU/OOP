package id.ac.undiksha.siak.entities;

import id.ac.undiksha.organisasi.Prodi;

public class Dosen extends Manusia{
	private String 	nip;
	private Prodi HomeBase;
	public Dosen(String nama, String alamat, boolean jenisKelamin) {
		super(nama, alamat, jenisKelamin);
		// TODO Auto-generated constructor stub
	}
	
	public Dosen(String nip, String jabatan, String prodi, String jurusan, String fakultas) {
		super();
		this.nip = nip;
	}
	public Dosen() { //construktor untuk set default value
		this.setNip("<NIP belum diisi>");
		this.setNama("<nama belum diisi>");
		this.setAlamat("<Alamat belum diisi>");
	}


	public void printAllInfo() { //untuk printout semua data bersamaan
		System.out.println("Nama: " + this.getNama());
		System.out.println("NIP: " + this.getNip());
		System.out.println("Alamat: " + this.getAlamat());
		
		System.out.println("Jenis Kelamin: " + 
		(this.getJenisKelamin() ? "Laki-laki" : "Perempuan")); //kondisi if True/False = ? True : Else
		System.out.println("\n");
	}
	
	//get n set
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}

	public Prodi getHomeBase() {
		return HomeBase;
	}

	public void setHomeBase(Prodi homeBase) {
		HomeBase = homeBase;
	}
	
	
}