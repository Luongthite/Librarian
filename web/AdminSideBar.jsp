<%-- 
    Document   : AdminSideBar
    Created on : Mar 13, 2022, 10:37:15 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <div class="sidebar">
      <div class="logo_content">
          <div class="logo">
              <i class='bx bx-library'></i>
              <div class="logo_name">
                  TEED LIBRARY
              </div>
          </div>
          <i class='bx bx-menu' id="btn"></i>
      </div>
      <ul class="nav_list">
        <li>
            <a href="admin.jsp" >
                <i class='bx bx-id-card'></i>
                <span class="links_name">My Profile</span>
            </a>
            <span class="tooltip">My Profile</span>
        </li>
        <li>
            <a href="aBookControl">
                <i class='bx bxs-book' ></i>
                <span class="links_name">Book Information</span>
            </a>
            <span class="tooltip">Book Information</span>
        </li>
<!--        <li>
            <a href="addBook.jsp">
                <i class='bx bxs-book-add' ></i>
                <span class="links_name">Add Book</span>
            </a>
            <span class="tooltip">Add Book</span>
        </li>-->
<!--        <li>
            <a href="sendMessage.jsp">
                <i class='bx bx-chat' ></i>
                <span class="links_name">Send Message</span>
            </a>
            <span class="tooltip">Send Message</span>
        </li>-->
        <li>
            <a href="member">
                <i class='bx bxs-user-detail' ></i>
                <span class="links_name">Manage User</span>
            </a>
            <span class="tooltip">Manage User</span>
        </li>
         <li>
            <a href="areq">
                <i class='bx bx-book-reader' ></i>
                <span class="links_name">Issue/ Return Request</span>
            </a>
            <span class="tooltip">Request</span>
        </li>
<!--        <li>
            <a href="recommendations.jsp">
                <i class='bx bx-book-heart' ></i>
                <span class="links_name">Recommendations</span>
            </a>
            <span class="tooltip">Recommendations</span>
        </li>-->
        <li>
            <a href="CurrentlyIssued">
                <i class='bx bxs-edit-alt'></i>
                <span class="links_name">Currently Issued Books</span>
            </a>
            <span class="tooltip">Currently Issued</span>
        </li>
    </ul>
      <div class="profile_content">
          <div class="profile">
              <div class="profile_details">
                  <img src="PHOTOS/reading1.jpg" alt="">
                  <div class="name_job">
                      <div class="name">
                          Admin 1
                      </div>
                      <div class="job">Administrator</div>
                  </div>
              </div>
              <a href="logout"><i class='bx bx-log-out' id="log_out" ></i></a>
              
          </div>
      </div>
  </div>