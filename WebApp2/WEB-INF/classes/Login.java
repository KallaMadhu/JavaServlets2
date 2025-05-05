import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class Login extends GenericServlet{

    public void service(ServletRequest request,ServletResponse response)throws ServletException,IOException
    {
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        String email=request.getParameter("email");
        String pwd=request.getParameter("password");

        // out.println("Naakendukooo....Needi nuvvey vunchuko....<br>");
        // out.println("Email:="+email+"<br>");
        // out.println("pwd:="+pwd+"<br>");
        DbCon dbcon=new DbCon();
        if(dbcon.loginCheck(email, pwd)){
            out.println("Welcome to Madhu Tech Skills");
        }else{
            out.println("Invalid Userid/Password");
        }
        out.close();
    }
}