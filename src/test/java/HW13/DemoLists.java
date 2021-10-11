package HW13;

import java.awt.print.Book;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class DemoLists {
    public static void main(String[] args) {


        Books book1 = new Books("Stephen King","The Thing","horror",420.50,350,"hard");
        Books book2 = new Books("Yan Fleming","Royal casino","detective",470.50,402,"hard");
        Books book3 = new Books("Gomer","Iliada","Gothic story",500.50,251,"soft");
        ArrayList<Books> firstBookShelf = new ArrayList<>(Arrays.asList(book1,book2,book3));
        System.out.println(firstBookShelf.get(0).toString());
        System.out.printf("\n");

        firstBookShelf.forEach(n-> System.out.println(n));
        Books book4 = new Books("Ray Bradbary","Chronics of Mars","science fiction", 500.50,220,"soft");
        Books book5 = new Books("Lev Tolstoy","War and Piece","Classical roman", 5000.50,3600,"hard");
        firstBookShelf.add(0,book4);

        System.out.printf("\n");
        firstBookShelf.forEach(n-> System.out.println(n));

        System.out.printf("\n");

        firstBookShelf.add(firstBookShelf.size()-1,book5);
        firstBookShelf.forEach(n-> System.out::println);





    }
}
