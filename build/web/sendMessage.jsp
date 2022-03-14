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

<div class="home_content" >
    <div id="main">
<h2>Send Message</h2>
<hr class="my-4" />
<form action="">
<table width="50%" style="margin-left:auto;margin-right:auto;">
    <tr>
        <td>
            Receiver:
        </td>
        <td>
            <input type="text" placeholder="Enter Receiver's ID" name="receiver">
        </td>
        
    </tr>
    <tr>
        <td>
            Message:
        </td>
        <td>
            <input type="text" name="message" id="" placeholder="Enter Message">
        </td>
       
    </tr>
    <tr>
        <td>
            
        </td>
        <td>
            <input type="submit" class="btn btn-primary btn-lg" style="background-color: rgb(139, 1, 1);" value="SEND MESSAGE">
        </td>
    </tr>
</table>
</form>
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