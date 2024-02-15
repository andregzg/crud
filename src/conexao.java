import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {
    private static final String USERNAME = "root";

    private static final String PASSWORD = "";

    private static final String DATABASE_URL = "jdbc:mysql://127.0.0.1:3306/agenda";

    public static Connection creaConnectionToMySQL() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD)) {
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) throws Exception {
        Connection con = creaConnectionToMySQL();

        if (con != null) {
            System.out.println("Conexão obtida com sucesso");
        }
    }

}
