import java.util.Arrays;

public class MainThree {
    public static void main(String[] args) {
        int[] numbers = new int [100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 100000);
        }
        System.out.println("Array: " + Arrays.toString(numbers));
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("Start time: " + stopWatch.getStartTime() + " milliseconds");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("Array: " + Arrays.toString(numbers));
        stopWatch.stop();
        System.out.println("End time: " + stopWatch.getEndTime() + " milliseconds");
        System.out.println("Execution time: " + stopWatch.getElapsedTime() + " milliseconds");
    }
}
class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch(){
    }
    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public long getStartTime() {
        return this.startTime;
    }
    public long getEndTime() {
        return this.endTime;
    }
    public void start() {
        startTime = System.currentTimeMillis();
    }
    public void stop() {
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
