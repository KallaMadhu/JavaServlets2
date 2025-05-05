import java.io.PrintWriter;
import jakarta.servlet.*;
public class MyServlet implements Servlet
{
    private ServletConfig config;
    public void init(ServletConfig config) throws jakarta.servlet.ServletException{              
        System.out.println("init method is invoked..");        
        this.config=config;
    }
    public ServletConfig getServletConfig(){
        return config;
    }
    public void service(ServletRequest req, ServletResponse res) throws jakarta.servlet.ServletException, java.io.IOException{
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        out.println("hello<br>");
        out.close();
        System.out.println("service method is invoked");
    }
    public String getServletInfo(){
        return "Myservlet Created by Madhu";
    }
    public void destroy(){
        System.out.println("servlet destroy method is invoked...");
        System.out.println("service chachipoyindeeee....");
    }
}