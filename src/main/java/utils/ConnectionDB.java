package utils;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ConnectionDB {

    public static Connection getConnection() {
        JSONParser parser = new JSONParser();
        Connection conn = null;
        try {
            String credentialsDir = System.getProperty("user.dir") + "\\src\\main\\java\\utils\\db_credentials.json";
            JSONObject credentialsJSON = (JSONObject) parser.parse(new FileReader(credentialsDir));
            String host = (String) credentialsJSON.get("db_ip");
            String port = (String) credentialsJSON.get("dp_port");
            String username = (String) credentialsJSON.get("db_user");
            String password = (String) credentialsJSON.get("db_password");
            String dbName = (String) credentialsJSON.get("db_name");
            String dbURL = String.format("jdbc:mysql://%s:%s /%s", host, port, dbName);
            conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Conectado");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;
    }
}
