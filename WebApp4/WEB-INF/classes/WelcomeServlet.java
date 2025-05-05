import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
public class WelcomeServlet extends HttpServlet{

    public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {   
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        String email=req.getParameter("email");
        String pwd=req.getParameter("pwd");
        String fullname=req.getParameter("fullname");
        String phone=req.getParameter("phone");

        Register register=new Register(email,pwd,fullname,phone);
        RegisterDAO dao=new RegisterDAO();
        
        if(dao.doRegister(register))
            //out.println("You Have Been Registered Successfully..");
            res.sendRedirect("login.html");
        else
            out.println("Registration Failed...");
        out.close();
    }
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
        doPost(req, res);
    }
}