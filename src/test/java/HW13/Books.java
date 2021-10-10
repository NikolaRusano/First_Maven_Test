package HW13;

import lombok.Data;
import lombok.Getter;




@Data
public class Books {


    String author, title, kind;
    double price;
    int pageNum;
    String coverBookBook;

    public Books(String author, String title, String kind, double price, int pageNum, String coverBookBook) {
        this.author = author;
        this.title = title;
        this.kind = kind;
        this.price = price;
        this.pageNum = pageNum;
        this.coverBookBook = coverBookBook;
    }

}
