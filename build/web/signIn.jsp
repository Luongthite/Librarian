<%-- 
    Document   : signIn
    Created on : Mar 7, 2022, 11:58:34 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
    <link rel="stylesheet" href="CSS/signIn.css">
    <title>Bootstrap 4 Login/Register Form</title>
</head>
<body>
   
    <div class="alert alert-warning" role="alert">
 ${alert}
</div>
    <div style="display: flex;">
    <div id="logreg-forms" class="admin">
        <h4 style="text-align: center; padding-top: 20px;">If you are an Admin</h4>
        <hr>
        
        <form class="Aform-signin" action="aLogin" method="POST">
            <h1 class="h3 mb-3 font-weight-normal" style="text-align: center"> Sign in</h1>
            <p style="color: red">${message}</p>
            <input type="aID" id="aID" class="form-control" placeholder="Admin ID" value="${adminID}" name="aID">
            <input type="password" id="inputPassword" class="form-control" placeholder="Password" value="${adminPass}" name="aPass">
             <div class="form-check">
            <input type="checkbox" class="form-check-input" id="rememberMe" name="rememberMeAd"/>
            <label class="form-check-label" for="rememberMe"
              >remember Me</label
            >
          </div>
             <button class="btn btn-success btn-block" type="submit" name="submitB" value="admin"><i class="fas fa-sign-in-alt"></i> Sign in</button>
            <a href="#" id="Aforgot_pswd">Forgot password?</a>
            
            </form>

            <form action="/reset/password/" class="Aform-reset" style="display: none">
                <input type="email" id="resetEmail" class="form-control" placeholder="Email address" required="" autofocus="">
                <button class="btn btn-primary btn-block" type="submit">Reset Password</button>
                <a href="#" id="Acancel_reset"><i class="fas fa-angle-left"></i> Back</a>
            </form>
            <br>
    </div>  

    <div id="logreg-forms" class="user">
        <h4 style="text-align: center; padding-top: 20px;">If you are an User</h4>
        <hr>
        <form class="form-signin" action="aLogin" method="POST">
            <h1 class="h3 mb-3 font-weight-normal" style="text-align: center"> Sign in</h1>
            <p style="color: red">${message}</p>
            <input type="text" id="inputEmail" class="form-control" placeholder="ID" name="uID" value="${userID}">
            <input type="password" id="inputPassword" class="form-control" placeholder="Password" name="uPass" value="${userPass}">
             <div class="form-check">
            <input type="checkbox" class="form-check-input" id="rememberMe" name="rememberMeU" />
            <label class="form-check-label" for="rememberMe"
              >remember Me</label
            >
          </div>
            <button class="btn btn-success btn-block" type="submit" name="submitB" value="member"><i class="fas fa-sign-in-alt" ></i> Sign in</button>
            <a href="#" id="forgot_pswd">Forgot password?</a>
            <hr>
            <!-- <p>Don't have an account!</p>  -->
            <button class="btn btn-primary btn-block" type="button" id="btn-signup"><i class="fas fa-user-plus"></i> Sign up New Account</button>
            </form>

            <form action="/reset/password/" class="form-reset">
                <input type="email" id="resetEmail" class="form-control" placeholder="Email address" required="" autofocus="">
                <button class="btn btn-primary btn-block" type="submit">Reset Password</button>
                <a href="#" id="cancel_reset"><i class="fas fa-angle-left"></i> Back</a>
            </form>
            
            <form action="USignUp" class="form-signup">
           

                <div class="form-group">
                    <label for="SignID">ID</label>
                    <input
                      type="text"
                      class="form-control"
                      id="SignID" name="SignID"
                      placeholder="Enter your Member ID"
                      name="signId"
                    />
                  </div>
                  <div class="form-group">
                    <label for="SignPassword" class="label">Password</label>
                    <input
                      type="password"
                      class="form-control"
                      id="SignPassword"
                      placeholder="Password" name="SignPassword"
                    />
                  </div>
      
                  <div class="form-group">
                      <label for="SignRePassword" class="label">Confirm Password</label>
                      <input
                        type="password"
                        class="form-control"
                        id="SignRePassword"
                        placeholder="Re-confirm Password" name="SignRePassword"
                      />
                      <p class="RepasswordError"></p>
                    </div>
      
                    <div class="form-group">
                      <label for="SignName" class="label">Name</label>
                      <input
                        type="text"
                        class="form-control"
                        id="SignName"
                        placeholder="Your Name" name="Name"
                      />
                    </div>
      
                    <div class="form-group">
                      <label for="Address" class="label">Address</label>
                      <input
                        type="text"
                        class="form-control"
                        id="Address"
                        placeholder="Your Address" name="Address"
                      />
                    </div>
                  
                    <div class="form-group">
                      <label for="Email" class="label">Email</label>
                      <input
                        type="email"
                        class="form-control"
                        id="Email"
                        placeholder="Your Email" name="Email"
                      />
                    </div>
      
                    <div class="form-group">
                      <label for="PhoneNumber" class="label">Phone Number</label>
                      <input
                        type="number"
                        class="form-control"
                        id="PhoneNumber"
                        placeholder="Your Phone Number" name="PhoneNumber"
                      />
                    </div>
      
                    <div class="form-group">
                      <label for="CardNumber" class="label">Card Number</label>
                      <input
                        type="number"
                        class="form-control"
                        id="CardNumber"
                        placeholder="Your Card Number" name="CardNumber"
                      />
                    </div>
      
                    <div class="form-group">
                      <label for="CardExp" class="label">Card Expire Date</label>
                      
                      <input
                        type="Month"
                        class="form-control"
                        id="CardExp"
                        placeholder="Month" name="CardExp"
                      />
                    
                    </div>
      
                    <div class="form-group">
                      <label for="CVC" class="label">CVC</label>
                      <input
                        type="number"
                        class="form-control"
                        id="CVC"
                        placeholder="Your CVC" name="CVC"
                      />
                    </div>

                <button class="btn btn-primary btn-block" type="submit"><i class="fas fa-user-plus"></i> Sign Up</button>
                <a href="#" id="cancel_signup"><i class="fas fa-angle-left"></i> Back</a>
            </form>
            <br>
    </div>
</div>
<!--    
    <p style="text-align:center">
        <a href="http://bit.ly/2RjWFMfunction toggleResetPswd(e){
    e.preventDefault();
    $('#logreg-forms .form-signin').toggle() // display:block or none
    $('#logreg-forms .form-reset').toggle() // display:block or none
}

function toggleSignUp(e){
    e.preventDefault();
    $('#logreg-forms .form-signin').toggle(); // display:block or none
    $('#logreg-forms .form-signup').toggle(); // display:block or none
}

$(()=>{
    // Login Register Form
    $('#logreg-forms #forgot_pswd').click(toggleResetPswd);
    $('#logreg-forms #cancel_reset').click(toggleResetPswd);
    $('#logreg-forms #btn-signup').click(toggleSignUp);
    $('#logreg-forms #cancel_signup').click(toggleSignUp);
})g" target="_blank" style="color:black">By Artin</a>
    </p> -->

    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <script src="JS/index.js"></script>
</body>
</html>