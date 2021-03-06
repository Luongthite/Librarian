


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
    <div class="headerhome row" style="padding-top: 20px;">
    
      <h2 style="padding-left: 10%; display: flexbox; float: right">
        ADD BOOK
      </h2>
    </div>
    <hr class="my-4" />
    <!-- My Book -->
    <div class="container-fluid d-flex justify-content-center headercontent row">
     

      <div class="col-xs-12 col-sm-6 col-md-4">
        <img
          id="blah"
          alt="your image"
          width="100%"
          class="rounded"
          src="photos/admin.png"
          style="margin-bottom: 10%;"
        />
        <div class="custom-file">
          <input type="file" class="custom-file-input" id="customFile" 
            onchange="document.getElementById('blah').src = window.URL.createObjectURL(this.files[0])"
          />
          <label class="custom-file-label" for="customFile" >Choose file</label >
        </div>
      </div>
      <div class="col-xs-12 col-sm-6 col-md-8 addBooks row" style="margin-left: 1%;">
      
          <form action="action_page.php">

              <label for="bookTitle">Book Title</label>
              <input type="text" id="bookTitle" name="bookTitle" placeholder="Enter the Book's Title...">
          
              <label for="year">Year of Publication</label>
              <input type="text" id="year" name="year" placeholder="Enter Year of Publication...">
          
              <label for="Publisher">Publisher</label>
             <input type="text" id="Publisher" name="Publisher" placeholder="Enter Publisher...">
          
              <label for="subject">Subject</label>
              <textarea id="subject" name="subject" placeholder="Write something.." style="height:200px"></textarea>
          
              <button type="button" class="btn btn-primary btn-lg" style="background-color: rgb(139, 1, 1);">ADD BOOK</button>
          
            </form>

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