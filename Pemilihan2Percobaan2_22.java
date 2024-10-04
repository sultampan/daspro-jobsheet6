import java.util.Scanner;
public class Pemilihan2Percobaan2_22 {
    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);

        String menu, member;
        double harga = 0, total_bayar, diskon = 0;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Kopi");
        System.out.println("2. Teh");
        System.out.println("3. Roti");
        System.out.println("-------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        menu = input22.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input22.nextLine();
        System.out.println("-------------------------------------");

        // Cek apakah member
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10; // Diskon 10%
            System.out.println("Besar diskon = 10%");
            
            // Cek menu yang dipilih dengan equalsIgnoreCase
            if (menu.equalsIgnoreCase("1")) {
                harga = 12000;
                System.out.println("Harga Kopi = " + harga);
            } else if (menu.equalsIgnoreCase("2")) {
                harga = 7000;
                System.out.println("Harga Teh = " + harga);
            } else if (menu.equalsIgnoreCase("3")) {
                harga = 20000;
                System.out.println("Harga Roti = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
            System.out.println("-------------------------------------");

        // Jika tidak punya member
        } else if (member.equalsIgnoreCase("n")) {
            if (menu.equalsIgnoreCase("1")) {
                harga = 12000;
                System.out.println("Harga Kopi = " + harga);
            } else if (menu.equalsIgnoreCase("2")) {
                harga = 7000;
                System.out.println("Harga Teh = " + harga);
            } else if (menu.equalsIgnoreCase("3")) {
                harga = 20000;
                System.out.println("Harga Roti = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            System.out.println("Total bayar = " + harga);
        } else {
            System.out.println("Member tidak valid");
        }
    }
}
