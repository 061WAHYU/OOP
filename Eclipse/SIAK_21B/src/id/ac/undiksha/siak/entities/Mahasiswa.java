package id.ac.undiksha.siak.entities;

import id.ac.undiksha.organisasi.Prodi;

public class Mahasiswa extends Manusia{

	private String nim;
	private Prodi prodi;
	
	public Mahasiswa(String nim, String prodi, String jurusan, String fakultas) {
		super();
		this.nim = nim;
		
	}
	public Mahasiswa(){
		super();
		this.setNama("<nama belum diisi>");
		this.setAlamat("<Alamat belum diisi>");
		this.setNim("<NIM belum diisi>");
	
	}
	
	public Mahasiswa(String nama, String alamat, boolean jenisKelamin) {
		super(nama, alamat, jenisKelamin);
		// TODO Auto-generated constructor stub
	}
	
	public Mahasiswa(String nama, String alamat, boolean jenisKelamin,
			String nim, String kodeProdi, String namaProdi
			) {
		
		super(nama, alamat, jenisKelamin);
		this.nim = nim;
		
	}
	
	public void printAllInfo() {
		System.out.println("Nama: " 	+ this.getNama());
		System.out.println("Alamat: " 	+ this.getAlamat());
		System.out.println("NIM: " 		+ this.getNim());
		
		System.out.println("Jenis Kelamin: " + 
				(this.getJenisKelamin() ? "Laki-laki" : "Perempuan"));
		System.out.println("\n");
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}
	public Prodi getProdi() {
		return prodi;
	}
	public void setProdi(Prodi prodi) {
		this.prodi = prodi;
	}

}
