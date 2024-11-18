package IteratorPattern;

public class MyArray implements MyIterable {
    private static final int MAX_ITEMS = 10;
    private int numberOfItems = 0;
    private String[] menuItems;

    public MyArray() {
        menuItems = new String[MAX_ITEMS];
    }

    public void addItem(String item) {
        if (numberOfItems < MAX_ITEMS) {
            menuItems[numberOfItems] = item;
            numberOfItems++;
        } else {
            System.out.println("Array is full! Cannot add more items.");
        }
    }

    @Override
    public Iterator createIterator() {
        return new MyArrayIterator(menuItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MyArray: ");
        for (int i = 0; i < numberOfItems; i++) {
            sb.append(menuItems[i]);
            if (i < numberOfItems - 1) sb.append(", ");
        }
        return sb.toString();
    }
}

