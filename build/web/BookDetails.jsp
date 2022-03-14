<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="pager" uri="/WEB-INF/tlds/pageTag" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="cateName" uri="/WEB-INF/tlds/getCateName" %>
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
        <!--        <div class="breacrumb-section">
                    <div class="container">
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="breadcrumb-text">
                                    <a href="#"><i class="fa fa-home"></i> Home</a>
                                    <span>Book List</span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>-->
        <!-- Breadcrumb Section Begin -->

    <!-- Product Shop Section Begin -->
    <section class="product-shop spad page-details">
        <div class="container">
            <div class="row">
                <div class="col-lg-3">
                   <div class="filter-widget">
                            <h4 class="fw-title">Categories</h4>
                            <ul class="filter-catagories">
                                <c:forEach items="${categoryList}" var="c">
                                    <li><a class="${ccid==c.getId()?"active":""}" href="category?cid=${c.getId()}">${c.getName()}</a></li>
                                    </c:forEach>
                            </ul>
                        </div>
                        <div class="filter-widget">
                            <h4 class="fw-title">Language</h4>
                            <div class="fw-brand-check">
                                <form action="lang">
                                <c:forEach items="${langList}" var="o">
                                    <div class="bc-item">
                                        <label for="${o}">
                                            ${o}
                                            <input type="radio" id="${o}" name="langCheck" value="${o}" ${langCheck==o?"checked":""}>
                                            <span class="checkmark"></span>
                                        </label>
                                    </div>
                                </c:forEach>
                                    <input type="submit" value="Search" class="p-input">
                                    </form>
                            </div>
                        </div>
                        <!--                    <div class="filter-widget">
                                                <h4 class="fw-title">Price</h4>
                                                <div class="filter-range-wrap">
                                                    <div class="range-slider">
                                                        <div class="price-input">
                                                            <input type="text" id="minamount">
                                                            <input type="text" id="maxamount">
                                                        </div>
                                                    </div>
                                                    <div class="price-range ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content"
                                                        data-min="33" data-max="98">
                                                        <div class="ui-slider-range ui-corner-all ui-widget-header"></div>
                                                        <span tabindex="0" class="ui-slider-handle ui-corner-all ui-state-default"></span>
                                                        <span tabindex="0" class="ui-slider-handle ui-corner-all ui-state-default"></span>
                                                    </div>
                                                </div>
                                                <a href="#" class="filter-btn">Filter</a>
                                            </div>-->
                        <!--                    <div class="filter-widget">
                                                <h4 class="fw-title">Color</h4>
                                                <div class="fw-color-choose">
                                                    <div class="cs-item">
                                                        <input type="radio" id="cs-black">
                                                        <label class="cs-black" for="cs-black">Black</label>
                                                    </div>
                                                    <div class="cs-item">
                                                        <input type="radio" id="cs-violet">
                                                        <label class="cs-violet" for="cs-violet">Violet</label>
                                                    </div>
                                                    <div class="cs-item">
                                                        <input type="radio" id="cs-blue">
                                                        <label class="cs-blue" for="cs-blue">Blue</label>
                                                    </div>
                                                    <div class="cs-item">
                                                        <input type="radio" id="cs-yellow">
                                                        <label class="cs-yellow" for="cs-yellow">Yellow</label>
                                                    </div>
                                                    <div class="cs-item">
                                                        <input type="radio" id="cs-red">
                                                        <label class="cs-red" for="cs-red">Red</label>
                                                    </div>
                                                    <div class="cs-item">
                                                        <input type="radio" id="cs-green">
                                                        <label class="cs-green" for="cs-green">Green</label>
                                                    </div>
                                                </div>
                                            </div>-->
                        <!--                    <div class="filter-widget">
                                                <h4 class="fw-title">Size</h4>
                                                <div class="fw-size-choose">
                                                    
                                                    <div class="sc-item">
                                                        <input type="radio" id="">
                                                        <label for=""></label>
                                                    </div>
                                                    
                                                </div>
                                            </div>-->
                        <div class="filter-widget">
                            <h4 class="fw-title">Publishers</h4>
                            <div class="fw-tags">
                                <c:forEach items="${pubList}" var="o">
                                    <a class="${pubb==o?"active":""}" href="publisher?pub=${o}">${o}</a>
                                </c:forEach>
                            </div>
                        </div>
                </div>
                <div class="col-lg-9">
                    <div class="row">
                        <div class="col-lg-6">
                            <div class="product-pic-zoom">
                                <img class="product-big-img" src="${thisB.getPic()}" alt="">
                                <div class="zoom-icon">
                                    <i class="fa fa-search-plus"></i>
                                </div>
                            </div>
<!--                            <div class="product-thumbs">
                                <div class="product-thumbs-track ps-slider owl-carousel">
                                    <div class="pt active" data-imgbigurl="img/product-single/product-1.jpg"><img
                                            src="img/product-single/product-1.jpg" alt=""></div>
                                    <div class="pt" data-imgbigurl="img/product-single/product-2.jpg"><img
                                            src="img/product-single/product-2.jpg" alt=""></div>
                                    <div class="pt" data-imgbigurl="img/product-single/product-3.jpg"><img
                                            src="img/product-single/product-3.jpg" alt=""></div>
                                    <div class="pt" data-imgbigurl="img/product-single/product-3.jpg"><img
                                            src="img/product-single/product-3.jpg" alt=""></div>
                                </div>
                            </div>-->
                        </div>
                        <div class="col-lg-6">
                            <div class="product-details">
                                <div class="pd-title">
                                    <span>${thisB.getCategory()}</span>
                                    <h3>${thisB.getTitle()}</h3>
<!--                                    <a href="#" class="heart-icon"><i class="icon_heart_alt"></i></a>-->
                                </div>
<!--                                <div class="pd-rating">
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star-o"></i>
                                    <span>(5)</span>
                                </div>-->
                                <div class="pd-desc">
                                    <p>${thisB.getShortDes()}</p>
                                    <h4>$495.00 <span>629.99</span></h4>
                                </div>
<!--                                <div class="pd-color">
                                    <h6>Color</h6>
                                    <div class="pd-color-choose">
                                        <div class="cc-item">
                                            <input type="radio" id="cc-black">
                                            <label for="cc-black"></label>
                                        </div>
                                        <div class="cc-item">
                                            <input type="radio" id="cc-yellow">
                                            <label for="cc-yellow" class="cc-yellow"></label>
                                        </div>
                                        <div class="cc-item">
                                            <input type="radio" id="cc-violet">
                                            <label for="cc-violet" class="cc-violet"></label>
                                        </div>
                                    </div>
                                </div>-->
<!--                                <div class="pd-size-choose">
                                    <div class="sc-item">
                                        <input type="radio" id="sm-size">
                                        <label for="sm-size">s</label>
                                    </div>
                                    <div class="sc-item">
                                        <input type="radio" id="md-size">
                                        <label for="md-size">m</label>
                                    </div>
                                    <div class="sc-item">
                                        <input type="radio" id="lg-size">
                                        <label for="lg-size">l</label>
                                    </div>
                                    <div class="sc-item">
                                        <input type="radio" id="xl-size">
                                        <label for="xl-size">xs</label>
                                    </div>
                                </div>-->
                                <div class="quantity">
                                    <div class="pro-qty">
                                        <input type="text" value="1">
                                    </div>
                                    <a href="#" class="primary-btn pd-cart">Request Issue</a>
                                </div>
                                <ul class="pd-tags">
                                    <li><span>CATEGORIES</span>: ${thisB.getCategory()} - <cateName:cateName cateId="${thisB.getCategory()}"></cateName:cateName></li>
<!--                                    <li><span>TAGS</span>: Clothing, T-shirt, Woman</li>-->
                                </ul>
                                <div class="pd-share">
                                    <div class="p-code">ID : ${thisB.getId()}</div>
                                    <div class="pd-social">
                                        <a href="#"><i class="fa fa-facebook-official" aria-hidden="true"></i></a>
                                        <a href="#"><i class="fa fa-twitter-square" aria-hidden="true"></i></a>
                                        <a href="#"><i class="fa fa-linkedin" aria-hidden="true"></i>></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="product-tab">
                        <div class="tab-item">
                            <ul class="nav" role="tablist">
<!--                                <li>
                                    <a class="active" data-toggle="tab" href="#tab-1" role="tab">DESCRIPTION</a>
                                </li>-->
                                <li>
                                    <a data-toggle="tab" href="#tab-2" role="tab">SPECIFICATIONS</a>
                                </li>
<!--                                <li>
                                    <a data-toggle="tab" href="#tab-3" role="tab">Customer Reviews (02)</a>
                                </li>-->
                            </ul>
                        </div>
                        <div class="tab-item-content">
                            <div class="tab-content">
<!--                                <div class="tab-pane fade-in active" id="tab-1" role="tabpanel">
                                    <div class="product-content">
                                        <div class="row">
                                            <div class="col-lg-7">
                                                <h5>Introduction</h5>
                                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do
                                                    eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
                                                    ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
                                                    aliquip ex ea commodo consequat. Duis aute irure dolor in </p>
                                                <h5>Features</h5>
                                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do
                                                    eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
                                                    ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
                                                    aliquip ex ea commodo consequat. Duis aute irure dolor in </p>
                                            </div>
                                            <div class="col-lg-5">
                                                <img src="img/product-single/tab-desc.jpg" alt="">
                                            </div>
                                        </div>
                                    </div>
                                </div>-->
                                <div class="tab-pane fade" id="tab-2" role="tabpanel">
                                    <div class="specification-table">
                                        <table>
<!--                                            <tr>
                                                <td class="p-catagory">Customer Rating</td>
                                                <td>
                                                    <div class="pd-rating">
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star-o"></i>
                                                        <span>(5)</span>
                                                    </div>
                                                </td>
                                            </tr>-->
                                            <tr>
                                                <td class="p-catagory">Rental Price</td>
                                                <td>
                                                    <div class="p-price">$3.00</div>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="p-catagory">Request An Issue</td>
                                                <td>
                                                    <div class="cart-add">+ Request</div>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="p-catagory">Availability</td>
                                                <td>
                                                    <div class="p-stock">${thisB.getAvail()} in Library</div>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="p-catagory">Publisher</td>
                                                <td>
                                                    <div class="p-weight">${thisB.getPublisher()}</div>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="p-catagory">Year of Publish</td>
                                                <td>
                                                    <div class="p-size">${thisB.getYear()}</div>
                                                </td>
                                            </tr><tr>
                                                <td class="p-catagory">ShelfId</td>
                                                <td>
                                                    <div class="p-size">${thisB.getShelfId()}</div>
                                                </td>
                                            </tr>
                                            </tr><tr>
                                                <td class="p-catagory">Language</td>
                                                <td>
                                                    <div class="p-size">${thisB.getLanguage()}</div>
                                                </td>
                                            </tr>
<!--                                            <tr>
                                                <td class="p-catagory">Color</td>
                                                <td><span class="cs-color"></span></td>
                                            </tr>-->
                                            <tr>
                                                <td class="p-catagory">Time Post</td>
                                                <td>
                                                    <div class="p-code">${thisB.getTimePost()}</div>
                                                </td>
                                            </tr>
                                        </table>
                                    </div>
                                </div>
                                <div class="tab-pane fade" id="tab-3" role="tabpanel">
                                    <div class="customer-review-option">
                                        <h4>2 Comments</h4>
                                        <div class="comment-option">
                                            <div class="co-item">
                                                <div class="avatar-pic">
                                                    <img src="img/product-single/avatar-1.png" alt="">
                                                </div>
                                                <div class="avatar-text">
                                                    <div class="at-rating">
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star-o"></i>
                                                    </div>
                                                    <h5>Brandon Kelley <span>27 Aug 2019</span></h5>
                                                    <div class="at-reply">Nice !</div>
                                                </div>
                                            </div>
                                            <div class="co-item">
                                                <div class="avatar-pic">
                                                    <img src="img/product-single/avatar-2.png" alt="">
                                                </div>
                                                <div class="avatar-text">
                                                    <div class="at-rating">
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star-o"></i>
                                                    </div>
                                                    <h5>Roy Banks <span>27 Aug 2019</span></h5>
                                                    <div class="at-reply">Nice !</div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="personal-rating">
                                            <h6>Your Ratind</h6>
                                            <div class="rating">
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star-o"></i>
                                            </div>
                                        </div>
                                        <div class="leave-comment">
                                            <h4>Leave A Comment</h4>
                                            <form action="#" class="comment-form">
                                                <div class="row">
                                                    <div class="col-lg-6">
                                                        <input type="text" placeholder="Name">
                                                    </div>
                                                    <div class="col-lg-6">
                                                        <input type="text" placeholder="Email">
                                                    </div>
                                                    <div class="col-lg-12">
                                                        <textarea placeholder="Messages"></textarea>
                                                        <button type="submit" class="site-btn">Send message</button>
                                                    </div>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Product Shop Section End -->

    <!-- Related Products Section End -->
    <div class="related-products spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="section-title">
                        <h2>Related Books</h2>
                    </div>
                </div>
            </div>
            <div class="row">
                <c:forEach items="${relatedBooks}" var="rb">
                <div class="col-lg-3 col-sm-6">
                    <div class="product-item">
                        <div class="pi-pic">
                            <img src="${rb.getPic()}" alt="">
                            <div class="sale">Sale</div>
                            <div class="icon">
                                <i class="icon_heart_alt"></i>
                            </div>
                            <ul>
                                <li class="w-icon active"><a href="#"><i class="fa fa-bookmark" aria-hidden="true"></i></i></a></li>
                                <li class="quick-view"><a href="detail?bookId=${rb.getId()}">+ More Details</a></li>
<!--                                <li class="w-icon"><a href="#"><i class="fa fa-random"></i></a></li>-->
                            </ul>
                        </div>
                        <div class="pi-text">
                            <div class="catagory-name">
                                <cateName:cateName cateId="${rb.getCategory()}"></cateName:cateName>
                            </div>
                            <a href="#">
                                <h5>Pure Pineapple</h5>
                            </a>
                            <div class="product-price">
                                $14.00
                                <span>$35.00</span>
                            </div>
                        </div>
                    </div>
                </div>
                </c:forEach>
                
            </div>
        </div>
    </div>
    <!-- Related Products Section End -->

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