package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.Mahasiswa;
import id.ac.undiksha.siak.entities.Dosen;
import id.ac.undiksha.siak.entities.Pegawai;

public class Main {

	public static void main(String[] args) {
		
		
		Mahasiswa mhs1 = new Mahasiswa(
				"Budi",
				"Denpasar",
				"123456789",
				true,
				"Ilmu Komputer",
				"Teknik Informatika",
				"FTK"	
		);
		System.out.println("Data Mahasiswa:");
		mhs1.printAllInfo();
		
		Dosen dosen1 = new Dosen(
				"A.A. Gede Yudhi Paramartha, S.Kom., M.Kom.",
				"198806222015041003",
				true,
				"Singaraja",
				"Koorprodi Ilmu Komputer",
				"Ilmu Komputer",
				"Teknik Informatika",
				"FTK"
				);
		System.out.println("Data Dosen:");
		dosen1.printAllInfo();
		Pegawai pgw1 = new Pegawai();
		System.out.println("Data Pegawai:");
		pgw1.printAllInfo();
	}

}
