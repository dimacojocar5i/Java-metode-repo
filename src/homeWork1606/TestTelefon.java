package homeWork1606;

public class TestTelefon {
    static void main(String[] args) {
     Telefon telefon = new Telefon();

     System.out.println();
     System.out.println(telefon.pornesteTelefon());
     System.out.println(telefon.opresteTelefon());

     TelefonSmart telefonSmart = new TelefonSmart();

     System.out.println();
     System.out.println(telefonSmart.pornesteTelefon());
     System.out.println(telefonSmart.opresteTelefon());
     System.out.println(telefonSmart.deschideCamera());
     System.out.println(telefonSmart.pornesteBluetooth());






    }

}
