/*
 * Servlet for trend look up feature
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Grey Matter
 * @createdOn Mar 1, 2014, 10:15:07 AM
 */

public class drugLookUpServlet extends HttpServlet {

    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String myTopic = request.getParameter("srch-term");
        RequestDispatcher view = request.getRequestDispatcher("index.jsp");
        
        if(myTopic != null) {
                request.setAttribute("message1", myTopic);
                request.setAttribute("message2", myTopic);
                view.forward(request,response); 
        } else {
                //if no parameter passed in url then just redirect to start view to ask input
                view.forward(request,response);     
        }
    }

}
