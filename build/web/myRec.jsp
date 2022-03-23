<%@page import="Model.Issued"%>
<%@page import="Model.Book"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DAL.BookDAO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="pager" uri="/WEB-INF/tlds/pageTag" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="b" uri="/WEB-INF/tlds/getBookById" %>
<!DOCTYPE html>
<html lang="zxx">

    <head>
        <meta charset="UTF-8">
        <meta name="description" content="Fashi Template">
        <meta name="keywords" content="Fashi, unica, creative, html">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>TE ED LIBRARY</title>

        <!-- Google Font -->
        <link href="https://fonts.googleapis.com/css?family=Muli:300,400,500,600,700,800,900&display=swap" rel="stylesheet">

        <!-- Css Styles -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="CSS/bootstrap.min.css" type="text/css">
        <link rel="stylesheet" href="CSS/font-awesome.min.css" type="text/css">
        <link rel="stylesheet" href="CSS/themify-icons.css" type="text/css">
        <link rel="stylesheet" href="CSS/elegant-icons.css" type="text/css">
        <link rel="stylesheet" href="CSS/owl.carousel.min.css" type="text/css">
        <link rel="stylesheet" href="CSS/nice-select.css" type="text/css">
        <link rel="stylesheet" href="CSS/jquery-ui.min.css" type="text/css">
        <link rel="stylesheet" href="CSS/slicknav.min.css" type="text/css">
        <link rel="stylesheet" href="CSS/shop.css" type="text/css">

    </head>

    <body>
        <!-- Page Preloder -->
        <div id="preloder">
            <div class="loader"></div>
        </div>

        <jsp:include page="header.jsp"></jsp:include>

    <!-- Breadcrumb Section Begin -->
    <div class="breacrumb-section">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="breadcrumb-text product-more">
                        <a href="./home.html"><i class="fa fa-home"></i> Home</a>
                        <a href="./shop.html">Shop</a>
                        <span>Book Mark List</span>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Breadcrumb Section Begin -->

    <!-- Shopping Cart Section Begin -->
    <section class="shopping-cart spad">
        <div class="container">
            <c:if test="${rList!=null}">
             <h3>My Recommendation List</h3>
            <BR>
            <BR>
            
            <div class="row">
                <div class="col-lg-12">
                
                    <div class="cart-table">
                        <form action="memRec" method="get">
                            <table>
                            <thead>
                                <tr>
                                    <th >Book Name</th>
                                    <th class="p-name">Description</th>
                                    <th>Author</th>
                                    <th>Book Pic URL</th>
                                    <th>Status</th>
                                </tr>
                            </thead>
                            <tbody>
                               <c:forEach items="${rList}" var="r">
                            <tr>
                                <td class="p-name">
                                    ${r.bookName}
                                </td>
                                <td class="p-name">
                                    ${r.des}
                                </td>
                                <td>
                                    ${r.author}
                                </td>
                                <td class="p-name">
                                    ${r.bookPic}
                                </td>
                                <td>
                                    ${r.status}
                                </td>
                                
                            </tr>
                            </tbody>
                        </c:forEach>
                            </table>
                            </form>
                    </div>      
                    
                </div>
            </div
            </c:if>
            <BR>
            <h3>Recommend a Book</h3>
            <BR>
            <BR>
            <div class="row">
                <div class="col-lg-12">
                    <div class="cart-table">
                        <form action="memRec" method="post">
                        <table>
                            <tr><TD>Book Name:</TD>
                                <TD><input type="text" name="bookName"></TD>
                            </tr>
                            <tr><TD>Book Pic URL:</TD>
                                <TD><input type="text" name="bookPic"></TD>
                            </tr>
                            <tr><TD >Book Author:</TD>
                                <TD><input type="text" name="author"></TD>
                            </tr>
                            <tr>
                                <td>Description:</td>
                                <td><input type="text" name="des"></td>
                            </tr>
                            <tr>
                                <td></td>
                                <td><input type="submit" name="" value="SEND RECOMMENDATION"></td>
                            </tr>
                            
                        </table>
                            </form>
                    </div>                   
                </div>
            </div>
        </div>
    </section>
    <!-- Shopping Cart Section End -->

        <!-- Footer Section Begin -->
        <jsp:include page="footer.jsp"></jsp:include>
        <!-- Footer Section End -->

        <!-- Js Plugins -->
        <script src="JS/jquery-3.3.1.min.js"></script>
        <script src="JS/bootstrap.min.js"></script>
        <script src="JS/jquery-ui.min.js"></script>
        <script src="JS/jquery.countdown.min.js"></script>
        <script src="JS/jquery.nice-select.min.js"></script>
        <script src="JS/jquery.zoom.min.js"></script>
        <script src="JS/jquery.dd.min.js"></script>
        <script src="JS/jquery.slicknav.js"></script>
        <script src="JS/owl.carousel.min.js"></script>
        <script src="JS/main.js"></script>
    </body>

</html>