package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String pass = request.getParameter("pass");
        if(username.equals("anel") && pass.equals("Anel")) {
            HttpSession session = request.getSession();
          session.setAttribute("username", username);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/page-1.jsp");
            dispatcher.forward(request,response);
        }
        else {
            response.sendRedirect("login.jsp");
        }
    }
}
