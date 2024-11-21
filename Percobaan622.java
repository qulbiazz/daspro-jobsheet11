import java.util.Scanner;

public class Percobaan622{
    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);

    //     int p,l,t,L,vol;

    //     System.out.println("masukkan panjang");
    //     p=input.nextInt();
    //     System.out.println("masukkan lebar");
    //     l=input.nextInt();
    //     System.out.println("masukkan tinggi");
    //     t=input.nextInt();

    //     L=p*l;
    //     System.out.println("luas persegi panjang adalah " +L);

    //     vol = p*l*t;
    //     System.out.println("volume balok adalah " +vol);

        
    // }

    static int HitungLuas (int pjg, int lb){
        int luas = pjg *lb;
        return luas;
    }
    static int HitungVolume (int tinggi, int a, int b){
        int volume = HitungLuas(a, b) * tinggi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p,l,t,L,vol;

        System.out.println("masukkan panjang");
        p=input.nextInt();
        System.out.println("masukkan lebar");
        l=input.nextInt();
        System.out.println("masukkan tinggi");
        t=input.nextInt();

        L=HitungLuas(p, l);
        System.out.println("luas persegi panjang adalah " +L);

        vol = HitungVolume(t, p, l);
        System.out.println("volume balok adalah " +vol);

        
    }
}