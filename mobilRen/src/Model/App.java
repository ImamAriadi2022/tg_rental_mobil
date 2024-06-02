package Model;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        database database = new database();
        user currentUser = null;

        while (true) {
            System.out.println("1. Login sebagai Admin");
            System.out.println("2. Login sebagai Client");
            System.out.println("3. Exit\n");
            System.out.println("Pilih menu: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Logika untuk login admin
                    currentUser = new admin();
                    break;
                case 2:
                    // Logika untuk login client
                    currentUser = new client();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
            
            if(currentUser != null){
                while(true){
                    currentUser.showList(database, scanner);
                    break;
                }
            }
        }
    }
}