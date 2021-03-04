package MainClasses;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<Object> stack = new ArrayList<Object>();

    public boolean isEmpty() {
        return this.stack.size() == 0;
    }

    public int getSize() {
        return this.stack.size();
    }

    public Object peek() {
        return !this.isEmpty() ? this.stack.get(getSize() - 1) : "The Stack is empty";
    }

    public Object pop() {
        return !this.isEmpty() ? this.stack.remove(getSize() - 1) : "The Stack is empty";
    }

    public void push(Object o) {
        this.stack.add(o);
    }

    public int search(Object o) {
        for (int i = 0; i < this.getSize(); i++)
            if (this.stack.contains(o))
                return i;
        return -1;
    }

    public String toString() {
        return "Stack: " + this.stack.toString();
    }

}
