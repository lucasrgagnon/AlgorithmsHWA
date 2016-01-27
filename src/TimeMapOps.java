import java.util.HashMap;

/**
 * Created by lucasgagnon on 1/25/16.
 */
public class TimeMapOps {

    public static long timeAdd(int n) {
        HashMap<Integer, Integer> testMap = new HashMap<>();
        int maxReps = Math.min((int) (Math.pow(10, 9) / n), 1000000);
        long timeSum = 0;

        for (int reps = 0; reps < maxReps; reps++) {
            long startTime = System.currentTimeMillis();
            for (int i =0; i < n; i++) {
                testMap.put(i, i);
            }
            long endTime = System.currentTimeMillis();
            timeSum += startTime - endTime;
        }
        return(timeSum / maxReps);
    }


    public static long timeRemove(int n) {
        HashMap<Integer, Integer> testMap = new HashMap<>();
        for (int i = 0; i < n; i++){
            testMap.put(i, i);
        }
        int maxReps = Math.min((int) (Math.pow(10, 9) / n), 1000000);
        long timeSum = 0;

        for (int reps = 0; reps < maxReps; reps++) {
            HashMap<Integer, Integer> tempTestMap = (HashMap<Integer, Integer>) testMap.clone();
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < n; i++) {
                tempTestMap.remove(i);
            }
            long endTime = System.currentTimeMillis();
            timeSum += startTime - endTime;
        }
        return(timeSum / maxReps);
    }



}
