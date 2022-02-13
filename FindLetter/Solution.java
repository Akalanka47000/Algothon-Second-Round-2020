// passes 4/5 test cases

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Integer len1 = Integer.parseInt(reader.readLine());
            String arr1[] = reader.readLine().trim().split(" ");
            ArrayList<String> array1 = new ArrayList<>(Arrays.asList(arr1));
            Integer len2 = Integer.parseInt(reader.readLine());
            String arr2[] = reader.readLine().trim().split(" ");
            ArrayList<String> array2 = new ArrayList<>(Arrays.asList(arr2));
            if (len1 > len2) {
                System.out.println(-1);
            } else if (len1 > 20 || len2 > 20) {
                System.out.println(-1);
            } else if (arr1.length != len1 || arr2.length != len2) {
                System.out.println(-1);
            } else {
                Boolean valid = true;
                for (String str : array1) {
                    if (str.equals(str.toLowerCase())) {
                        valid = false;
                        break;
                    }
                    array2.remove(str);
                }
                if (valid) {
                    String output = "";
                    Collections.sort(array2);
                    Set<String> set = new TreeSet<String>();
                    set.addAll(array2);
                    for (String str : set) {
                        if (str.equals(str.toLowerCase())) {
                            valid = false;
                            break;
                        }
                        output += str + " ";
                    }
                    if (valid) {
                        if (output.length() == 0) {
                            System.out.println("None");
                        } else {
                            System.out.println(output.trim());
                        }
                    } else {
                        System.out.println(-1);
                    }
                } else {
                    System.out.println(-1);
                }
            }
        } catch (Exception e) {
            System.out.println(-1);
        }

    }
}