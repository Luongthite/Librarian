<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

        <div class="container">
            <div class="table-wrapper">
                <div class="table-title">
                    <div class="row">
                        <div class="col-sm-6" style="padding-top: 40px">
                            <h2>Manage <b>Member</b></h2>
                        </div>
<!--                        <div class="col-sm-6" style="padding-top: 40px">
                            <a href="#addEmployeeModal" class="btn btn-success" data-toggle="modal"><i class="fa fa-plus" aria-hidden="true"></i> <span>Add New Book</span></a>					
                        </div>-->
                    </div>
                </div>
                <table class="table table-striped table-hover">
                    <thead>
                        <tr>
                            <!--						<th>
                                                                                    <span class="custom-checkbox">
                                                                                            <input type="checkbox" id="selectAll">
                                                                                            <label for="selectAll"></label>
                                                                                    </span>
                                                                            </th>-->
                            <th>ID</th>
                            <th>Password</th>
                            <th>Name</th>
                            <th>Address</th>
                            <th>Member Plan Registration Date</th>
                            <th>Member Plan Expire Date</th>
                            <th>Email</th>
                            <th>Phone Number</th>
                            
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${listMem}" var="l">
                        <tr>
<!--                            <td>
                                <span class="custom-checkbox">
                                    <input type="checkbox" id="checkbox1" name="options[]" value="1">
                                    <label for="checkbox1"></label>
                                </span>
                            </td>-->
                            <td>${l.id}</td>
                            <td>${l.password}</td>
                            <td>${l.name}</td>
                            <td>${l.address}</td>
                            <td>${l.memberRegistrationDate==null?"NI":l.memberRegistrationDate}</td>
                            <td>${l.memberRegistrationExpDate==null?"NI":l.memberRegistrationExpDate}</td>
                            <td>${l.email}</td>
                            <td>${l.phoneNumber}</td>
                            
                            
                            <td>
<!--                                <a href="loadBook?bookId=$l.id}" class="edit"><i class="fa fa-plus" aria-hidden="true" data-toggle="tooltip" title="Edit">&#xE254;</i></a>-->
                                <a href="delete?bookId=${l.id}" class="delete" ><i class="fa fa-trash" aria-hidden="true" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                            </td>
                        </tr>
                     </c:forEach>  
                    </tbody>
                </table>
<!--                <div class="clearfix">
                    <form action="aBookControl">
                    <div class="hint-text">Showing <input name="pageSize" value="$pageSize}"> out of <b>$totalMem}</b> entries</div>
                    <input type="submit" value="Go">
                    </form>
                    <ul class="pagination">
                        <pager:PagerAdmin pageSize="$pageSize}" pageIndex="$pageIndex}" endPage="$endPage}" urll="$url}"></pager:PagerAdmin>
                    </ul>
                </div>-->
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