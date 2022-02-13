import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstLine[] = reader.readLine().split(" ");
        int teacherCount = Integer.parseInt(firstLine[0]);
        int studentCount = Integer.parseInt(firstLine[1]);
        if (teacherCount != studentCount) {
            System.out.println("No");
        } else {
            String teacherNote[] = reader.readLine().split(" ");
            String studentNote[] = reader.readLine().split(" ");
            Boolean invalid = false;
            for (int i = 0; i < teacherNote.length; i++) {
                if (!teacherNote[i].equals(studentNote[i])) {
                    invalid = true;
                    break;
                }
            }
            if (invalid) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}