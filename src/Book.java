

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Book {
    public static String TITLE = "title";
    public static String PAGE = "page";

    private String title;
    private int page;

    private Map attributeMap;

    public Book() {
        attributeMap = new HashMap();

        attributeMap.put(TITLE, this.title);
        attributeMap.put(PAGE, this.page);

        this.title = "Android Development";
        this.page = 100;


    }

    public String showInfo(ArrayList<String> arrayList) throws NoSuchFieldException, IllegalAccessException {

        String string = null;

        for (String attribute : arrayList) {
//            System.out.println(attributeMap.get(attribute));

            Field field = this.getClass().getDeclaredField(attribute);
            Object value = field.get(this);

            System.out.println(value);


        }

        System.out.println("------ Print finished ------");
        return string;
    }

}
