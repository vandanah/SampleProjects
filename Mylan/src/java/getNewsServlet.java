/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vandana
 */
public class getNewsServlet extends HttpServlet {

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

        String competitor = request.getParameter("companySelect");
        RequestDispatcher view = request.getRequestDispatcher("news.jsp");
        String competitorName = "";
        if(competitor != null) {
                switch (competitor) {
                    case "1" : competitorName = "Teva+Pharmaceutical"; 
                        request.setAttribute("message1", "Teva Pharmaceutical");
                        break;                        
                    case "2" : competitorName = "Ranbaxy"; 
                        request.setAttribute("message1", competitorName);
                        break;
                    case "3" : competitorName = "Pfizer"; 
                        request.setAttribute("message1", competitorName);
                        break;
                    default: view.forward(request,response); break;
                }
                
                String[] newsFeed = new String[3];
                        
                ArrayList newsArticles = doNewsSearch(competitorName);
                Iterator iter = newsArticles.iterator();
                int i=0;
                while(iter.hasNext()) {
                    newsFeed[i] = (String)iter.next();
                    i++;                    
                }
                if(newsFeed[0] != null)
                    request.setAttribute("link1", newsFeed[0]);
                if(newsFeed[1] != null)
                    request.setAttribute("link2", newsFeed[1]);
                if (newsFeed[2] != null)
                    request.setAttribute("link3", newsFeed[2]);
                
                
                
                
                view.forward(request,response); 
        } else {
                //if no parameter passed in url then just redirect to start view to ask input
                view.forward(request,response);     
        }
    }

    /**
     *
     * @param searchname
     * @return gives back the HTML code for the top 3 articles if they exist <div class = "searchresult">...</div>
     */
    public static ArrayList doNewsSearch(String searchname) {
        String response = "";

        try {
            // Create a URL for the desired page            
            URL url = new URL("http://www.marketwatch.com/search?q=" + searchname);
            // Create an HttpURLConnection.  This is useful for setting headers
            // and for getting the path of the resource that is returned (which 
            // may be different than the URL above if redirected).
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            // Read all the text returned by the server
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
            String str;
            while ((str = in.readLine()) != null) {
                response += str;
            }
            in.close();
        } catch (IOException e) {
            System.out.println("exception in connecting server");
            return null;
        }


        int numArticles = 3;
        // intiialize variable to hold the prices
         ArrayList<String> articleList = new ArrayList();


        
        String outputHTML = "<br/>";
        
        int startSearch = response.indexOf("<div class=\"resultlist\">");// this is the start in the article list
        int endSearch = 0;
        int numGot = 0;
        
        while (response.indexOf("<div class=\"block\">", startSearch + 1) > -1 && (numGot<numArticles)) {
            startSearch = response.indexOf("<div class=\"block\">", startSearch + 1);
            endSearch = response.indexOf("<div class=\"block\">", startSearch+1);
            
            //need to scrape and append http://www.marketwatch.com/ to href links
            String s = (response.substring(startSearch + 19, endSearch));
            System.out.println(s);
            articleList.add(s);
            numGot++;
            outputHTML = outputHTML + s + "<br/>";
        }
        return articleList;
        
    }

}
