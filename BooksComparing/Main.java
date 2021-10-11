package BooksComparing;

import java.rmi.server.ObjID;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book();
        b1.setNumberOfPages(100);
        b1.setAuthorName("James Cordy");
        b1.setTtile("java programming");
        
        Book b2 = new Book();
        b2.setNumberOfPages(100);
        b2.setAuthorName("James Cordy");
        b2.setTtile("python programming");

        int compareRes = b1.compareTo(b2);
        
        if(compareRes < 0){
            System.out.println("b1 is less than b2");
        }
        else if(compareRes == 0){
            System.out.println("b1 equal b2");

        }
        else{
            System.out.println("b1 is greater than b2");


        }

    }
    
}
