package UKL;

import java.util.Scanner;

public class Soal3Sedang {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            int bilangan1 = (int) (Math.random() * 100);
            int bilangan2 = (int) (Math.random() * 100);
            int operator = (int) (Math.random() * 4);
            
            String soal = "";
            int jawabanBenar = 0;

            switch (operator) {
                case 0: 
                    soal = bilangan1 + " * " + bilangan2 + " = ?";
                    jawabanBenar = bilangan1 * bilangan2;
                    break;
                case 1: 
                    soal = bilangan1 + " / " + bilangan2 + " = ?";
                    jawabanBenar = bilangan1 / bilangan2;
                    break;
                case 2: 
                    soal = bilangan1 + " % " + bilangan2 + " = ?";
                    jawabanBenar = bilangan1 % bilangan2;
                    break;
                case 3:
                    soal =  bilangan1 + "+" + bilangan2 + " = ?";
                    jawabanBenar = bilangan1 + bilangan2;
            }

            System.out.println(soal);

            System.out.println("Jawaban Anda (ketik 'exit' untuk berhenti): ");
            String inputUser = s.nextLine();

            if (inputUser.equalsIgnoreCase("exit")) {
                System.out.println("Terima kasih telah bermain! Program dihentikan.");
                break;
            }

            try {
                int jawabanUser = Integer.parseInt(inputUser);

                if (jawabanUser == jawabanBenar) {
                    System.out.println("Jawaban benar!");
                } else {
                    System.out.println("Jawaban salah! Jawaban yang benar adalah " + jawabanBenar);
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid! Harap masukkan angka.");
            }
        }

        s.close();
    }
}
