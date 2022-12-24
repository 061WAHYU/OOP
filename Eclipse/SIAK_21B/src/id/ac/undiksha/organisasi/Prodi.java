package id.ac.undiksha.organisasi;

import id.ac.undiksha.siak.entities.Dosen;

public class Prodi implements Jurusan{
	
	private String namaProdi;
	private String kodeProdi;
	private Dosen koordinatorProdi;
	
	
	public Prodi(String namaProdi, String kodeProdi, Dosen koordinatorProdi) {
		super();
		this.namaProdi = namaProdi;
		this.kodeProdi = kodeProdi;
		this.koordinatorProdi = koordinatorProdi;
	}


	public String getNamaProdi() {
		return namaProdi;
	}


	public void setNamaProdi(String namaProdi) {
		this.namaProdi = namaProdi;
	}


	public String getKodeProdi() {
		return kodeProdi;
	}


	public void setKodeProdi(String kodeProdi) {
		this.kodeProdi = kodeProdi;
	}


	public Dosen getKoordinatorProdi() {
		return koordinatorProdi;
	}


	public void setKoordinatorProdi(Dosen koordinatorProdi) {
		this.koordinatorProdi = koordinatorProdi;
	}

	
	private String namaJurusan;
	private String kodeJurusan;

	@Override
	public void setKodeJurusan(String kodeJurusan) {
		// TODO Auto-generated method stub
		this.kodeJurusan = kodeJurusan;
	}


	@Override
	public String getKodeJurusan() {
		// TODO Auto-generated method stub
		return this.kodeJurusan;
	}


	@Override
	public void setNamaJurusan(String namaJurusan) {
		// TODO Auto-generated method stub
		this.namaJurusan = namaJurusan;
	}


	@Override
	public String getNamaJurusan() {
		// TODO Auto-generated method stub
		return this.namaJurusan;
	}
	
}

