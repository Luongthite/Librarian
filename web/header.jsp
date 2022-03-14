<%-- 
    Document   : header
    Created on : Mar 13, 2022, 6:49:22 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

        <!-- Header Section Begin -->
        <header class="header-section">
            <div class="header-top">
                <div class="container">
                    

                    <div class="ht-left">
                        <div class="mail-service">
                            <img src="PHOTOS/TE ED library.png" style="width: 30px">
                        </div>
                        <c:if test="${sessionScope.acc!=null}">
                        <div class="mail-service">
                            <i class=" fa fa-envelope"></i>
                            ${sessionScope.acc.getEmail()}
                        </div>
                        <div class="phone-service">
                            <i class=" fa fa-phone"></i>
                            ${sessionScope.acc.getPhoneNumber()}
                        </div>
                         </c:if>
                    </div>
                       
                    <div class="ht-right">
                        <c:if test="${sessionScope.acc==null}">
                         <a href="aLogin" class="login-panel"><i class="fa fa-sign-in" aria-hidden="true"></i>Login</a>
                         </c:if>
                         <c:if test="${sessionScope.acc!=null}">
                        <a href="logout" class="login-panel"><i class="fa fa-sign-out" aria-hidden="true"></i>Logout</a>
                         </c:if>
<!--                        <div class="top-social">
                            <a href="#"><i class="fa fa-facebook-official" aria-hidden="true"></i></a>
                            <a href="#"><i class="fa fa-twitter-square" aria-hidden="true"></i></a>
                            <a href="#"><i class="fa fa-linkedin-square" aria-hidden="true"></i></a>
                            <a href="#"><i class="fa fa-pinterest-square" aria-hidden="true"></i></a>
                        </div>-->
                    </div>
                </div>
            </div>
            <div class="container">
                <div class="inner-header">
                    <div class="row">
                        <div class="col-lg-2 col-md-2">
                            <div class="logo">
                                <a href="./index.html">
                                    <img src="PHOTOS/TE ED library" alt="">
                                </a>
                            </div>
                        </div>
                        <div class="col-lg-7 col-md-7">
                            <div class="advanced-search">
                                <button type="button" class="category-btn">All Categories</button>
                                <form action="#" class="input-group">
                                    <input type="text" placeholder="What do you need?">
                                    <button type="button"><i class="fa fa-search" aria-hidden="true"></i></button>
                                </form>
                            </div>
                        </div>
                        <div class="col-lg-3 text-right col-md-3">
<!--                            <ul class="nav-right">
                                <li class="cart-icon"><a href="#">
                                        <i class="fa fa-bookmark" aria-hidden="true"></i></i>
                                        <span>3</span>
                                    </a>
                                    <div class="cart-hover">
                                        <div class="select-items">
                                            <table>
                                                <tbody>
                                                    <tr>
                                                        <td class="si-pic"><img src="img/select-product-1.jpg" alt=""></td>
                                                        <td class="si-text">
                                                            <div class="product-selected">
                                                                <p>$60.00 x 1</p>
                                                                <h6>Kabino Bedside Table</h6>
                                                            </div>
                                                        </td>
                                                        <td class="si-close">
                                                            <i class="fa fa-times" aria-hidden="true"</i>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td class="si-pic"><img src="img/select-product-2.jpg" alt=""></td>
                                                        <td class="si-text">
                                                            <div class="product-selected">
                                                                <p>$60.00 x 1</p>
                                                                <h6>Kabino Bedside Table</h6>
                                                            </div>
                                                        </td>
                                                        <td class="si-close">
                                                            <i class="fa fa-times" aria-hidden="true"></i>
                                                        </td>
                                                    </tr>
                                                </tbody>
                                            </table>
                                        </div>
                                        <div class="select-total">
                                            <span>total:</span>
                                            <h5>$120.00</h5>
                                        </div>
                                        <div class="select-button">
                                            <a href="#" class="primary-btn view-card">VIEW DETAILS</a>
                                            <a href="#" class="primary-btn checkout-btn">PLACE AN ISSUE REQUEST</a>
                                        </div>
                                    </div>
                                </li>
                                <li class="cart-price">$150.00</li>
                            </ul>-->
                        </div>
                    </div>
                </div>
            </div>
            <div class="nav-item">
                <div class="container">
                    <div class="nav-depart">
                        <div class="depart-btn">
                            <i class="fa fa-bars" aria-hidden="true"></i>
                            <span>All categories</span>
                            <ul class="depart-hover">
                                <c:forEach items="${categoryList}" var="c">
                                    <li><a href="#">${c.getName()}</a></li>
                                    </c:forEach>
                            </ul>
                        </div>
                    </div>
                    <nav class="nav-menu mobile-menu">
                        <ul>
                            <li><a href="#">Home</a></li>
                            <li><a href="BookControl">Book List</a></li>
                             <c:if test="${sessionScope.acc!=null}">
<!--                         <li><a href="./blog.html">Manage My Book Mark List</a></li>
                         <li><a href="./contact.html">Recommend a Book</a></li>-->
                         </c:if>
                            
                            
                            <!--                        <li><a href="#">Pages</a>
                                                        <ul class="dropdown">
                                                            <li><a href="./blog-details.html">Blog Details</a></li>
                                                            <li><a href="./shopping-cart.html">Shopping Cart</a></li>
                                                            <li><a href="./check-out.html">Checkout</a></li>
                                                            <li><a href="./faq.html">Faq</a></li>
                                                            <li><a href="./register.html">Register</a></li>
                                                            <li><a href="./login.html">Login</a></li>
                                                        </ul>
                                                    </li>-->
                        </ul>
                    </nav>
                    <div id="mobile-menu-wrap"></div>
                </div>
            </div>
        </header>
        <!-- Header End -->