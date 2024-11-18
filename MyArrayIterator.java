package IteratorPattern;

public class MyArrayIterator implements Iterator {
    private String[] items;
    private int position = 0;

    public MyArrayIterator(String[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public String next() {
        if (hasNext()) {
            return items[position++];
        }
        return null;
    }
}
