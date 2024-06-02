package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner; // Perbaiki import yang salah (until -> util)

public class addNewAdmin implements operation {

    @Override
    public void operations(database database, Scanner scanner, user user) { // Hapus parameter user yang tidak digunakan
        System.out.println("Masukan nama pertama: ");
        String firstName = scanner.next(); // Gunakan 'scanner' yang benar
        System.out.println("Masukan nama terakhir: ");
        String lastName = scanner.next();
        System.out.println("Masukan email: ");
        String email = scanner.next();
        System.out.println("Masukan nomor telpon: ");
        String phoneNumber = scanner.next();
        System.out.println("Masukan password: ");
        String password = scanner.next();
        System.out.println("Konfirmasi password: ");
        String confirmPassword = scanner.next();

        while (!password.equals(confirmPassword)) {
            System.out.println("Password tidak cocok!"); // Perbaiki pesan error
            System.out.println("Masukan password: ");
            password = scanner.next(); // Hindari deklarasi ulang variabel
            System.out.println("Konfirmasi password: ");
            confirmPassword = scanner.next();
        }

        int accType = 1;

        try {
            ResultSet rs = database.getStatement().executeQuery("SELECT COUNT(*) FROM users"); // Perbaiki query SQL
            rs.next();
            int ID = rs.getInt(1) + 1; // ID dimulai dari 1, bukan 0

            String insert = "INSERT INTO `users`(`ID`, `FirstName`, `LastName`, `Email`, `PhoneNumber`, `Password`, `Type`) " +
                    "VALUES (" + ID + ",'" + firstName + "','" + lastName + "','" + email + "','" + phoneNumber + "','" + password + "'," + accType + ")";

            database.getStatement().executeUpdate(insert);
            System.out.println("Admin akun berhasil dibuat\n");
        } catch (SQLException e) {
            e.printStackTrace(); 
        }
    }
}
