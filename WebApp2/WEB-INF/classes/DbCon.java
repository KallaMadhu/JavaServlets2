import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DbCon {
    private Connection con;
    public DbCon(){
        try{
            //Class.forName("com.mysql.cj.jdbc.Driver");
            //System.out.println("Driver is loaded");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root" , "madhu");
           System.out.println("connection established");
        }catch(Exception ex){
            System.out.println("Connection Failed");
        }
    }
    public boolean loginCheck(String email,String password){
        boolean flag=false;
        try{
            PreparedStatement pstmt=con.prepareStatement("select * from register where email=? and password=?");
            pstmt.setString(1, email);
            pstmt.setString(2, password);
            ResultSet rs= pstmt.executeQuery();
            if(rs.next()){
                flag=true;
            }
        }catch(SQLException ex)
        {
            System.out.println("Error while checking...");
            ex.printStackTrace();
        }
        return flag;
    }
    public static void main(String[] args) {
        new DbCon();
    }
}