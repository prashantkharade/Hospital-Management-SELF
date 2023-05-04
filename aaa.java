import java.sql.*;

public class aaa {
    public static void main(String[] args)throws ClassNotFoundException {
        aaa con = new aaa();
        con.get_connection();
    }

    public Connection get_connection() {
        Connection connection = null;
        /*
         * String host = "localhost";
         * String port="5432";
         * String db_name="college";
         * String username="postgres";
         * String password="ubuntu";
         */
        try {
//            Class.forName("com.mysql/jdbc.Driver");
//connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "Ppk@3721");
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hospital?autoReconnect=true&useSSL=false","root", "Ppk@3721");
            if (connection != null) {
                System.out.println("Connection OK");
            } else {
                System.out.println("Connection Failed");
            }
        } catch (Exception e) {
            //e.printStackTrace();
        	 System.out.println(e+"  connection not done");
        }
        return connection;
    }
}