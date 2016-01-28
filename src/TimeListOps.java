import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucasgagnon on 1/25/16.
 */
public class TimeListOps {

    public static long timeAddFront(int n) {
        List<Integer> testList = new ArrayList<>();
        int maxReps = Math.min((int) (Math.pow(10, 9) / n), 1000000);
        long timeSum = 0;

        for (int reps = 0; reps < maxReps; reps++) {
            long startTime = System.nanoTime();
            for (int i =0; i < n; i++) {
                testList.add(0, i);
            }
            long endTime = System.nanoTime();
            timeSum += endTime-startTime;
        }
        return(timeSum / maxReps);
    }

    public static long timeAddMid(int n) {
        List<Integer> testList = new ArrayList<>();
        int maxReps = Math.min((int) (Math.pow(10, 9) / n), 1000000);
        long timeSum = 0;

        for (int reps = 0; reps < maxReps; reps++) {
            long startTime = System.nanoTime();
            for (int i =0; i < n; i++) {
                testList.add(testList.size() / 2, i);
            }
            long endTime = System.nanoTime();
            timeSum += endTime-startTime;
        }
        return(timeSum / maxReps);
    }

    public static long timeAddEnd(int n) {
        List<Integer> testList = new ArrayList<>();
        int maxReps = Math.min((int) (Math.pow(10, 9) / n), 1000000);
        long timeSum = 0;

        for (int reps = 0; reps < maxReps; reps++) {
            long startTime = System.nanoTime();
            for (int i =0; i < n; i++) {
                testList.add(i);
            }
            long endTime = System.nanoTime();
            timeSum += endTime-startTime;
        }
        return(timeSum / maxReps);
    }


    public static long timeRemoveFront(int n) {
        ArrayList<Integer> testList = new ArrayList<Integer>();
        for (int i = 0; i < n; i++){
            testList.add(i);
        }
        int maxReps = (int) (Math.pow(10, 9) / n);
        long timeSum = 0;

        for (int reps = 0; reps < maxReps; reps++) {
            ArrayList<Integer> tempTestList = (ArrayList<Integer>) testList.clone();
            long startTime = System.nanoTime();
            for (int i = 0; i < n; i++) {
                tempTestList.remove(0);
            }
            long endTime = System.nanoTime();
            timeSum += endTime-startTime;
        }
        return(timeSum / maxReps);
    }

    public static long timeRemoveMid(int n) {
        ArrayList<Integer> testList = new ArrayList<Integer>();
        for (int i = 0; i < n; i++){
            testList.add(i);
        }
        int maxReps = Math.min((int) (Math.pow(10, 9) / n), 1000000);
        long timeSum = 0;

        for (int reps = 0; reps < maxReps; reps++) {
            ArrayList<Integer> tempTestList = (ArrayList<Integer>) testList.clone();
            long startTime = System.nanoTime();
            for (int i = 0; i < n; i++) {
                tempTestList.remove(tempTestList.size() / 2);
            }
            long endTime = System.nanoTime();
            timeSum += endTime-startTime;
        }
        return(timeSum / maxReps);
    }

    public static long timeRemoveEnd(int n) {
        ArrayList<Integer> testList = new ArrayList<Integer>();
        for (int i = 0; i < n; i++){
            testList.add(i);
        }
        int maxReps = Math.min((int) (Math.pow(10, 9) / n), 1000000);
        long timeSum = 0;

        for (int reps = 0; reps < maxReps; reps++) {
            ArrayList<Integer> tempTestList = (ArrayList<Integer>) testList.clone();
            long startTime = System.nanoTime();
            for (int i = 0; i < n; i++) {
                tempTestList.remove(tempTestList.size()-1);
            }
            long endTime = System.nanoTime();
            timeSum += endTime-startTime;
        }
        return(timeSum / maxReps);
    }
}
