public class MultiplicationTable implements Runnable {
    private int table;

    public MultiplicationTable(int table) {
        this.table = table;
    }

    public void run() {
        System.out.println("Multiplication table of " + table + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", table, i, table * i);
        }
    }

    public static void main(String[] args) {
        MultiplicationTable table5 = new MultiplicationTable(5);
        MultiplicationTable table10 = new MultiplicationTable(10);

        Thread t1 = new Thread(table5);
        Thread t2 = new Thread(table10);

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();

        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
