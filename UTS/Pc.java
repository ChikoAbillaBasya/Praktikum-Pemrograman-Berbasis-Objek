package UTS;
public class Pc extends Komputer {
    int ukuranMonitor;

    public Pc(String merk, int kecProcessor, int sizeMemory, String jnsProcessor, int ukuranMonitor) {
        super(merk, kecProcessor, sizeMemory, jnsProcessor);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilPc() {
        tampilData();
        System.out.println("Ukuran Monitor      : " + ukuranMonitor + " inci");
        System.out.println("=====================================");
    }
}