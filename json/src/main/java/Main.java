
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mysql.fabric.jdbc.FabricMySQLDriver;


import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    // private final String hostName = "localhost";
    private static final String URL = "jdbc:mysql://localhost:3306/data";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Gelik194muboirOpDecv_zion";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Driver driver;
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = null;


        ObjectMapper objectMapper = new ObjectMapper();
        Data data = new Data();
        data.setEmail("cogito@ergo.sum");
        String json = objectMapper.writeValueAsString(data);
        Data c = new Data();
        c.setEmail("cogito1@ergo.sum");
        String jsonTwo = objectMapper.writeValueAsString(c);


        try {
            driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
        } catch (SQLException e) {
            System.out.println("Произошла ошибка при создании драйвера");
            return;
        }

        try {
            DriverManager.registerDriver(driver);
        } catch (SQLException e) {
            System.out.println("Не удалось зарегистрировать драйвер.");
            return;
        }

        try  {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from post_request.data");
            statement.execute("INSERT INTO data(json) VALUES" + json);
            statement.execute("INSERT INTO data(json) VALUES" + jsonTwo);
        } catch (SQLException e) {
            System.out.println("Не удалось соединение.");
            return;
        }








    }
}


