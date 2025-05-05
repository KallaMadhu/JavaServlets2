import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
public class WelcomeServlet extends HttpServlet{

    public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {   
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        String uname=req.getParameter("uname");
        //uname=request.GET['uname']
        out.println("Welcome..."+uname);
        out.close();
    }
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
        doPost(req, res);
    }
}