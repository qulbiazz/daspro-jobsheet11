public class Kubus22 {
    public static int VolumeKubus(int sisi) {
        return sisi * sisi * sisi;
    }

    public static int PermukaanKubus(int sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        int sisi = 4;
        int volKubus = VolumeKubus(sisi);
        int permukaanKubus = PermukaanKubus(sisi);

        System.out.println("Volume kubus dengan sisi " + sisi + " adalah: " + volKubus);
        System.out.println("Luas permukaan kubus dengan sisi " + sisi + " adalah: " + permukaanKubus);
    }
}
