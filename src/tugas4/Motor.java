package tugas4;

public class Motor extends Kendaraan {
    private String tipe; 

    public Motor(String merk, int kecepatan, String tipe) {
        super(merk, kecepatan); 
        this.tipe = tipe;       
    }

    @Override
    public void info() {
        System.out.println("Motor " + getMerk() + " tipe " + tipe + " melaju " + getKecepatan() + " km/jam");
    }
}