package tugas4;

public class Mobil extends Kendaraan {
    private int jumlahPintu; 

    public Mobil(String merk, int kecepatan, int jumlahPintu) {
        super(merk, kecepatan); 
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void info() {
        System.out.println("Mobil " + getMerk() + " dengan " + jumlahPintu + " pintu melaju " + getKecepatan() + " km/jam");
    }
}