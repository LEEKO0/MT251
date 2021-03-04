package MainClasses;

import java.util.*;

public class Stack2 {

    private ArrayList<Object> list = new ArrayList<Object>();

    public int getSize() {
        return list.size();
    }

    public boolean isEmpty() {
        if (getSize() == 0)
            return true;
        return false;
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        return list.remove(getSize() - 1);
    }

    public void push(Object o) {
        list.add(o);
    }

    public int search(Object o) {
        for (int i = 0; i < getSize(); i++) {
            if (o == list.get(i)) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        return list.toString();
    }

}
