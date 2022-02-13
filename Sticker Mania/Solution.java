import java.io.*;
import java.util.*;

public class Solution {

    static List<List<Integer>> subsets(String[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        int n = nums.length;

        for (int i = (int) Math.pow(2, n); i < (int) Math.pow(2, n + 1); ++i) {

            String bitmask = Integer.toBinaryString(i).substring(1);

            List<Integer> curr = new ArrayList<>();

            for (int j = 0; j < n; ++j) {
                if (bitmask.charAt(j) == '1')
                    curr.add(Integer.parseInt(nums[j]));
            }

            if (curr.size() == 2)
                output.add(curr);
        }
        return output;
    }

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int w = Integer.parseInt(reader.readLine().trim());
            if (w < 1 || w > 5) {
                System.out.println(-1);
                return;
            }
            for (int i = 0; i < w; i++) {
                int m = Integer.parseInt(reader.readLine().trim());
                int n = Integer.parseInt(reader.readLine().trim());
                if (m < 2 || m > 10 || n < 2 || n > 10) {
                    System.out.println(-1);
                    continue;
                }
                String costs[] = reader.readLine().trim().split(" ");
                ArrayList<String> costList = new ArrayList<>(Arrays.asList(costs));
                Boolean invalidCosts = false;
                for (String str : costList) {
                    if (Integer.parseInt(str) < 1 || Integer.parseInt(str) > 10) {
                        invalidCosts = true;
                        break;
                    }
                }
                if (invalidCosts) {
                    System.out.println(-1);
                    continue;
                }
                List<List<Integer>> combos = subsets(costs);
                Boolean found = false;
                List<String> possibilities = new ArrayList();
                for (List<Integer> combo : combos) {
                    if ((combo.get(0) + combo.get(1)) == m) {
                        found = true;
                        List<Integer> types = new ArrayList();
                        types.add(costList.indexOf(String.valueOf(combo.get(0))) + 1);
                        types.add(costList.indexOf(String.valueOf(combo.get(1))) + 1);
                        Collections.sort(types);
                        possibilities.add(types.get(0) + " " + types.get(1));
                    }
                }
                if (!found) {
                    System.out.println(0);
                } else {
                    if (possibilities.size() > 1) {
                        System.out.println(-1);
                    } else {
                        System.out.println(possibilities.get(0));
                    }
                }
            }
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println(-1);
        }
    }
}