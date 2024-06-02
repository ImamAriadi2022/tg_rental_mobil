package Model;

import java.util.Scanner;

public class admin extends user{

    private operation[] operations = new operation[] {
        new addNewAdmin(),
    };

    public admin() {
        super();
    }


    @Override
    public void showList(database database, Scanner scanner){
        System.out.println("\n1. tambahkan car baru");
        System.out.println("2. melihat list mobil");
        System.out.println("3. memperbarui mobil");
        System.out.println("4. menghapus mobil");
        System.out.println("5. menambahkan admin");
        System.out.println("6. Menampilkan rent");
        System.out.println("7. Keluar\n");
        
        System.out.println("Pilih admin menu:");
        int i = scanner.nextInt();
        
        operations[i].operations(database, scanner, this);
    }
}
