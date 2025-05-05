import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.ServletException;
public class MyServlet extends GenericServlet{
    @Override
    public void service(ServletRequest request,ServletResponse response)throws ServletException,IOException
    {   
        //setContentType() methods is used to set the type of response the servlet is sending to the client(browser)
        response.setContentType("text/html");
        //getWriter(): this methods returns a PrintWriter class object
        PrintWriter out=response.getWriter();
        out.println("<h1>Bagunnaraaaaa....</h1>");
        out.println("<h1>Bagunnaraaaaa....</h1>");
        out.println("<h1>Bagunnaraaaaa....</h1>");
        out.println("<h1>Bagunnaraaaaa....</h1>");
        out.println("<h1>Bagunnaraaaaa....</h1>");
        out.println("<h1>Bagunnaraaaaa....</h1>");
        out.close();
    }
}