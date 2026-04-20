/* 10.a Build an Application to get Username,Email and Designation through JSP called index.jsp with
client sided validation and submit to the servlet called UserDataServlet and process all the fields with
server sided validation and display all the data through result.jsp with a link to move to the client side
*/




package com.Cookies;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/UserDataServlet")
public class UserDataServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String designation = request.getParameter("designation");

        // Server-side validation
        if (username == null || username.isEmpty() ||
            email == null || !email.contains("@") ||
            designation == null || designation.isEmpty()) {

            response.getWriter().println("Invalid Input!");
            return;
        }

        request.setAttribute("username", username);
        request.setAttribute("email", email);
        request.setAttribute("designation", designation);

        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);
    }
}
