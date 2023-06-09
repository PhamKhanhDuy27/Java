import java.util.Random;

public class TestCar implements Runnable{
    public static final int DISTANCE = 100;
    public static final int STEP = 2;
    private String name;
    public TestCar(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        int runDistance = 0;
        long startTime = System.currentTimeMillis();
        while (runDistance < DISTANCE) {
            try {
                int speed = (new Random()).nextInt(20);
                runDistance += speed;
                String log = "|";
                int percentTravel = (runDistance * 100) / DISTANCE;
                for (int i = 0; i < DISTANCE; i += STEP) {
                    if (percentTravel >= i + STEP) {
                        log += "=";
                    }
                    else if (percentTravel >= i && percentTravel < i + STEP) {
                        log += "o";
                    }
                    else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car" + this.name + ": " + log + " " + Math.min(DISTANCE, runDistance) + "KM");
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println("Car" + this.name + " Finish in " + " broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.name + " Finish in " + (endTime - startTime) / 1000 + "s");
    }

    public static void main(String[] args) {
        TestCar testCarA = new TestCar("A");
        TestCar testCarB = new TestCar("B");
        TestCar testCarC = new TestCar("C");
        Thread thread1 = new Thread(testCarA);
        Thread thread2 = new Thread(testCarB);
        Thread thread3 = new Thread(testCarC);
        System.out.println("Distance: 100KM");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
