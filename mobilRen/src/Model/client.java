package Model;
public class client extends user{

    public client() {
        super();
    }
    
    @Override
    public void showList(database database, Scanner s){
        System.out.println("\n1. melihat mobil");
        System.out.println("2. Rent mobil");
        System.out.println("3. Mengembalikan mobil");
        System.out.println("4. menampilkan mobil saya");
        System.out.println("5. edit data saya");
        System.out.println("6. keluar\n");
    }

}
