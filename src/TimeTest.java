import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by lucasgagnon on 1/27/16.
 */
public class TimeTest {
    private static int HOW_HIGH = 9;
    private static int[] N_Values = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000};

    public static void main(String[] args) throws IOException {

        long[] addDict = new long[HOW_HIGH];
        long[] remDict = new long[HOW_HIGH];
        long[] addFrontList = new long[HOW_HIGH];
        long[] addMidList = new long[HOW_HIGH];
        long[] addEndList = new long[HOW_HIGH];
        long[] remFrontList = new long[HOW_HIGH];
        long[] remMidList = new long[HOW_HIGH];
        long[] remEndList = new long[HOW_HIGH];

        for (int count = 0; count < HOW_HIGH; count++) {
            int n = N_Values[count];
            if (count < HOW_HIGH) {
                addDict[count] = TimeMapOps.timeAdd(n);
                remDict[count] = TimeMapOps.timeRemove(n);
                addFrontList[count] = TimeListOps.timeAddFront(n);
                addMidList[count] = TimeListOps.timeAddMid(n);
                addEndList[count] = TimeListOps.timeAddEnd(n);
                remFrontList[count] = TimeListOps.timeRemoveFront(n);
                remMidList[count] = TimeListOps.timeRemoveMid(n);
                remEndList[count] = TimeListOps.timeRemoveEnd(n);
            }
        }

        long[][] dataArray = {addDict, remDict, addFrontList, addMidList, addEndList, remFrontList, remMidList, remEndList};
        String[] nameArray = {"addDict", "remDict", "addFrontList", "addMidList", "addEndList", "remFrontList", "remMidList", "remEndList"};

        FileWriter writer = new FileWriter("HW0TimeComparisons.csv");
        writer.append("n, 1, 10, 100, 1k, 10k, 100k, 1m, 10m, 100m \n");
        for (int i = 0; i < 8; i++) {
            writer.append(nameArray[i]);
            writer.append(",");
            for (long time : dataArray[i]) {
                writer.append(Long.toString(time));
                writer.append(",");
            }
            writer.append("\n");
        }

        writer.close();
    }

}
