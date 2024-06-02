package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.until.Scanner;

import Model.database;
import Model.user;
import Model.operation;

public class addNewAdmin implements Operation{
    

    @Override
    public void operation(Database database, Scanner s , user user){
        System.out.println("Masukan nama pertama: ");
        String firstName = s.next();
        System.out.println("masukan nama terakhir: ");
        String lastName = s.next();
        System.out.println("masukan email: ");
        String email = s.next();
        System.out.println("masukan nomor telpon: ");
        String phoneNumber = s.next();
        System.out.println("masukan password: ");
        String password = s.next();
        System.out.println("konfirmasi password: ");
        String confirmPassword = s.next();
        while (!password.equals(confirmPassword)){
            System.out.println("password salah");
            System.out.println("masukan password: ");
            String password = s.next();
            System.out.println("konfirmasi password: ");
            String confirmPassword = s.next();
        }
        int accType = 1;

        try {
            ResultSet rs = database.getStatement().executeQuery("SELECT COUNT(*);");
            rs.next();
            int ID = rs.getInt("COUNT(*)")-1;

            String insert = "INSERT INTO `users`(`ID`, `FirstName`, `LastName`, `Email`, `PhoneNumber`, `Password`, `Type`) 
                                VALUES ('"+ID"','"firstName"','"+lastName"','"+email"','"+phoneNumer"','"+password"','"+type"');";
                                database.getStatement().executeUpdate(insert);
                                system.out.println("Admin akun berhasil dibuat\n")
        } catch (SQLException e) {
            //todo handle exception
            e.printStackTrace();
    }
}