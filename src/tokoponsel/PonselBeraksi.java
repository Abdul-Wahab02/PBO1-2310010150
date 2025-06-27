
package tokoponsel;

public class PonselBeraksi {
    public static void main(String[] args) {
        Ponsel Samsung = new Ponsel();
        Ponsel Vivo = new Ponsel();
        
        Samsung.merek = "Samsung";
        Samsung.harga = 4000000;
        Samsung.batrai = 5000;
        Vivo.merek = "Vivo";
        Vivo.harga = 3000000;
        Vivo.batrai = 4000;
        
        System.out.println("merek: "+Samsung.merek);
        System.out.println("harga: "+Samsung.harga);
        System.out.println("batrai: "+Samsung.batrai);
        System.out.println("merek: "+Vivo.merek);
        System.out.println("harga: "+Vivo.harga);
        System.out.println("batrai: "+Vivo.batrai);
    }
}
