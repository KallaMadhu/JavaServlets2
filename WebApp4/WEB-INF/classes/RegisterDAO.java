import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDAO {
       private Connection con;
       public RegisterDAO(){
            try{
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?user=root&password=madhu");    
            }catch(SQLException ex){
                ex.printStackTrace();
            }            
       }
       public boolean doRegister(Register register){
            boolean flag=false;
            try{
                PreparedStatement pstmt=con.prepareStatement("insert into register(fullname,email,pwd,phone) values(?,?,?,?)");
                pstmt.setString(1, register.getFullname());
                pstmt.setString(2, register.getEmail());
                pstmt.setString(3, register.getPwd());
                pstmt.setString(4, register.getPhone());
                pstmt.executeUpdate();
                flag=true;
            }catch(SQLException ex){
                System.out.println("error while doregister");
                ex.printStackTrace();
            }
            return flag;
       }
}
