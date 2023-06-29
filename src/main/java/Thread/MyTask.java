package Thread;

/**
 * @author zoh66
 * @Description
 * @create 2023-06-29 16:31
 */
public class MyTask implements Runnable {
    private final int[] array;
    private final int startIndex;
    private final int endIndex;

    public MyTask(int[] array, int startIndex, int endIndex) {
        this.array = array;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.println("Thread: " + Thread.currentThread().getId() + ", Element: " + array[i]);
        }
    }
}
