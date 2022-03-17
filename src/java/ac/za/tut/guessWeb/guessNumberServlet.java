/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ac.za.tut.guessWeb;

import ac.za.tut.processor.RandomGuessNumberProcessor;
import ac.za.tut.randomGuessNumber.RandomGuessNumber;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
@WebServlet(name = "guessNumberServlet", urlPatterns = {"/guessNumberServlet.do"})
public class guessNumberServlet extends HttpServlet {

    

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      //extract data 
      String guessNumber =request.getParameter("guessNum");
      //do somethings
      RandomGuessNumber rgn = new RandomGuessNumber( guessNumber);
      RandomGuessNumberProcessor rgnp = new RandomGuessNumberProcessor(rgn);
      
     int randomNum =rgnp.determineRandom();
     String outcome =rgnp.determineoutcome(randomNum);
     //
     request.setAttribute("guessNum", guessNumber);
     request.setAttribute("randomNum",Integer.toString(randomNum));
     request.setAttribute("outcome", outcome);
     //
     RequestDispatcher disp= request.getRequestDispatcher("outcome.jsp");
     disp.forward(request, response);
    }

 

}
