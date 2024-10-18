package UTS;
public class Main {
    public static void main(String[] args) {
        Mac mac = new Mac("Apple", 3, 16, "M1", "Lithium", "Face ID");
        Windows windows = new Windows("Dell", 2, 8, "Intel i7", "Lithium", "Cortana");
        Pc pc = new Pc("HP", 4, 32, "AMD Ryzen", 27);

        System.out.println("======== Data Mac ========");
        mac.tampilMac();
        System.out.println();

        System.out.println("====== Data Windows ======");
        windows.tampilWindows();
        System.out.println();

        System.out.println("======== Data PC ========");
        pc.tampilPc();
    }
}