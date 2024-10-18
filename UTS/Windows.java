package UTS;
public class Windows extends Laptop {
    String fitur;

    public Windows(String merk, int kecProcessor, int sizeMemory, String jnsProcessor, String jnsBatre, String fitur) {
        super(merk, kecProcessor, sizeMemory, jnsProcessor, jnsBatre);
        this.fitur = fitur;
    }

    public void tampilWindows() {
        tampilLaptop();
        System.out.println("Fitur               : " + fitur);
        System.out.println("=====================================");
    }
}