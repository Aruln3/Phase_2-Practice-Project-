import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UserLoginPage")
public class UserLoginPage  extends HttpServlet {
  
  
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    Set the content type
    response.setContentType("text/html");
    String userName = request.getParameter("userName");
    String userPassword = request.getParameter("userPassword");
    if(userName.equals("Arul") && userPassword.equals("JavaFSD")) {
    RequestDispatcher dispatcher = request.getRequestDispatcher("Dashboard");
      dispatcher.forward(request, response);   
    }
    else {
      response.getWriter().println("Invalid Username or password!!!");
//      Get the RequestDispatcher object
      RequestDispatcher dispatcher = request.getRequestDispatcher("/Index.html");
    
//      Forward the request
      dispatcher.include(request, response);
    }
  }
}