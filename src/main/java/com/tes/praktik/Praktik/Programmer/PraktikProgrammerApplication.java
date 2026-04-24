package com.tes.praktik.Praktik.Programmer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PraktikProgrammerApplication {

	@Autowired
	private PasienRepository pasienRepository;
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		SpringApplication.run(PraktikProgrammerApplication.class, args);
	}

	public static void displayMenu() {
		tampilkanDeskripsi();
		String command = null;
		while(!command.equals("Q/q")) {
			switch(command) {
				case "1":
					simpanPasien(null);
					break;
				case "2":
					readPasien();
					break;
				default:
			}
			tampilkanDeskripsi();
		}
	}

	public static void tampilkanDeskripsi() {
		System.out.println("Selamat Datang Di Mini Create Read Pasien");
		System.out.println("Pilih 1 untuk simpan pasien");
		System.out.println("Pilih 2 untuk read pasien")
	}

	public static void simpanPasien(Pasien pasien) {
		Pasien pasien = pasienRepository.save(pasien);
		System.out.println("pasien berhasil disimpan")
	}

	public static void readPasien() {
		List<Pasien> pasiens = pasienRepository.findAll();
		System.out.println("Id | Nama | Jenis Kelamin | Tanggal Lahir")
		pasiens.forEach(pasien -> {
			System.out.printf("%d | %s | %s | %s", pasien.getIdPasien(), pasien.getNamaPasien(), pasien.getJenisKelaminPasien(), pasien.getTglLahirPasien());
		})
	}

}
