public class TestPrinter {

    public static void main(String [ ] args)
    {

        BookPrinter bookPrinter = new BookPrinter();
        try {
            bookPrinter.printBook(null);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
