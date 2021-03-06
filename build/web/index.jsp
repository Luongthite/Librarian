<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="cateName" uri="/WEB-INF/tlds/getCateName" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>TEED Library</title>
    <!-- Import Boostrap css, js, font awesome here -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">       
      <link href="https://use.fontawesome.com/releases/v5.0.4/css/all.css" rel="stylesheet">    
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
      </script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js">
      </script>
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
      <link href="CSS/style.css" rel="stylesheet">
      
  </head>
<body>
<!-- Navigation 
<nav class="navbar navbar-expand-md navbar-light bg-light sticky-top">
	<div class="container-fluid">
		<a class="navbar-branch" href="#">
			<img src="PHOTOS/TE ED library.png" height="50">
		</a>

 <form>
 <select name="category" id="category">
   <option value="IT" selected>IT</option>
  <option value="Marketing">Marketing</option>
  <option value="Management Skill">Management Skill</option>
  <option value="Self-help">Self-help</option>
  </select>
  <input type="text" placeholder="Type in the book's name">
  <input type="submit" value="Search" name="Search">
</form> 

<form class="form-inline">
  <select name="category" id="category" class="form-control mr-sm-2">
    <option value="IT" selected>IT</option>
   <option value="Marketing">Marketing</option>
   <option value="Management Skill">Management Skill</option>
   <option value="Self-help">Self-help</option>
   </select>
  <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
  <button class="btn btn-outline-success my-2 my-sm-0" type="submit" style="border-color: white; color: white;">Search</button>
</form>

		<button class="navbar-toggler" type="button" data-toggle="collapse" 
			data-target="#navbarResponsive">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse menu" id="navbarResponsive">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item">
					<a class="nav-link active" href="#">Home</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="#">About</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="#">Services</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="aLogin">Login/ Sign up</a>
				</li>
			</ul>
		</div>
	</div>
</nav>-->


<!-- Carousel -->
<div id="slides" class="carousel slide" data-ride="carousel">
	<ul class="carousel-indicators">
		<li data-target="#slides" data-slide-to="0" class="active"></li>
		<li data-target="#slides" data-slide-to="1"></li>
		<li data-target="#slides" data-slide-to="2"></li>		
		<li data-target="#slides" data-slide-to="3"></li>
	</ul>
	<div class="carousel-inner">
		<div class="carousel-item active">
			<img src="PHOTOS/reading1.jpg">
			<div class="carousel-caption">
				<h1 class="display-2">TEED LIBRARY</h1>
				<h3>A place of mind-blowing</h3>
        <br>
        <a href="BookControl"><button type="button" class="btn btn-outline-light btn-lg">
					VIEW BOOKS
				</button>
            </a>
        <a href="signIn.jsp"><button type="button" class="btn btn-primary btn-lg">Login</button></a>
				
			</div>
		</div>
		<div class="carousel-item">
			<img src="PHOTOS/reading2.jpg">
		</div>
		<div class="carousel-item">
			<img src="PHOTOS/reading3.jpg">
		</div>
		<div class="carousel-item">
			<img src="PHOTOS/reading3.jpg">
		</div>
	</div>
  <a class="carousel-control-prev" href="#slides" data-slide="prev">
    <span class="carousel-control-prev-icon"></span>
  </a>
  <a class="carousel-control-next" href="#slides" data-slide="next">
    <span class="carousel-control-next-icon"></span>
  </a>
</div>
<!-- jumbotron -->
<div class="container-fluid">
	<div class="jumbotron">
		<div class="col-12">
			<p>Welcome to the poorest library in the world. Here we have every books availabe in a minute, or not!</p>
		</div>
		<div class="col-12">
			<a href="#">
				<button type="button" class="btn btn-outline-secondary">Explore Books</button>
			</a>
		</div>
	</div>
</div>

<div class="TOP 3 MOST BORROWED">
<div class="container-fluid padding">
  <!-- Top 3 best issued -->
	<div class="row welcome text-center">
		<div class="col-12">
			<h1 class="display-4">Top 3 Most Borrowed Books</h1>
		</div>
		<!-- Horizontal Rule -->
		<hr> 
		<div class="col-12">
			<p>Let's take a look at our 3 "Best-Seller" Books</p>
		</div>
	</div>
</div>

<!-- LIST 3 MOST BORROW BOOKS -->
<div class="container-fluid padding mostborrow">
	<div class="row text-center padding">
            <c:forEach items="${threeMost}" var="o">
		<div class="col-xs-12 col-sm-6 col-md-4 ">
                    <img src="${o.getPic()}" alt="1st book" style="height: 500px">	
			<h3>${o.getTitle()}</h3>
                        <p><cateName:cateName cateId="${o.getCategory()}"></cateName:cateName></p>					
		</div>
                </c:forEach>
		
	<hr class="my-4">	
</div>
</div>

<!-- Hot IT Books -->
<div class="container-fluid padding">
	<div class="row padding">
		<div class="col-md-12 col-lg-6 text-center">
      <br>
      <h2>Hot IT Books</h2>
      <br>
			<p>Wanna become a fullstack developer in just 1 day?</p>
      <p>Wanna fulfill your dream of indulging the world into automation and robotics?</p>
			<p>Or just simply wanna hack NASA by HTML?</p>
      <br>
      <br>
      <h4><span class="badge badge-warning">Warning</span> These are must-read books!</h4>
		</div>
		<div class="col-lg-6">
			<!-- carousel book -->
      <div id="hotIT" class="carousel slide" data-ride="carousel">
        <ul class="carousel-indicators">
          <li data-target="#hotIT" data-slide-to="0" class="active"></li>
          <li data-target="#hotIT" data-slide-to="1"></li>
          <li data-target="#hotIT" data-slide-to="2"></li>
        </ul>
        <div class="carousel-inner">
           
          <div class="carousel-item active" >
              <img src="${hotIT.getPic()}" style="height: 500px">
            <div class="carousel-caption">
              <a href="aLogin"><button type="button" class="btn btn-primary btn-lg">Request an issue</button></a>              
            </div>
          </div>
  
        </div>
        <a class="carousel-control-prev" href="#hotIT" data-slide="prev">
          <span class="carousel-control-prev-icon"></span>
        </a>
        <a class="carousel-control-next" href="#hotIT" data-slide="next">
          <span class="carousel-control-next-icon"></span>
        </a>
      </div>
		</div>
	</div>
</div>
<hr>

<!-- Hot Marketing Books -->
<div class="container-fluid padding">
	<div class="row padding">
	
		<div class="col-lg-6">
			<!-- carousel book -->
      <div id="hotMa" class="carousel slide" data-ride="carousel">
        <ul class="carousel-indicators">
          <li data-target="#hotMa" data-slide-to="0" class="active"></li>
          <li data-target="#hotMa" data-slide-to="1"></li>
          <li data-target="#hotMa" data-slide-to="2"></li>		
          <li data-target="#hotMa" data-slide-to="3"></li>
        </ul>
        <div class="carousel-inner">
          <div class="carousel-item active">
            <img src="PHOTOS/reading1.jpg">
            <div class="carousel-caption">
              <a href="#"><button type="button" class="btn btn-primary btn-lg">Request an issue</button></a>              
            </div>
          </div>
          <div class="carousel-item">
            <img src="PHOTOS/reading2.jpg">
            <div class="carousel-caption">
              <a href="#"><button type="button" class="btn btn-primary btn-lg">Request an issue</button></a>              
            </div>
          </div>
          <div class="carousel-item">
            <img src="PHOTOS/reading3.jpg">
            <div class="carousel-caption">
              <a href="#"><button type="button" class="btn btn-primary btn-lg">Request an issue</button></a>              
            </div>
          </div>
          <div class="carousel-item">
            <img src="PHOTOS/reading3.jpg">
            <div class="carousel-caption">
              <a href="#"><button type="button" class="btn btn-primary btn-lg">Request an issue</button></a>              
            </div>
          </div>
        </div>
        <a class="carousel-control-prev" href="#hotMa" data-slide="prev">
          <span class="carousel-control-prev-icon"></span>
        </a>
        <a class="carousel-control-next" href="#hotMa" data-slide="next">
          <span class="carousel-control-next-icon"></span>
        </a>
      </div>
		</div>
    <div class="col-md-12 col-lg-6 text-center">
      <br>
      <h2>Hot Marketing Books</h2>
      <br>
			<p>Wanna become a fullstack developer in just 1 day?</p>
      <p>Wanna fulfill your dream of indulging the world into automation and robotics?</p>
			<p>Or just simply wanna hack NASA by HTML?</p>
      <br>
      <br>
      <h4><span class="badge badge-warning">Warning</span> These are must-read books!</h4>
		</div>
	</div>
</div>
<hr>

<!-- Hot Self-help Books -->
<div class="container-fluid padding">
	<div class="row padding">
		<div class="col-md-12 col-lg-6 text-center">
      <br>
      <h2>Hot Self-help Books</h2>
      <br>
			<p>Wanna become a fullstack developer in just 1 day?</p>
      <p>Wanna fulfill your dream of indulging the world into automation and robotics?</p>
			<p>Or just simply wanna hack NASA by HTML?</p>
      <br>
      <br>
      <h4><span class="badge badge-warning">Warning</span> These are must-read books!</h4>
		</div>
		<div class="col-lg-6">
			<!-- carousel book -->
      <div id="hotSe" class="carousel slide" data-ride="carousel">
        <ul class="carousel-indicators">
          <li data-target="#hotSe" data-slide-to="0" class="active"></li>
          <li data-target="#hotSe" data-slide-to="1"></li>
          <li data-target="#hotSe" data-slide-to="2"></li>		
          <li data-target="#hotSe" data-slide-to="3"></li>
        </ul>
        <div class="carousel-inner">
          <div class="carousel-item active">
            <img src="PHOTOS/reading1.jpg">
            <div class="carousel-caption">
              <a href="#"><button type="button" class="btn btn-primary btn-lg">Request an issue</button></a>              
            </div>
          </div>
          <div class="carousel-item">
            <img src="PHOTOS/reading2.jpg">
            <div class="carousel-caption">
              <a href="#"><button type="button" class="btn btn-primary btn-lg">Request an issue</button></a>              
            </div>
          </div>
          <div class="carousel-item">
            <img src="PHOTOS/reading3.jpg">
            <div class="carousel-caption">
              <a href="#"><button type="button" class="btn btn-primary btn-lg">Request an issue</button></a>              
            </div>
          </div>
          <div class="carousel-item">
            <img src="PHOTOS/reading3.jpg">
            <div class="carousel-caption">
              <a href="#"><button type="button" class="btn btn-primary btn-lg">Request an issue</button></a>              
            </div>
          </div>
        </div>
        <a class="carousel-control-prev" href="#hotSe" data-slide="prev">
          <span class="carousel-control-prev-icon"></span>
        </a>
        <a class="carousel-control-next" href="#hotSe" data-slide="next">
          <span class="carousel-control-next-icon"></span>
        </a>
      </div>
		</div>
	</div>
</div>


<hr class="my-2">
<!-- <button class="fun" data-toggle="collapse" data-target="#emoji">
	Click for fun
</button>
<div id="emoji" class="collapse">
	<div class="container-fluid padding">
		<div class="row text-center">
			<div class="col-sm-6 col-md-3">
				<img class="gif" src="./images/gif/blinkEyes.gif" width="100" height="100">
			</div>
			<div class="col-sm-6 col-md-3">
				<img class="gif" src="./images/gif/blinkGirl.gif" width="100" height="100">
			</div>
			<div class="col-sm-6 col-md-3">
				<img class="gif" src="./images/gif/faceHaha.gif" width="100" height="100">
			</div>
			<div class="col-sm-6 col-md-3">
				<img class="gif" src="./images/gif/haha.gif" width="100" height="100">
			</div>
		</div>
	</div>
</div> -->
 
<!-- Team member -->
<div class="container-fluid padding">
	<div class="row welcome text-center">
		<div class="col-12">
      <br>
			<h1 class="display-4">Benefits of Membership</h1>
      <br><br>
		</div>
	</div>
</div>

<div class="container-fluid padding">
	<div class="row padding container-fluid">
		<div class="col-md-4">
			<div class="card">
				<img class="card-img-top" src="PHOTOS/reading1.jpg">
				<div class="card-body">
					<h4 class="card-title">Zero-fee book events</h4>
					<p class="card-text">Each month, 3 voluntary members go on stage sharing what they learn from books; and organize 
            debates.
          </p>
				</div>
			</div>
		</div>
		<div class="col-md-4">
			<div class="card">
				<img class="card-img-top" src="PHOTOS/reading2.jpg">
				<div class="card-body">
					<h4 class="card-title">
						Free Unlimited access to books	
					</h4>
					<p class="card-text">We have over 1,000,000 paper books and 3,700,000 ebooks availabe for our members</p>
	
				</div>
			</div>
		</div>
		<div class="col-md-4">
			<div class="card">
				<img class="card-img-top" src="PHOTOS/reading3.jpg">
				<div class="card-body">
					<h4 class="card-title">
						Diverse kinds of documents
					</h4>
					<p class="card-text">From historical, documentary, geographical to non-scientific, romantic and etc types of contents are available </p>
			
				</div>
			</div>
		</div>
	</div>
</div>


<div class="container-fluid padding">
	<div class="row padding login_signup text-center">
		<div class="col-md-12">
      <img src="https://live.staticflickr.com/7306/26816592484_2ab3e30843_b.jpg" alt="" class="bg">
      <br>
      <div class="content">	<h2>Open a membership plan</h2>
        <p>All our work is for customer satisfaction with high quality Services</p>
        <p>
          <a href="signIn.jsp">
            <button type="button" class="btn btn-primary btn-lg">
              Login/ Sign up</button>
          </a>
        </p>
        </div>
        <br>
		</div>
		
	</div>
	<hr class="my-4">
</div>

<!-- contact us -->
<div class="container-fluid padding">	
	<div class="row text-center padding">
		<div class="col-12">
			<h2>Contact us</h2>
		</div>
		<div class="col-12 social padding">
			<a href="#"><i class="fab fa-facebook"></i></a>
			<a href="#"><i class="fab fa-twitter"></i></a>
			<a href="#"><i class="fab fa-google-plus-g"></i></a>
			<a href="#"><i class="fab fa-instagram"></i></a>
			<a href="#"><i class="fab fa-youtube"></i></a>
		</div>
    <br><br>
	</div>
</div>	

<!-- footer -->
<footer>
	<div class="container-fluid padding">	
		<div class="row text-center">
			<div class="col-md-4">
				<img src="PHOTOS/TE ED library.png">
				<hr class="light">
				<p>111-222-3333</p>
				<p>anhlnhe163541@fpt.edu.vn</p>
				<p>Cao Bang, Vietnam</p>
			</div>
			<div class="col-md-4">				
				<hr class="light">
				<h5>Working hours</h5>
				<hr class="light">
				<p>Monday-Friday: 8am - 5pm</p>
				<p>Weekend: 8am - 9pm</p>
			</div>
			<div class="col-md-4">				
				<hr class="light">
				<h5>Services</h5>
				<hr class="light">
				<p>Outsourcing</p>
				<p>Website development</p>
				<p>Mobile applications</p>
			</div>
			<div class="col-12">
				<hr class="light-100">
				<h5>&copy; TEED Library 2022</h5>
			</div>
		</div>
	</div>
</footer>
</body>
</html>	
