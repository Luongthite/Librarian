
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
    <body><!-- Edit Modal HTML -->
        <div style="overflow: scroll; height : 90%; max-height:750px">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="updateBook">
                        <div class="modal-header">						
                            <h4 class="modal-title">Edit Book</h4>
                        </div>
                        <div class="modal-body">
                            <div class="form-group">
                                <label>ID</label>
                                <input type="text" class="form-control" name="bookId" required value="${thisB.id}" readonly>
                            </div>
                            <div class="form-group">
                                <label>Title</label>
                                <input type="text" class="form-control" name="title" required value="${thisB.title}">
                            </div>
                            <div class="form-group">
                                <label>Publisher</label>
                                <input type="text" class="form-control" name="publisher" required value="${thisB.publisher}">
                            </div>
                            <div class="form-group">
                                <label>Year</label>
                               <input type="number" class="form-control" name="year" required value="${thisB.year}"> 
                            </div>
                             <div class="form-group">
                                <label>Photos URL</label>
                                <input type="text" class="form-control" name="pic" required value="${thisB.pic}">
                            </div>
                            <div class="form-group">
                                <label>ShelfId</label>
                                <input type="text" class="form-control" name="shelfId" required value="${thisB.shelfId}">
                            </div>
                            <div class="form-group">
                                <label>Quantity</label>
                                <input type="number" class="form-control" name="quantity" required value="${thisB.quantity}">
                            </div>
                            <div class="form-group">
                                <label>Availability</label>
                                <input type="number" class="form-control" name="avail" required value="${thisB.avail}">
                            </div>
                            <div class="form-group">
                               <label>Category</label>
                                <input type="text" class="form-control" name="category" required value="${thisB.category}">
                            </div>
                            <div class="form-group">
                                <label>Language</label>
                                <input type="text" class="form-control" name="language" required value="${thisB.language}">
                            </div>
                            <div class="form-group">
                                <label>Rental Price</label>
                                <input type="number" class="form-control" name="price" required value="${thisB.rental_price}">
                            </div>
                             <div class="form-group">
                                <label>Short Description</label>
                                <textarea class="form-control" name="shortDes" required>${thisB.shortDes}</textarea>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" value="Cancel">
                            <input type="submit" class="btn btn-info" value="Save">
                        </div>
                    </form>
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