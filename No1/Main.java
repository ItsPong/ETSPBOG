public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Anjing
        Anjing anjing1 = new Anjing("Bulldog");

        // Menggunakan metode dari superclass dan subclass
        anjing1.bergerak();      // Output: Bulldog sedang berlari. (Override)
        anjing1.menggonggong();  // Output: Bulldog sedang menggonggong.
    }
}