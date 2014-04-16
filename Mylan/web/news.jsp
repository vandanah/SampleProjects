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
            text-align: center
            }
        </style>
                       
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
                <li ><a href="index.jsp">Trends</a></li>
                <li class="active"><a href="news.jsp">News</a></li>
                <li ><a href="Patent.htm">Drug Patents</a></li>                
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="about.html">About</a></li>
            </ul>
            </div><!--/.nav-collapse -->
            </div>
        </div>

        <div id="competitor news" class="container">
            <div class="text-center">
                <h1>Competitor News</h1>
                <form class="navbar-form" role="select" name="select" action="getNews" method="get">
		<div class="form-group">
                    <label for="select"></label>
                    <select name="companySelect" class="form-control">     
                        <option value="-1"></option>
                        <option value="1">Teva Pharmaceutical</option>
                        <option value="2">Ranbaxy</option>
                        <option value="3">Pfizer</option>
                    </select>
                </div>
                    
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
            </div>
            <% 
                out.println("<div class=\"container\">");
                String message1 = (String) request.getAttribute("message1");
                String link1 = (String) request.getAttribute("link1");                
                String link2 = (String) request.getAttribute("link2");                
                String link3 = (String) request.getAttribute("link3");                
                if(message1 != null && link1 != null) {
                    out.println("<br/><div class=\"lead\" align=\"center\">Few news feeds on Market Watch for " + message1 + "</div>" );
                    
                    out.println("<div class=\"text-center\">"+link1+"</div><br/>");
                    if (link2 != null)
                    out.println("<div class=\"text-center\">"+link2+"</div><br/>");
                    if (link3 != null)
                    out.println("<div class=\"text-center\">"+link3+"</div><br/>");
                    
                }
                
                if (message1 != null) {
                    out.println("<br/><div class=\"lead\" align=\"center\">Company Filings Information for " + message1 + "</div>" );
                    if (message1 == "Teva Pharmaceutical") {
                        out.println("<br/><div class=\"text-center\"><a href=\"http://www.sec.gov/Archives/edgar/data/818686/000119312512067417/d300203d20f.htm\""
                            + " target=\"_tab\">"
                            + "Click to go to company filings</a>" + "</div>" );
                    } else {
                        out.println("<br/><div class=\"text-center\"><a href=\"https://www.sec.gov/cgi-bin/browse-edgar?company="
                            + message1 + "&owner=exclude&action=getcompany\" target =\"_tab\">"
                            + "Click to go to company filings</a>" + "</div>" );
                    }
                }
                out.println("</div>");
            %>

        
        <script type='text/javascript' src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
        <script type='text/javascript' src="http://netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
        <!-- JavaScript jQuery code from Bootply.com editor -->
        <script type='text/javascript'>
        $(document).ready(function() {
        });
        </script>

    </body>

</html>