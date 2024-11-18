package IteratorPattern;

public class App {

    public static void printItems(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        // MyArray Example
        MyArray myArray = new MyArray();
        myArray.addItem("Item1");
        myArray.addItem("Item2");
        myArray.addItem("Item3");

        System.out.println(myArray);
        System.out.println("Iterating MyArray:");
        printItems(myArray.createIterator());

        // MyList Example
        MyList myList = new MyList();
        myList.addItem("ListItem1");
        myList.addItem("ListItem2");
        myList.addItem("ListItem3");

        System.out.println(myList);
        System.out.println("Iterating MyList:");
        printItems(myList.createIterator());
    }
}
