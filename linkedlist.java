class Node {
    String name; // Nama pelanggan
    Node next;   // Pointer ke pelanggan berikutnya

    // Constructor untuk membuat node baru
    public Node(String name) {
        this.name = name; // Simpan data pelanggan
        this.next = null; // Awalnya, pelanggan tidak punya penerus
    }
}
class CustomerQueue {
    private Node head; // Head menunjuk ke pelanggan pertama

    // Constructor untuk membuat antrian kosong
    public CustomerQueue() {
        this.head = null; // Awalnya tidak ada pelanggan
    }

    // Tambahkan pelanggan di awal antrian
    public void addCustomerAtBeginning(String name) {
        Node newCustomer = new Node(name); // Membuat pelanggan baru
        newCustomer.next = head;          // Pelanggan baru menunjuk ke head saat ini
        head = newCustomer;               // Head sekarang menjadi pelanggan baru
    }

    // Tambahkan pelanggan di akhir antrian
    public void addCustomerAtEnd(String name) {
        Node newCustomer = new Node(name); // Membuat pelanggan baru
        if (head == null) { // Jika antrian kosong
            head = newCustomer; // Pelanggan baru menjadi pelanggan pertama
            return;
        }
        Node last = head; // Mulai dari pelanggan pertama
        while (last.next != null) { // Cari pelanggan terakhir
            last = last.next; // Pindah ke pelanggan berikutnya
        }
        last.next = newCustomer; // Hubungkan pelanggan baru di akhir
    }

    // Menampilkan semua pelanggan dalam antrian
    public void displayQueue() {
        Node current = head; // Mulai dari pelanggan pertama
        while (current != null) { // Traversal melalui semua pelanggan
            System.out.print(current.name + " -> "); // Cetak nama pelanggan
            current = current.next; // Pindah ke pelanggan berikutnya
        }
        System.out.println("None"); // Menandai akhir antrian
    }
}
public class linkedlist {
    public static void main(String[] args) {
        CustomerQueue queue = new CustomerQueue(); // Membuat antrian baru

        // Tambahkan pelanggan
        queue.addCustomerAtBeginning("Alice"); // Alice masuk di depan
        queue.addCustomerAtBeginning("Bob");   // Bob masuk di depan
        queue.addCustomerAtEnd("Charlie");     // Charlie masuk di belakang
        queue.addCustomerAtEnd("David");       // David masuk di belakang

        // Tampilkan hasil antrian
        System.out.println("Antrian Pelanggan di Kafe:");
        queue.displayQueue(); // Output: Bob -> Alice -> Charlie -> David -> None
    }
}
