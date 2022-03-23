
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="pager" uri="/WEB-INF/tlds/pageTag" %>
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
        <div style="overflow: scroll; height : 90%; max-height:750px">
        <jsp:include page="AdminSideBar.jsp"></jsp:include>

        <div class="container">
            <div class="table-wrapper">
                <div class="table-title">
                    <div class="row">
                        <div class="col-sm-6" style="padding-top: 40px">
                            <h2>Currently Recommended <b>Books</b></h2>
                        </div>
<!--                        <div class="col-sm-6" style="padding-top: 40px">
                            <a href="#addEmployeeModal" class="btn btn-success" data-toggle="modal"><i class="fa fa-plus" aria-hidden="true"></i> <span>Add New Book</span></a>					
                        </div>-->
                    </div>
                </div>
                <table class="table table-striped table-hover">
                    <thead>
                        <tr>
                          
                            <th>Member ID</th>
                            <th>Book Name</th>
                            <th>Author</th>
                            <th>Description</th>
                            <th>Book Pic URL</th>
                            <th>Status</th>
                            <th></th>
                            <th></th>
                            
                            
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${recs}" var="li">
                        <tr>
                            <td>${li.getMemberId()}</td>
                            <td>${li.bookName}</td>
                            <td>${li.author}</td>
                            <td>${li.des}</td>
                             <td>${li.bookPic}</td>
                            <td>${li.status}</td>
                            <c:if test="${li.status!='Denied'}">
                                <c:if test="${li.status!='Approved'}">
                            <td><a href="approveRecc">Accept</a></td>
                            <td><a href="denyRec?memberId=${li.getMemberId()}&bookName=${li.bookName}">Deny</a></td>
                            </c:if>
                            </c:if>
                            
                           
                            
<!--                            <td>
                                <a href="loadBook?bookId=$l.id}" class="edit"><i class="fa fa-plus" aria-hidden="true" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
                                <a href="delete?bookId=$l.id}" class="delete" ><i class="fa fa-trash" aria-hidden="true" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                            </td>-->
                        </tr>
                     </c:forEach>  
                    </tbody>
                </table>
<!--                <div class="clearfix">
                    <form action="aBookControl">
                    <div class="hint-text">Showing <input name="pageSize" value="$pageSize}"> out of <b>25</b> entries</div>
                    <input type="submit" value="Go">
                    </form>
                    <ul class="pagination">
                        
                    </ul>
                </div>-->
            </div>
        </div>
        
        
</div>
        <script>
            let btn = document.querySelector("#btn");
            let sidebar = document.querySelector(".sidebar");

            btn.onclick = function () {
                sidebar.classList.toggle("active");
            }
        </script>

    </body>
</html>