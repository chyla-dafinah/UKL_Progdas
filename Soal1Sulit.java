package UKL;

import java.util.Scanner;

public class Soal1Sulit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int jumlahSiswa = 0;

        do {
            System.out.println("Masukkan jumlah siswa: ");
            jumlahSiswa = s.nextInt();

            if (jumlahSiswa <= 0) {
                System.out.println("Jumlah siswa harus lebih dari 0!");
            }
        } while (jumlahSiswa <= 0);

        int[]kehadiran = new int[jumlahSiswa];
        double totalHari = 0.0;

        for (int i = 0; i < jumlahSiswa; i++) {
            do {
                System.out.print("Masukkan jumlah hari hadir siswa ke-" + (i + 1) + ": ");
                kehadiran[i] = s.nextInt();

                if (kehadiran[i] < 0 || kehadiran[i] > 24) {
                    System.out.println("Jumlah hari hadir harus antara 0 dan 24!");
                }
            } while (kehadiran[i] < 0 || kehadiran[i] > 24);

            totalHari += kehadiran[i];
        }

        System.out.println("\nRekap Kehadiran Siswa Selama 1 Bulan (Jumlah Hari Kerja: 24 Hari):");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Siswa ke-" + (i + 1) + ": " + kehadiran[i] + " hari hadir");
        }

        double rataRata = 0.0;
        rataRata = (double) totalHari / jumlahSiswa;

        System.out.println("\nRata-rata kehadiran siswa: " + rataRata + " hari");

        System.out.println("\nKesimpulan:");
        System.out.println("- Siswa yang kehadirannya di atas rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (kehadiran[i] > rataRata) {
                System.out.println("  - Siswa ke-" + (i + 1) + " (" + kehadiran[i] + " hari)");
            }
        }

        System.out.println("\n- Siswa yang kehadirannya di bawah rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (kehadiran[i] < rataRata) {
                System.out.println("  - Siswa ke-" + (i + 1) + " (" + kehadiran[i] + " hari)");
            }
        }

        s.close();
    }
}