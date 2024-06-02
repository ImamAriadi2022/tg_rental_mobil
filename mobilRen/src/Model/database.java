package Model;

public class database {
    private String user = "user";
    private String password = "password";
    private String url = "jdbc:mysql://localhost/carentallsystem"
    private Statement statement;

    public database() {
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
            ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public statement getStatement() {
        return statement;
    }

}
