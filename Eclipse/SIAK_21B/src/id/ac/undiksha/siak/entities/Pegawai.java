package id.ac.undiksha.siak.entities;

public class Pegawai extends Manusia {
	private String 	nip;
	private String 	jabatan;
	private String 	unit;
	
	
	public Pegawai() { //construktor untuk set default value
		this.setNip("<NIP belum diisi>");
		this.setNama("<nama belum diisi>");
		this.setAlamat("<Alamat belum diisi>");
		this.setJabatan("<Jabatan belum diisi>");
		this.setUnit("<Unit belum diisi>");
	}
	
	public Pegawai(String nama, String alamat, boolean jenisKelamin) {
		super(nama, alamat, jenisKelamin);
		// TODO Auto-generated constructor stub
	}

	public Pegawai(String nip, String jabatan, String unit) {
		super();
		this.nip = nip;
		this.jabatan = jabatan;
		this.unit = unit;
	}

	public void printAllInfo() { //untuk printout semua data bersamaan
		System.out.println("Nama: " + this.getNama());
		System.out.println("NIP: " + this.getNip());
		System.out.println("Alamat: " + this.getAlamat());
		System.out.println("Jabatan: " + this.getJabatan());
		System.out.println("Unit: " + this.getUnit());
		
		System.out.println("Jenis Kelamin: " + 
		(this.getJenisKelamin() ? "Laki-laki" : "Perempuan")); //kondisi if True/False = ? True : Else
	}
	
	//get n set
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	public String getJabatan() {
		return jabatan;
	}
	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	
}