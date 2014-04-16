<%-- 
    Document   : index
    Created on : Mar 1, 2014, 10:15:07 AM
    Author     : Grey Matter
--%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8"> 
        <meta charset="utf-8">
        <title>Mylan Hackathon</title>
        <meta name="generator" content="Bootply" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <link href="http://netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
        
        <!--[if lt IE 9]>
          <script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->
        <link rel="shortcut icon" href="/bootstrap/img/favicon.ico">
        <link rel="apple-touch-icon" href="/bootstrap/img/apple-touch-icon.png">
        <link rel="apple-touch-icon" sizes="72x72" href="/bootstrap/img/apple-touch-icon-72x72.png">
        <link rel="apple-touch-icon" sizes="114x114" href="/bootstrap/img/apple-touch-icon-114x114.png">

        <!-- CSS code from Bootply.com editor -->
        
        <style type="text/css">
            table, td, th
            {
            border:1px solid green;
            }
            th
            {
            background-color:green;
            color:white;
            text-align: center;
            }
        </style>
        <script type="text/javascript">
            function validate() {
                var form = document.search;
                
                if (form.srch-term.value === "") {
                    alert("Please enter a search term");
                    return false;
                } else {
                    return true;
                }
            }
        </script>
                       
    </head>
    
    <!-- HTML code from Bootply.com editor -->
    
    <body  >
        <div class="navbar navbar-default navbar-static-top">
            <div class="container">
                <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="http://www.mylan.com/" target="_blank">Mylan</a>
                </div>
            <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="index.jsp">Trends</a></li>
                <li ><a href="news.jsp">News</a></li>
                <li ><a href="Patent.htm">Drug Patents</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="about.html">About</a></li>
            </ul>
            </div><!--/.nav-collapse -->
            </div>
        </div>

        <div class="container">
            <div class="text-center">
                <h1>Trends Lookup</h1>
                <form class="navbar-form" role="search" name="search" action="drugLookUpServlet" method="get">
		<div class="input-group">
			<input type="text" class="form-control" placeholder="Search" name="srch-term" id="srch-term">
			<div class="input-group-btn">
                            <button class="btn btn-default" type="submit" onsubmit="validate();"><i class="glyphicon glyphicon-search"></i></button>
			</div>
		</form>
		</div>
            </div>
            <% 
                out.println("<div class=\"container\">");
                String message1 = (String) request.getAttribute("message1");
                String message2 = (String) request.getAttribute("message2");                
                if(message1 != null) {
                    out.println("<br/><div class=\"lead\">Google Trends Results: " + message1 + "</div>" );
                    out.println("<p align=\"center\"><script type=\"text/javascript\" src=\"//www.google.com/trends/embed.js?"
                        + "hl=en-US&q="+ message1 + "&content=1&cid=TIMESERIES_GRAPH_0&export=5&w=500&h=330\"></script></p>");
                    if(message2 != null) {
                        out.println("<p><script type=\"text/javascript\" src=\"//www.google.com/trends/embed.js?"
                            + "hl=en-US&q="+ message1 + "&content=1&cid=GEO_MAP_0_0&export=5&w=500&h=330\"></script>");
                        out.println("<script type=\"text/javascript\" src=\"//www.google.com/trends/embed.js?"
                            + "hl=en-US&q="+ message1 + "&content=1&cid=GEO_TABLE_0_0&export=5&w=500&h=330\"></script></p>");
                    }
                    
                }
                out.println("</div>");
            %>

        </div><!-- /.container -->
        
        <script type='text/javascript' src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
        <script type='text/javascript' src="http://netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
        <!-- JavaScript jQuery code from Bootply.com editor -->
        <script type='text/javascript'>
        $(document).ready(function() {
        });
        </script>

    </body>

</html>