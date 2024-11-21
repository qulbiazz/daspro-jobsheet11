import java.util.Scanner;

public class Kafe22 {

    public static int hitungTotalHarga22(int pilihanMenu, int banyakItem, String kodePromo) {

        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equals("DISKON50")) {
            hargaTotal = (int) (hargaTotal * 0.5);
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal = (int) (hargaTotal * 0.7);
        } else if (!kodePromo.equalsIgnoreCase(" ")) {
            System.out.println("kode invalid dan tidak ada pengurangan total harga");
        }
        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("====MENU KAFE RESTO====");
            System.out.println("1. Kopi Hitam - Rp. 15.000");
            System.out.println("2. Capuccino - Rp. 20.000");
            System.out.println("3. Latte - Rp. 22.000");
            System.out.println("4. Teh Tarik - Rp. 12.000");
            System.out.println("5. Roti Bakar - Rp. 10.000");
            System.out.println("6. Mie Goreng - Rp. 18.000");
            System.out.println("==========================");
            System.out.print("Silahkan pilih menu yang Anda inginkan (1-6): ");
            int pilihanMenu = input.nextInt();

            if (pilihanMenu == 0) {
                break;
            }
            System.out.print("Masukkan jumlah item yang ingin anda pesan: ");
            int banyakItem = input.nextInt();
            System.out.print("Masukkan kode promo jika ada: ");
            input.nextLine();
            String kodePromo = input.nextLine();

            int totalHarga = hitungTotalHarga22(pilihanMenu, banyakItem, kodePromo);

            System.out.println("Total harga untuk pesanan ini: Rp. " + totalHarga);
            System.out.println("-----------------------------------------");
        }

    }
}