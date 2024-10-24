
public class Main {
    public static void main(String[] args) {
        // Membuat objek Book dan menginisialisasi atribut melalui konstruktor
        Book buku1 = new Book("Pemrograman Java", "John Doe", 2021, "Penerbit Informatika", "Teknologi");
        Book buku2 = new Book("Fiksi Fantasi", "Jane Smith", 2019, "Penerbit Imaginasi", "Fiksi");

        // Mencetak detail buku
        buku1.printDetails();
        buku2.printDetails();
    }
}
