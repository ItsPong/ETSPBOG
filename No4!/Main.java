public class Main {
    public static void main(String[] args) {
        // Membuat objek FoodOrder
        FoodOrder order1 = new FoodOrder();

        // Membuat beberapa MenuItem
        MenuItem nasiGoreng = new MenuItem("Nasi Goreng", 25000);
        MenuItem ayamBakar = new MenuItem("Ayam Bakar", 35000);
        MenuItem esTeh = new MenuItem("Es Teh", 5000);

        // Menambahkan item ke pesanan
        order1.addItem(nasiGoreng);
        order1.addItem(ayamBakar);
        order1.addItem(esTeh);

        // Menampilkan detail pesanan
        order1.getOrderDetails();

        // Menghapus item dari pesanan
        order1.removeItem(ayamBakar);

        // Menampilkan detail pesanan setelah penghapusan
        order1.getOrderDetails();

        // Menandai pesanan sebagai sudah dibayar
        order1.markAsPaid();

        // Menampilkan detail pesanan setelah pembayaran
        order1.getOrderDetails();
    }
}
