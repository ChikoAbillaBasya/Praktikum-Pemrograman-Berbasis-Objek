package UTS;
public class Mac extends Laptop {
    String security;

    public Mac(String merk, int kecProcessor, int sizeMemory, String jnsProcessor, String jnsBatre, String security) {
        super(merk, kecProcessor, sizeMemory, jnsProcessor, jnsBatre);
        this.security = security;
    }

    public void tampilMac() {
        tampilLaptop();
        System.out.println("Keamanan            : " + security);
        System.out.println("=====================================");
    }
}