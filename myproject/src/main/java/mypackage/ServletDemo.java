package mypackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletDemo extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException{


        Cookie cookie = new Cookie("sessionid","123456789");
        cookie.setMaxAge(60*60); //1 hour
        response.addCookie(cookie);

    }
}
