import java.util.ArrayList;
import java.util.Scanner;

public class OrderApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Nasi Goreng", 25000));
        menuItems.add(new MenuItem("Mie Ayam", 20000));
        menuItems.add(new MenuItem("Es Teh", 5000));

        Order order = new Order();

        System.out.println("Menu:");
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%d. %s - Rp %.2f\n", i + 1, menuItems.get(i).name, menuItems.get(i).price);
        }

        while (true) {
            System.out.print("Pilih nomor menu (0 untuk selesai): ");
            int choice = scanner.nextInt();
            if (choice == 0) {
                break;
            }
            if (choice > 0 && choice <= menuItems.size()) {
                MenuItem selectedItem = menuItems.get(choice - 1);
                System.out.print("Masukkan jumlah: ");
                int quantity = scanner.nextInt();
                order.addItem(selectedItem, quantity);
            } else {
                System.out.println("Nomor menu tidak valid. Coba lagi.");
            }
        }
        order.printReceipt();
    }
}

