package IteratorPattern;

import java.util.ArrayList;

public class MyList implements MyIterable {
    private ArrayList<String> menuItems;

    public MyList() {
        menuItems = new ArrayList<>();
    }

    public void addItem(String item) {
        menuItems.add(item);
    }

    @Override
    public Iterator createIterator() {
        return new MyListIterator(menuItems);
    }

    @Override
    public String toString() {
        return "MyList: " + menuItems.toString();
    }
}
