package IteratorPattern;

import java.util.ArrayList;

public class MyListIterator implements Iterator {
    private ArrayList<String> items;
    private int position = 0;

    public MyListIterator(ArrayList<String> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public String next() {
        if (hasNext()) {
            return items.get(position++);
        }
        return null;
    }
}
