class ParkingTicketMachine {
    // Atribut
    private int balance;        // Saldo yang dimasukkan pengguna
    private final int ticketPrice;  // Harga tiket per jam
    private int ticketTime;      // Jumlah waktu parkir yang dibeli dalam jam

    // Konstruktor untuk menginisialisasi harga tiket per jam
    public ParkingTicketMachine(int ticketPrice) {
        this.ticketPrice = ticketPrice;
        this.balance = 0;
        this.ticketTime = 0;
    }

    // Metode untuk memasukkan uang ke dalam mesin
    public void insertMoney(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Uang yang dimasukkan: Rp " + amount);
        } else {
            System.out.println("Masukkan jumlah uang yang valid.");
        }
    }

    // Metode untuk mengeluarkan tiket parkir berdasarkan saldo
    public void issueTicket() {
        if (balance >= ticketPrice) {
            ticketTime = balance / ticketPrice; // Menghitung jumlah jam yang dibeli
            balance -= ticketTime * ticketPrice; // Mengurangi saldo sesuai waktu yang dibeli
            System.out.println("Tiket dikeluarkan untuk " + ticketTime + " jam parkir.");
            System.out.println("Sisa saldo: Rp " + balance);
        } else {
            System.out.println("Saldo tidak cukup untuk membeli tiket.");
        }
    }

    // Metode untuk mendapatkan jumlah jam parkir yang telah dibeli
    public int getTimePurchased() {
        return ticketTime;
    }

    // Metode untuk mencetak status saldo dan waktu parkir
    public void printStatus() {
        System.out.println("Saldo saat ini: Rp " + balance);
        System.out.println("Waktu parkir yang dibeli: " + ticketTime + " jam.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek ParkingTicketMachine dengan harga tiket Rp5.000 per jam
        ParkingTicketMachine mesinTiket = new ParkingTicketMachine(5000);

        // Simulasi pengguna memasukkan uang dan mengeluarkan tiket
        mesinTiket.insertMoney(10000);  // Masukkan Rp10.000
        mesinTiket.issueTicket();       // Mengeluarkan tiket
        mesinTiket.printStatus();       // Menampilkan saldo dan waktu parkir

        mesinTiket.insertMoney(3000);   // Masukkan Rp3.000 (kurang dari harga tiket)
        mesinTiket.issueTicket();       // Tidak cukup untuk mengeluarkan tiket
        mesinTiket.printStatus();       // Menampilkan status terbaru
    }
}
