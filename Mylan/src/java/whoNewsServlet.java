/*
 * Servlet for reading WHO news feed  - not used in the final application
 */

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
/**
 *
 * @author Grey Matter
 * @createdOn Mar 1, 2014, 10:15:07 AM
 */

public class whoNewsServlet extends HttpServlet {

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

        RequestDispatcher view = request.getRequestDispatcher("news.jsp");
        try {

            StringWriter writer = new StringWriter();
            
            String heading = null;
            request.setAttribute("message1", "Error: No RSS News Feeds Found");
            
            InputStream xsl = null;
            Source xmlDoc = null, xslDoc;
            Result result;
            TransformerFactory factory; 
            Transformer trans;
            String topic = null;
            String urlBusiness=null, urlTechnology=null, urlWorld=null;
            xsl = (InputStream)(getServletContext().getResourceAsStream("/NYTimes.xsl"));
            xmlDoc = new StreamSource("http://www.who.int/feeds/entity/csr/don/en/rss.xml");
            xslDoc = new StreamSource(xsl);
            result = new StreamResult(writer);    
            // Prepare to transform
            factory = TransformerFactory.newInstance();
            trans = factory.newTransformer(xslDoc);
            trans.transform(xmlDoc,result);
            
            request.setAttribute("message2", writer.getBuffer().toString());
            view.forward(request,response); 
                
        
        } catch (Exception e) {
            
        }
    
    }
}
