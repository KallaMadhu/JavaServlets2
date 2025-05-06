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
        RequestDispatcher rd =req.getRequestDispatcher("login.html");
        out.println("<h1>Start</h1>");
        if(dao.doRegister(register))
            //out.println("You Have Been Registered Successfully..");
            //res.sendRedirect("login.html");
            //rd.forward(req,res);
            rd.include(req,res);
        else
            out.println("Registration Failed...");
        out.println("<h1>End</h1>");
        out.close();
    }
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
        doPost(req, res);
    }
}