<%-- 
    Document   : editReturn
    Created on : Mar 23, 2022, 10:36:41 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="modal-content">
            <form action="editReturn" method="POST">
                        <div class="modal-header">						
                            <h4 class="modal-title">Edit Return Date</h4>
                        </div>
                        <div class="modal-body">
                            <div class="form-group">
                                <label>Member ID</label>
                                <input type="text" class="form-control" name="memberId" value="${memberId}" readonly>
                            </div>
                            <div class="form-group">
                                <label>Admin ID</label>
                                <input type="text" class="form-control" name="adminId" value="${adminId}" readonly>
                            </div>
                            <div class="form-group">
                                <label>Book ID</label>
                                <input type="number" class="form-control" name="bookId" value="${bookId}" readonly>
                            </div>
                            <div class="form-group">
                                <label>Date Of Issue</label>
                                <input type="date" class="form-control" name="dateOfIssued" value="${dateOfIssued}">
                            </div>
                            <div class="form-group">
                                <label>Date Of Return</label>
                                <input type="date" class="form-control" name="dateOfReturn" value="${dateOfReturn}">
                            </div>
                            <div class="form-group">
                                <label>Actual Return Date</label>
                                <input type="date" class="form-control" name="actualReturnDate" value="${actualReturnDate}">
                            </div>
                            <div class="form-group">
                                <label>Fine</label>
                                <input type="number" class="form-control" name="fine" value="${fine}">
                            </div>
                            
                        </div>
                        <div class="modal-footer">
                          
                            <input type="submit" class="btn btn-success" value="Edit">
                        </div>
                    </form>
                </div>
    </body>
</html>
