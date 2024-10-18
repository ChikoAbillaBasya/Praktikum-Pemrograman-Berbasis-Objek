package UTS;
public class Komputer {
    String merk;
    int kecProcessor;
    int sizeMemory;
    String jnsProcessor;

    public Komputer(String merk, int kecProcessor, int sizeMemory, String jnsProcessor) {
        this.merk = merk;
        this.kecProcessor = kecProcessor;
        this.sizeMemory = sizeMemory;
        this.jnsProcessor = jnsProcessor;
    }

    public void tampilData() {
        System.out.println("=====================================");
        System.out.println("Merk                : " + merk);
        System.out.println("Kecepatan Processor : " + kecProcessor + " GHz");
        System.out.println("Ukuran Memory       : " + sizeMemory + " GB");
        System.out.println("Jenis Processor     : " + jnsProcessor);
    }
}