<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>TEED Admin</title>
    <!-- Import Boostrap css, js, font awesome here -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">       
      <link href="https://use.fontawesome.com/releases/v5.0.4/css/all.css" rel="stylesheet">    
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
      </script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js">
      </script>
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
      <link href="CSS/home.css" rel="stylesheet">
      <link href='https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css' rel='stylesheet'>
      <script src="js/index.js"></script>
</head>
<body>
    <jsp:include page="AdminSideBar.jsp"></jsp:include>
   

<div class="home_content">
     <div id="main">
      <div class="headerhome row" >
    <h2 style="padding-left: 10%; display: flexbox; float: right;" >MY PROFILE</h2>
   </div>
    <hr class="my-4">
  
  
      <!-- My Profile -->
      <div class="container-fluid d-flex justify-content-center myprofile">
          <div class="col-xs-12 col-sm-6 col-md-5" style="box-shadow: 0 5px 10px rgba(0, 0, 0, 0.2);" >
              <div class="text-center" style="padding: 5%;"> <img src="PHOTOS/reading1.jpg" width="200" height="200" class="rounded-circle" ">
                  <h3 class="mt-2">${sessionScope.acc.getName()}</h3> <span class="mt-1 clearfix">${sessionScope.acc.getId()}</span>
                 
                  <hr class="line"> <small class="mt-4">I am a Librarian at TEED Library. I love reading books</small>
      
              </div>
          </div>
          <div class=" col-xs-12 col-sm-6 col-md-7" style="margin-top: 20px;"> 
                <div class="card-body">
                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Full Name</h6>
                    </div>
                    <div class="col-sm-9 text-secondary">
                      ${sessionScope.acc.getName()}
                    </div>
                  </div>
                  <hr>
                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Email</h6>
                    </div>
                    <div class="col-sm-9 text-secondary">
                      ${sessionScope.acc.getEmail()}
                    </div>
                  </div>
                  <hr>
                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Phone</h6>
                    </div>
                    <div class="col-sm-9 text-secondary">
                      ${sessionScope.acc.getPhoneNumber()}
                    </div>
                  </div>
                  <hr>
<!--                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Mobile</h6>
                    </div>
                    <div class="col-sm-9 text-secondary">
                      (320) 380-4539
                    </div>
                  </div>-->
                  <hr>
                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Address</h6>
                    </div>
                    <div class="col-sm-9 text-secondary">
                      ${sessionScope.acc.getAddress()}
                    </div>
                  </div>
                  <hr>
                  <div class="row">
                    <div class="col-sm-12">
                      <a style="color: white;" class="btn btn-block " target="__blank" href="https://www.bootdey.com/snippets/view/profile-edit-data-and-skills">Edit</a>
                    </div>
                  </div>
                </div>
             
      </div>
  
  
  
    </div>
  </div>

</div>


<script>
  let btn=document.querySelector("#btn");
  let sidebar=document.querySelector(".sidebar");

  btn.onclick=function(){
      sidebar.classList.toggle("active");
  }

  
  
</script>

</body>
</html>