
import DAL.BookDAO;
import DAL.CategoryDAO;
import DAL.IssuedDAO;
import DAL.MemberDAO;
import DAL.RequestDAO;
import Model.Book;
import Model.Category;
import Model.Issued;
import Model.Member;
import Model.Request;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class main {
    public static void main(String[] args) {
//        MemberDAO test=new MemberDAO();
//        ArrayList<Member> list=new ArrayList<>();
//        list=test.getAll();
//        for (Member member : list) {
//            System.out.println(member);
//        }
//        System.out.println("===========TEST GETMEMBER==========");
//        Member m=new Member();
//        m=test.getMember("HS26749", "HS26749");
//        System.out.println(m);

//        CategoryDAO bdao=new CategoryDAO();
//        ArrayList<Category> books=bdao.getAll();
//        for (Category book : books) {
//            System.out.println(book.getName());
//        }

BookDAO bdao=new BookDAO();
//        Book listPage=bdao.mostBorrowedByCate("C01");
//        System.out.println(listPage);
//                
//    }


//SimpleDateFormat formDate = new SimpleDateFormat("yyyy-MM-dd");
//
//       // String strDate = formDate.format(System.currentTimeMillis()); // option 1
//       String strDate = formDate.format(new Date());
//       Date date=null;
//        try {
//             date=formDate.parse(strDate);
//        } catch (ParseException ex) {
//            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        java.sql.Date sqlDate = new java.sql.Date(date.getTime()); 
//
//bdao.addBook("The mystery of te", "Te", 2020, "https://www.tutorialrepublic.com/snippets/designs/crud-data-table-for-database-with-modal-form.png",
//        "D514", 20, 20, "C07", "TE's language", sqlDate,3, "This is about a girl named Te");
//ArrayList<Book> books=bdao.getAll();


RequestDAO rdao=new RequestDAO();
//ArrayList<Request> reqs=rdao.getAll();
//        for (Request req : reqs) {
//            System.out.println(req);
//        }

IssuedDAO idao=new IssuedDAO();
ArrayList<Issued> reqs=idao.getAll();
        for (Issued req : reqs) {
            System.out.println(req);
        }
        
        
}
}