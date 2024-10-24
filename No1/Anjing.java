class Anjing extends Hewan {
    // Constructor
    public Anjing(String nama) {
        super(nama); // Memanggil constructor superclass
    }

    // Metode khusus untuk Anjing
    public void menggonggong() {
        System.out.println(nama + " sedang menggonggong.");
    }

    // Override metode bergerak dari superclass
    @Override
    public void bergerak() {
        System.out.println(nama + " sedang berlari.");
    }
}
