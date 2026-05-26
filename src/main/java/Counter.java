package src.main.java;

public class Counter {

    private int count = 0;

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public void increaseBy(int value) {
        count += value;
    }

    public void decreaseBy(int value) {
        count -= value;
    }

    public void multiplyBy(int value) {
        count *= value;
    }
}