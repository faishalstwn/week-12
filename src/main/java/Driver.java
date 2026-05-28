public class Driver {

    private static final String MESSAGE = "Current count: ";
    private static final String RESET_MESSAGE = "Current count after reset: ";

    public static void main(String[] args) {

        Counter counter = new Counter();

        System.out.println(MESSAGE + counter.getCount());

        counter.increment();

        System.out.println(MESSAGE + counter.getCount());

        counter.increaseBy(5);

        System.out.println(MESSAGE + counter.getCount());

        counter.decreaseBy(2);

        System.out.println(MESSAGE + counter.getCount());

        counter.multiplyBy(6);

        System.out.println(MESSAGE + counter.getCount());

        counter.reset();

        System.out.println(RESET_MESSAGE + counter.getCount());
    }
}