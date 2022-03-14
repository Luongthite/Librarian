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
                            <h2>Manage <b>Issue Request</b></h2>
                        </div>
<!--                        <div class="col-sm-6" style="padding-top: 40px">
                            <a href="#addEmployeeModal" class="btn btn-success" data-toggle="modal"><i class="fa fa-plus" aria-hidden="true"></i> <span>Add New Book</span></a>					
                        </div>-->
                    </div>
                </div>
                <table class="table table-striped table-hover">
                    <thead>
                        <tr>
                            <!--                                                                </th>-->
                            <th>Member ID</th>
                            <th>Book ID</th>
                            <th>Type</th>
                            <th>Status</th>
                          
                            
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${listReqs}" var="l">
                        <tr>
<!--                            <td>
                                <span class="custom-checkbox">
                                    <input type="checkbox" id="checkbox1" name="options[]" value="1">
                                    <label for="checkbox1"></label>
                                </span>
                            </td>-->
                            <td>${l.memberId}</td>
                            <td>${l.bookId}</td>
                            <td>${l.type}</td>
                            <td>${l.status}</td>
                            
                            
                            <td>
                               
                                <a href="AcceptRequest?bookId=${l.bookId}&memberId=${l.memberId}" class="edit"><i class="fa fa-check" aria-hidden="true" data-toggle="tooltip" title="Accept"></i></a>
                                <a href="DenyRequest?bookId=${l.bookId}&memberId=${l.memberId}" class="delete" ><i class="fa fa-trash" aria-hidden="true" data-toggle="tooltip" title="Deny">&#xE872;</i></a>
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