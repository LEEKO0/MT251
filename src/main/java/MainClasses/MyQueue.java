package MainClasses;

import java.util.ArrayList;

public class MyQueue {

    private ArrayList<Object> queue = new ArrayList<Object>();

    public void enqueue(Object o) {
        this.queue.add(o);
    }

    public Object dequeue() {
        return !this.isEmpty() ? this.queue.remove(0) : "The Queue is empty";
    }

    public boolean isEmpty() {
        return (this.queue.size() == 0);
    }

    public Object first() {
        return !this.isEmpty() ? this.queue.get(0) : "The Queue is empty";
    }

    public int len() {
        return this.queue.size();
    }

    public Object get(int index) {
        return queue.get(index);
    }

    public String toString() {
        return "Queue: " + this.queue.toString();
    }
}
