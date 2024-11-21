public class PengunjungCafe22 {
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar nama pengunjung");
        for(String nama:namaPengunjung){
            System.out.println("- " +nama);
        }
    }
    public static void daftarPengunjungDenganUsia(String[] kelaminPengunjung, String... namaPengunjung) {
        System.out.println("Daftar nama dan Kelamin pengunjung:");
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println(namaPengunjung[i] + " (Kelamin: " + kelaminPengunjung[i] + ")");
        }
    }
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        String[] kelamin = {"L", "L", "P"};
        daftarPengunjungDenganUsia(kelamin, "Ali", "Budi", "Citra");
    }
}
