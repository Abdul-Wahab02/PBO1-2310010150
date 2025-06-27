package tugas4;

public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil("Toyota", 120, 4);  
        Kendaraan motor = new Motor("Yamaha", 90, "Sport"); 

        Kendaraan[] daftarKendaraan = { mobil, motor };

        for (Kendaraan k : daftarKendaraan) {
            k.info();
        }
    }
}