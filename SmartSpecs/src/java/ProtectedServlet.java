/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sweibelzahl
 */
@WebServlet(name="ProtectedServlet", urlPatterns={"/ProtectedServlet"})
public class ProtectedServlet extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    // Get the session
    HttpSession session = request.getSession();

    // Does the session indicate this user already logged in?
    Object done = session.getAttribute("logon.isDone");  // marker object
    if (done == null) {
      // No logon.isDone means she hasn't logged in.
      // Save the request URL as the true target and redirect to the login page.
      session.setAttribute("login.target", request.getRequestURI().toString());
      response.sendRedirect(request.getContextPath() + "/login.html");
      return;
    }

    // If we get here, the user has logged in and can see the goods
    out.println("<html><head><link rel=\"stylesheet\" type=\"text/css\" href=\"searchstyle.css\"/>"
            + "<title>Information</title></head><body>");
    out.println("<div id=\"loggedin\"><p align=\"right\">" + done + " (<a href=\"Logout\">logout</a>)</p>");
    out.println("<h1>Welcome!</h1>");
    out.println("<p>Developer Login Area</p>");
    out.println("<p>The following ");
    out.println("updates Smart Specs requested  are to be added to the site.</p> ");
    out.println("<p align=\"right\"><a href=\""+ request.getContextPath() + "/" +"\">home</p>");
    out.println("</div></body></html>");
  }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
