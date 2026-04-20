 /*6b. Build a servlet program to create a cookie to get your name through text box and press submit button(
through HTML) to display the message by greeting Welcome back your name ! , you have visited this page
n times ( n = number of your visit ) and demonstrate the expiry of cookie also
*/



package com.cookieservlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Handle GET requests
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // Get username from request (first-time login)
        String userName = request.getParameter("userName");
        if (userName != null && !userName.isEmpty()) {
            Cookie userCookie = new Cookie("user", userName);
            userCookie.setMaxAge(60); // expires in 1 minute
            response.addCookie(userCookie);

            Cookie visitCookie = new Cookie("visits", "1");
            visitCookie.setMaxAge(60);
            response.addCookie(visitCookie);
        }

        // Read cookies
        Cookie[] cookies = request.getCookies();
        String existingUser = null;
        int visits = 0;

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("user")) {
                    existingUser = cookie.getValue();
                }
                if (cookie.getName().equals("visits")) {
                    visits = Integer.parseInt(cookie.getValue());
                }
            }
        }

        // Generate HTML response
        out.println("<html><head><title>Cookie Example</title></head><body>");
        if (existingUser != null && !existingUser.isEmpty()) {
            visits++;
            Cookie visitCookie = new Cookie("visits", String.valueOf(visits));
            visitCookie.setMaxAge(60);
            response.addCookie(visitCookie);

            out.println("<font color=blue><h2>Welcome back, " + existingUser + "!</h2></font>");
            out.println("<font color=magenta><h2>You have visited this page " + visits + " times!</h2></font>");
            out.println("<form action='CookieServlet' method='post'>");
            out.println("<input type='submit' value='Logout'>");
            out.println("</form>");
        } else {
            out.println("<h2 style='color:red;'>Welcome Guest! Kindly login</h2>");
            out.println("<form action='CookieServlet' method='get'>");
            out.println("Enter your name: <input type='text' name='userName'>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
        }
        out.println("</body></html>");
    }

    // Handle POST requests (logout)
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Delete cookies
        Cookie userCookie = new Cookie("user", "");
        userCookie.setMaxAge(0);
        response.addCookie(userCookie);

        Cookie visitCookie = new Cookie("visits", "");
        visitCookie.setMaxAge(0);
        response.addCookie(visitCookie);

        // Redirect back to login page
        response.sendRedirect("CookieServlet");
    }
}
