import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    static Connection con;
    public static Connection createDBConnection(){

        try{
            //load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //get connection
            String url ="jdbc:mysql://localhost:3306/Playa";
            String username ="root";
            String password = "Vallejo707";
            con = DriverManager.getConnection(url,username,password);
        } catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }


}
