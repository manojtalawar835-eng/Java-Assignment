/* 8b. Build a servlet program to create a cookie to get your name through text box and press submit button(
through HTML) to display the message by greeting Welcome back your name ! , you have visited this page
n times ( n = number of your visit ) along with the list of cookies and its setvalues and demonstrate the
expiry of cookie also
*/


package com.Cookies;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");

        int visitCount = 1;
        Cookie[] cookies = request.getCookies();

        // Find existing visitCount cookie
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitCount")) {
                    visitCount = Integer.parseInt(c.getValue());
                    visitCount++;
                }
            }
        }

        // Create/update visitCount cookie
        Cookie visitCookie = new Cookie("visitCount", String.valueOf(visitCount));
        visitCookie.setMaxAge(30); // expiry 30 sec
        response.addCookie(visitCookie);

        // Store username in cookie
        Cookie nameCookie = new Cookie("username", username);
        nameCookie.setMaxAge(30);
        response.addCookie(nameCookie);

        out.println("<html><body>");

        // Greeting message
        out.println("<h2>Welcome back " + username + "!</h2>");
        out.println("<p>You have visited this page " + visitCount + " times.</p>");
        out.println("<p><b>Cookie expires in 30 seconds</b></p>");

        // 8b: Show cookies with values
        out.println("<h3>Cookie List with Values:</h3>");

        if (cookies != null && cookies.length > 0) {
            for (Cookie c : cookies) {
                out.println("<p>Name: " + c.getName() +
                            " | Value: " + c.getValue() +
                            " | MaxAge: " + c.getMaxAge() + "</p>");
            }
        } else {
            out.println("<p>No cookies found</p>");
        }

        out.println("</body></html>");
    }
}