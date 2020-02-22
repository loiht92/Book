package book1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        ProgrammingBook book1 = new ProgrammingBook(2, "ki nang song",300.000,"Authu","java","2");
       System.out.println(book1);

        ProgrammingBook book2 = new ProgrammingBook(1, "thoi quen doc lap",200.000,"Sphen","English","4");
       System.out.println(book2);

        ProgrammingBook book3 = new ProgrammingBook(1, "7 thói quen để thành đạt",500.000,"Stephen","java","1");
        System.out.println(book3);

        FictionBook book4 = new FictionBook("Truyện tranh", 1,"Doremon",100.000,"Yhama");
        System.out.println(book4);

        FictionBook book5 = new FictionBook("Trinh tham", 4,"Conan",200.000,"AOYAMA");
        System.out.println(book5);

        FictionBook book6 = new FictionBook("Truyện co tich", 3,"Su tich trau cau",300.000,"Nguyen Cong hoan");
        System.out.println(book6);

        Book [] myBook = {book1,book2,book3,book4,book5,book6}; //muon tinh tong thi phai cho vao mang
        int sum = 0;
        for (int i =0; i < myBook.length; i++){
           sum+= myBook[i].price;

        }
        System.out.println("Tong tien cua 6 cuon sach la: " +sum);
//        boolean isProgrammingBook = false;
//        boolean isJavaBook = false;
        int countJavaBook = 0;

        for (int i = 0; i < myBook.length; i++){
          if(myBook[i] instanceof ProgrammingBook){ //kiem tra kieu cua mybook co giong kieu cua programing khong
              if(((ProgrammingBook) myBook[i]).language.equals("java")){ //language.equals("java")): so sanh 2 toan tu la languge va java xem co trung nhau khong
                  countJavaBook++;
              }
          }
        }
        System.out.println("Tong so java Book: "+countJavaBook);
    }
}

