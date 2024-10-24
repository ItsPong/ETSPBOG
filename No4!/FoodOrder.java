import java.util.ArrayList;

class FoodOrder {
    private ArrayList<MenuItem> menuItems;  // Daftar menu yang dipesan
    private TotalPrice totalPrice;          // Total harga dari pesanan
    private IsPaid isPaid;                  // Status pembayaran

    // Konstruktor
    public FoodOrder() {
        this.menuItems = new ArrayList<>();  // Inisialisasi ArrayList untuk menu
        this.totalPrice = new TotalPrice();  // Inisialisasi total harga
        this.isPaid = new IsPaid();          // Inisialisasi status pembayaran
    }

    // Menambahkan item ke pesanan
    public void addItem(MenuItem item) {
        menuItems.add(item);  // Tambah menu ke daftar
        totalPrice.addAmount(item.getPrice());  // Tambah harga ke total
        System.out.println(item.getName() + " ditambahkan ke pesanan dengan harga Rp " + item.getPrice());
    }

    // Menghapus item dari pesanan
    public void removeItem(MenuItem item) {
        if (menuItems.contains(item)) {
            menuItems.remove(item);   // Hapus menu dari daftar
            totalPrice.subtractAmount(item.getPrice());  // Kurangi harga dari total
            System.out.println(item.getName() + " dihapus dari pesanan.");
        } else {
            System.out.println(item.getName() + " tidak ditemukan di dalam pesanan.");
        }
    }

    // Menandai pesanan sebagai sudah dibayar
    public void markAsPaid() {
        if (!isPaid.getPaymentStatus()) {
            isPaid.markAsPaid();
            System.out.println("Pesanan sudah dibayar.");
        } else {
            System.out.println("Pesanan ini sudah dibayar sebelumnya.");
        }
    }

    // Menampilkan detail pesanan
    public void getOrderDetails() {
        System.out.println("\nDetail Pesanan:");
        System.out.println("Menu yang dipesan:");
        for (MenuItem item : menuItems) {
            System.out.println("- " + item.getName());
        }
        System.out.println("Total Harga: Rp " + totalPrice.getTotalAmount());
        System.out.println("Status Pembayaran: " + (isPaid.getPaymentStatus() ? "Sudah Dibayar" : "Belum Dibayar"));
        System.out.println();
    }
}
