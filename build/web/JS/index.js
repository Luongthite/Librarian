/* Set the width of the sidebar to 250px and the left margin of the page content to 250px */
function openNav() {
    document.getElementById("mySidebar").style.width = "300px";
    document.getElementById("main").style.marginLeft = "250px";
  }
  
  /* Set the width of the sidebar to 0 and the left margin of the page content to 0 */
  function closeNav() {
    document.getElementById("mySidebar").style.width = "0";
    document.getElementById("main").style.marginLeft = "0";
  }

  function toggleResetPswd(e){
    e.preventDefault();
    $('#logreg-forms .form-signin').toggle(); // display:block or none
    $('#logreg-forms .form-reset').toggle(); // display:block or none
}

  function toggleResetPswdA(e){
    e.preventDefault();
    $('#logreg-forms .Aform-signin').toggle(); // display:block or none
    $('#logreg-forms .Aform-reset').toggle(); // display:block or none
    }

function toggleSignUp(e){
    e.preventDefault();
    $('.user .form-signin').toggle(); // display:block or none
    $('.user .form-signup').toggle(); // display:block or none
}


$(()=>{
    // Login Register Form
    $('#logreg-forms #forgot_pswd').click(toggleResetPswd);
    $('#logreg-forms #cancel_reset').click(toggleResetPswd);
    $('#logreg-forms #btn-signup').click(toggleSignUp);
    $('#logreg-forms #cancel_signup').click(toggleSignUp);
});

$(()=>{
    // Login Register Form
    $('#logreg-forms #Aforgot_pswd').click(toggleResetPswdA);
    $('#logreg-forms #Acancel_reset').click(toggleResetPswdA);
});