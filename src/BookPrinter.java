

import java.util.ArrayList;

public class BookPrinter {

    public BookPrinter() {

    }

    public void printBook(ArrayList<String> arrayList) throws NoSuchFieldException, IllegalAccessException {
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            arrayList.add(Book.TITLE);
            arrayList.add(Book.PAGE);
        }
        Book book = new Book();
        book.showInfo(arrayList);
    }

}
