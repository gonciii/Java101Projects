package jdbcProject;

// JDBC İLE VERİTABANI UYGULMASI
import java.sql.*;

public class DBConn {
    public static final String DB_URL = "jdbc:postgresql://localhost:5432/university";
    public static final String DB_USER = "postgres";
    public static final String DB_PASSWORD = "gonca1";




    public static void main(String[] args) {

        Connection connection = null;
        // sql query
        String sqlQuery = "SELECT * FROM employees";

        try {
            // veri tabanı bağlantısı işlemi
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            // connection nesnesi ile statement oluşturma işlemi
            Statement statement = connection.createStatement();
            // resutSet nesnesine sorgu sonuçları aktarma işlemi
            ResultSet data = statement.executeQuery(sqlQuery);

            // tablo başlıkları için :
            System.out.println("-----------------------------------------------------------------");
            System.out.printf("%-5s | %-20s | %-20s | %-10s%n", "ID", "Name", "Position", "Salary");
            System.out.println("-".repeat(65));


            // döngü ile satır ve sütun okuma işlemi : :
            while (data.next()) {
                int id = data.getInt("id");
                String name = data.getString("name");
                String position  = data.getString("position");
                double salary = data.getDouble("salary");
                System.out.printf("%-5d | %-20s | %-20s | %-10.2f%n", id, name, position, salary);
            }


            data.close();
            statement.close();
            connection.close();


        }catch (SQLException e) {
            System.out.println("Exception Warning =>  " + e.getMessage());
        }


    }
}
