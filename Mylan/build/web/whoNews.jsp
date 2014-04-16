<!-- not used; could be added for getting news feeds of disease outbreaks -->
        <div id="who news" class="container">
            <div class="text-center">
                <h1>WHO Disease Outbreak News Feed</h1>
                <form class="navbar-form" action="whoNewsServlet" method="get">
		<button type="submit" class="btn btn-primary">Show Feeds</button>
                </form>
            </div>
            <% 
                out.println("<div class=\"container\">");
                String message2 = (String) request.getAttribute("message1");
                if(message2 != null) {
                    out.println("<div class=\"text-center\">"+message2+"</div><br/>");
                }                
                out.println("</div>");
            %>
            
        