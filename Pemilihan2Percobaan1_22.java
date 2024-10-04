import java.util.Scanner;

public class Pemilihan2Percobaan1_22 {

    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);

        System.out.print("Masukkan Tahun: ");
        int tahun = input22.nextInt();

        if (tahun % 4 == 0) {
            if (tahun % 100 == 0) {
                if (tahun % 400 == 0) {
                    System.out.println("Tahun Kabisat");
                } else {
                    System.out.println("Bukan tahun kabisat");
                }
            } else {
                System.out.println("Tahun Kabisat");
            }
        } else {
            System.out.println("Bukan tahun kabisat");
        }

        input22.close();
    }
}
