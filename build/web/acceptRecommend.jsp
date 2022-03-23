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
    </body>
</html>
