
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
                            <h2>Currently Issued <b>Books</b></h2>
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
                            <th>Book ID</th>
                            <th>Admin ID</th>
                            <th>Date Of Issue</th>
                            <th>Date Of Return</th>
                            <th>Actual Return Date</th>
                            <th>Fine</th>
                            <th></th>
                            
                            
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${listPage}" var="li">
                        <tr>
                            <td>${li.getMemberId()}</td>
                            <td>${li.bookId}</td>
                            <td>${li.adminId}</td>
                            <td>${li.dateOfIssue}</td>
                            <td>${li.dateOfReturn}</td>
                            <td>${li.actualReturnDate}</td>
                            <td>${li.fine}</td>
                            <td><c:if test="${li.actualReturnDate==null}"><a href="return?bookId=${li.bookId}&memberId=${li.memberId}&dateOfIssued=${li.dateOfIssue}">Return</a></c:if>
                            <c:if test="${li.actualReturnDate!=null}"><a href="rollBack?bookId=${li.bookId}&memberId=${li.memberId}&dateOfIssued=${li.dateOfIssue}">Roll Back</a>
                           </c:if>
                            </td>
                            <td><a href="editReturn?bookId=${li.bookId}&memberId=${li.memberId}&dateOfIssued=${li.dateOfIssue}&adminId=${li.adminId}&dateOfReturn=${li.dateOfReturn}&actualReturnDate=${li.actualReturnDate}&fine=${li.fine}
                                   " >Edit</a></td>
                            
                                    <div id="addEmployeeModal" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="editReturn">
                        
                        <div class="modal-header">						
                            <h4 class="modal-title">Edit Return Date</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">
                            <div class="form-group">
                                <label>Member ID</label>
                                <input type="text" class="form-control" name="memberId" value="${li.getMemberId()}">
                            </div>
                            <div class="form-group">
                                <label>Actual Return Date</label>
                                <input type="date" class="form-control" name="returnDate" required>
                            </div>
                            <div class="form-group">
                                <label>Actual Return Date</label>
                                <input type="date" class="form-control" name="returnDate" required>
                            </div>
                            
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                            <input type="submit" class="btn btn-success" value="Add">
                        </div>
                    </form>
                </div>
            </div>
                            
        </div>
                            
                            
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
        <!-- Edit Modal HTML -->
        <div id="addEmployeeModal" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="add">
                        <div class="modal-header">						
                            <h4 class="modal-title">Add Book</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">
                            
                            <div class="form-group">
                                <label>Title</label>
                                <input type="text" class="form-control" name="title" required>
                            </div>
                            <div class="form-group">
                                <label>Publisher</label>
                                <input type="text" class="form-control" name="publisher" required>
                            </div>
                            <div class="form-group">
                                <label>Year</label>
                               <input type="number" class="form-control" name="year" required>
                            </div>
                             <div class="form-group">
                                <label>Photos URL</label>
                                <input type="text" class="form-control" name="pic" required>
                            </div>
                            <div class="form-group">
                                <label>ShelfId</label>
                                <input type="text" class="form-control" name="shelfId" required>
                            </div>
                            <div class="form-group">
                                <label>Quantity</label>
                                <input type="number" class="form-control" name="quantity" required>
                            </div>
                            <div class="form-group">
                                <label>Category</label>
                                <input type="text" class="form-control" name="category" required>
                            </div>
                            <div class="form-group">
                                <label>Language</label>
                                <input type="text" class="form-control" name="language" required>
                            </div>
                            <div class="form-group">
                                <label>Rental Price</label>
                                <input type="number" class="form-control" name="price" required>
                            </div>
                             <div class="form-group">
                                <label>Short Description</label>
                                <textarea class="form-control" name="shortDes" required></textarea>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                            <input type="submit" class="btn btn-success" value="Add">
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <!-- Edit Modal HTML -->
        <div id="editEmployeeModal" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="update">
                        <div class="modal-header">						
                            <h4 class="modal-title">Edit Book</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">					
                            <div class="form-group">
                                <label>Title</label>
                                <input type="text" class="form-control" name="title" required>
                            </div>
                            <div class="form-group">
                                <label>Publisher</label>
                                <input type="email" class="form-control" name="publisher" required>
                            </div>
                            <div class="form-group">
                                <label>Year</label>
                               <input type="number" class="form-control" name="year" required>
                            </div>
                             <div class="form-group">
                                <label>Photos URL</label>
                                <input type="text" class="form-control" name="pic" required>
                            </div>
                            <div class="form-group">
                                <label>ShelfId</label>
                                <input type="text" class="form-control" name="shelfId" required>
                            </div>
                            <div class="form-group">
                                <label>Quantity</label>
                                <input type="number" class="form-control" name="quantity" required>
                            </div>
                            <div class="form-group">
                               <label>Category</label>
                                <input type="text" class="form-control" name="category" required>
                            </div>
                            <div class="form-group">
                                <label>Language</label>
                                <input type="text" class="form-control" name="language" required>
                            </div>
                            <div class="form-group">
                                <label>Rental Price</label>
                                <input type="number" class="form-control" name="price" required>
                            </div>
                             <div class="form-group">
                                <label>Short Description</label>
                                <textarea class="form-control" name="shortDes" required></textarea>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                            <input type="submit" class="btn btn-info" value="Save">
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <!-- Delete Modal HTML -->
<!--        <div id="deleteEmployeeModal" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="delete">
                        <div class="modal-header">						
                            <h4 class="modal-title">Delete Book</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">					
                            <p>Are you sure you want to delete this Book?</p>
                            <p class="text-warning"><small>This action cannot be undone.</small></p>
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                            <input type="submit" class="btn btn-danger" value="Delete">
                        </div>
                    </form>
                </div>
            </div>
        </div>-->
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