package UKL;

public class Soal3Mudah {
    public static void main(String[] args) {
        for (int i = 50; i >= 1; i--) {
            if (i == 1) {
                System.out.println(i + ". saya senang");
            } else if (i % 6 == 2 || i % 6 == 4) { 
                System.out.println(i + ". saya anak moklet");
            } else if (i % 6 == 1 || i % 6 == 5) { 
                System.out.println(i + ". saya anak wikusama");
            } else if (i % 3 == 0) {  
                System.out.println(i + ". saya angkatan 33");
            }
        }
    }
}