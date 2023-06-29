package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author zoh66
 * @Description
 * @create 2023-06-29 16:28
 */
public class ExecutorServiceTest {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int totalTasks = 4;
        int taskSize = array.length / totalTasks;

        ExecutorService executorService = Executors.newFixedThreadPool(totalTasks);

        for (int i = 0; i < totalTasks; i++) {
            int startIndex = i * taskSize;
            int endIndex = i == totalTasks - 1 ? array.length - 1 : (i + 1) * taskSize - 1;
            MyTask task = new MyTask(array, startIndex, endIndex);
            executorService.execute(task);
        }

        executorService.shutdown();

    }
}
