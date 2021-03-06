ArrayList<Issued><%@page import="Model.Issued"%>
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
            <h3>MY CURRENTLY BORROWED BOOK</h3>
            <BR>
            <BR>
            <div class="row">
                <div class="col-lg-12">
                    
                    <div class="cart-table">
                        <table>
                            <thead>
                                <tr>
                                    <th>Book ID</th>
                                    <th >Book Title</th>
                                    <th>Date Of Issue</th>
                                    <th>Date Of Return</th>
                                    <th>Actual Return Date</th>
                                    <th>Fine</th>

<!--                                    <th></th>
                                    <th>Actual Return Date</th>
                                    <th>Actual Return Date</th>-->
                                    
                                </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${mList}" var="m">
                                <tr>
                                    <td>${m.getBookId()}</td>
                                    <td><b:getBookById boodId="${m.getBookId()}"></b:getBookById>
                                    </td>
                                    <td class="p-price first-row">${m.getDateOfIssue()}</td>
                                    <td class="p-price first-row">${m.getDateOfReturn()}</td>
                                    <td class="p-price first-row">${m.getActualReturnDate()}</td>
                                    <td class="p-price first-row">${m.getFine()}</td>
<!--                                    <td class="qua-col first-row">
                                        <div class="quantity">
                                            <div class="pro-qty">
                                                <input type="text" value="1">
                                            </div>
                                        </div>
                                    </td>
                                    <td class="total-price first-row">$60.00</td>
                                    <td class="close-td first-row"><i class="ti-close"></i></td>-->
                                </tr>
                                </c:forEach>
                               
                            </tbody>
                        </table>
                    </div>
<!--                    <div class="row">
                        <div class="col-lg-4">
                            <div class="cart-buttons">
                                <a href="#" class="primary-btn continue-shop">Continue shopping</a>
                                <a href="#" class="primary-btn up-cart">Update cart</a>
                            </div>
                            <div class="discount-coupon">
                                <h6>Discount Codes</h6>
                                <form action="#" class="coupon-form">
                                    <input type="text" placeholder="Enter your codes">
                                    <button type="submit" class="site-btn coupon-btn">Apply</button>
                                </form>
                            </div>
                        </div>
                        <div class="col-lg-4 offset-lg-4">
                            <div class="proceed-checkout">
                                <ul>
                                    <li class="subtotal">Subtotal <span>$240.00</span></li>
                                    <li class="cart-total">Total <span>$240.00</span></li>
                                </ul>
                                <a href="#" class="proceed-btn">PROCEED TO CHECK OUT</a>
                            </div>
                        </div>
                    </div>-->
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