import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucasgagnon on 1/25/16.
 */
public class TimeListOps {

    static int maxReps = 10;

    public static long timeAddFront(int n) {
        List<Integer> testList = new ArrayList<>();
        long timeSum = 0;

        for (int reps = 0; reps < maxReps; reps++) {
            long startTime = System.nanoTime();
            for (int i =0; i < n; i++) {
                testList.add(0, i);
            }
            long endTime = System.nanoTime();
            timeSum += endTime - startTime;
        }
        System.out.println("Completed list add to front " + n + ".");
        return(timeSum / maxReps);
    }

    public static long timeAddMid(int n) {
        List<Integer> testList = new ArrayList<>();
        long timeSum = 0;

        for (int reps = 0; reps < maxReps; reps++) {
            long startTime = System.nanoTime();
            for (int i =0; i < n; i++) {
                testList.add(testList.size() / 2, i);
            }
            long endTime = System.nanoTime();
            timeSum += endTime - startTime;
        }
        System.out.println("Completed list add to middle " + n + ".");
        return(timeSum / maxReps);
    }

    public static long timeAddEnd(int n) {
        List<Integer> testList = new ArrayList<>();
        long timeSum = 0;

        for (int reps = 0; reps < maxReps; reps++) {
            long startTime = System.nanoTime();
            for (int i =0; i < n; i++) {
                testList.add(i);
            }
            long endTime = System.nanoTime();
            timeSum += endTime - startTime;
        }
        System.out.println("Completed list add to end " + n + ".");
        return(timeSum / maxReps);
    }


    public static long timeRemoveFront(int n) {
        ArrayList<Integer> testList = new ArrayList<Integer>();
        for (int i = 0; i < n; i++){
            testList.add(i);
        }
        long timeSum = 0;

        for (int reps = 0; reps < maxReps; reps++) {
            ArrayList<Integer> tempTestList = (ArrayList<Integer>) testList.clone();
            long startTime = System.nanoTime();
            for (int i = 0; i < n; i++) {
                tempTestList.remove(0);
            }
            long endTime = System.nanoTime();
            timeSum += endTime - startTime;
        }
        System.out.println("Completed list remove from front " + n + ".");
        return(timeSum / maxReps);
    }

    public static long timeRemoveMid(int n) {
        ArrayList<Integer> testList = new ArrayList<Integer>();
        for (int i = 0; i < n; i++){
            testList.add(i);
        }
        long timeSum = 0;

        for (int reps = 0; reps < maxReps; reps++) {
            ArrayList<Integer> tempTestList = (ArrayList<Integer>) testList.clone();
            long startTime = System.nanoTime();
            for (int i = 0; i < n; i++) {
                tempTestList.remove(tempTestList.size() / 2);
            }
            long endTime = System.nanoTime();
            timeSum += endTime - startTime;
        }
        System.out.println("Completed list remove from middle " + n + ".");
        return(timeSum / maxReps);
    }

    public static long timeRemoveEnd(int n) {
        ArrayList<Integer> testList = new ArrayList<Integer>();
        for (int i = 0; i < n; i++){
            testList.add(i);
        }
        long timeSum = 0;

        for (int reps = 0; reps < maxReps; reps++) {
            ArrayList<Integer> tempTestList = (ArrayList<Integer>) testList.clone();
            long startTime = System.nanoTime();
            for (int i = 0; i < n; i++) {
                tempTestList.remove(tempTestList.size()-1);
            }
            long endTime = System.nanoTime();
            timeSum += endTime - startTime;
        }
        System.out.println("Completed list remove from end " + n + ".");
        return(timeSum / maxReps);
    }
}
