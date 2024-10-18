package UTS;
public  class Laptop extends Komputer {
    String jnsBatre;

    public Laptop(String merk, int kecProcessor, int sizeMemory, String jnsProcessor, String jnsBatre) {
        super(merk, kecProcessor, sizeMemory, jnsProcessor);
        this.jnsBatre = jnsBatre;
    }

    public void tampilLaptop() {
        tampilData();
        System.out.println("Jenis Batre         : " + jnsBatre);
    }
}