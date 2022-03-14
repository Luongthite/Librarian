<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="pager" uri="/WEB-INF/tlds/pageTag" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <section class="product-shop spad">
            <div class="container">
                <div class="row">
                    <!-- left-->
                    <div class="col-lg-3 col-md-6 col-sm-8 order-2 order-lg-1 produts-sidebar-filter">
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
                    <!--right-->

                    <div class="col-lg-9 order-1 order-lg-2">
                        <div class="product-show-option">
                            <div class="row">
                                <div class="col-lg-7 col-md-7">
                                    <div class="select-option">
                                        <form action="BookControl" method="">
                                            <select class="sorting" name="sortSelection">
                                                <option value="Default" ${sortSelection=="Default"?"selected":""}>Default</option>
                                                <option value="Newest" ${sortSelection=="Newest"?"selected":""}>Newest</option>
                                                <option value="Oldest" ${sortSelection=="Oldest"?"selected":""}>Oldest</option>
                                                <option value="Hottest" ${sortSelection=="Hottest"?"selected":""}>Hottest</option>
                                            </select>
                                            <span class="p-input-field">Show:</span>
                                            <input class="p-input" type="number" value="${pageSize}" name="pageSize">
                                            <input class="p-input" type="submit" value="GO">
                                        </form>
                                    </div>
                                </div>
                                <div class="col-lg-5 col-md-5 text-right">
                                    <p>Show ${pageSize} Of ${countBook} Product</p>
                                </div>
                            </div>
                        </div>
                        <div class="product-list">

                            <div class="row">
                                <c:forEach items="${listPage}" var="o">
                                    <div class="col-lg-4 col-sm-6">
                                        <div class="product-item">
                                            <div class="pi-pic">
                                                <div class="frame">
                                                    <img src="${o.getPic()}" alt="">
                                                </div>

                                                <div class="sale pp-sale">HOT</div>
                                                <div class="icon">
<!--                                                    <i class="fa fa-plus-square-o" aria-hidden="true"></i>-->
                                                </div>
                                                <ul>
                                                    <li class="w-icon active">
                                                        <a href="#" onclick="ShowMess(${o.getId()})">  <i class="fa fa-plus-square-o" aria-hidden="true"></i></a></li>
                                                    <li class="quick-view">
                                                        <a href="detail?bookId=${o.getId()}">+ More Details</a></li>
<!--                                                    <li class="w-icon"><a href="#"><i class="fa fa-random"></i></a></li>-->
                                                </ul>
                                            </div>
                                            <div class="pi-text">
                                                <div class="catagory-name">${o.getCategory()}</div>
                                                <a href="#">
                                                    <h5>${o.getTitle()}</h5>
                                                </a>
                                                <div class="product-price">
                                                    Free
                                                    <span>$35.00</span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </c:forEach>
                            </div>

                        </div>
                        <div class="loading-more">
<!--                            <i class="icon_loading"></i>-->
<pager:PageTag endPage="${endPage}" pageIndex="${pageIndex}" pageSize="${pageSize}" sortSelection="${sortSelection}" ></pager:PageTag>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Product Shop Section End -->

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
        
        <script>
            function ShowMess(id) {
     var option=confirm("Do you want to request an issue of this book ?");
           if(option===true){
                           window.location.href="request?bookId="+id;
      
           }

}
        </script>
    </body>

</html>