import java.util.*;

public class Iterator {

    public static void func(ArrayList mylist) {

        Iterator it = mylist.iterator();

        while (it.hasNext()) {

            Object element = it.next();

            if (element.equals("###")) {
                break;
            }
        }

        while (it.hasNext()) {
            Object element = it.next();
            System.out.println((String) element);
        }
    }

    public static void main(String[] args) {

        ArrayList mylist = new ArrayList();

        mylist.add(42);
        mylist.add(10);
        mylist.add("###");
        mylist.add("Hello");
        mylist.add("Java");

        func(mylist);
    }
}