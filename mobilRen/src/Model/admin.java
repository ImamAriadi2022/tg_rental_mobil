package Model;
public class admin extends user{

    private operation[] operations = new operation[] {new addNewAdmin()};

    public admin() {
        super();
    }


    @Override
    public void showList(){
        System.out.println("\n1. tambahkan car baru");
        System.out.println("2. melihat list mobil");
        System.out.println("3. memperbarui mobil");
        System.out.println("4. menghapus mobil");
        System.out.println("5. menambahkan admin");
        System.out.println("6. Menampilkan rent");
        System.out.println("7. Keluar\n");
        
        int i = s.nextInt();
        operations[i].operation(database, s, this);
    }
}
