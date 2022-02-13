import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String password = reader.readLine();
        String encoded = reader.readLine();
        String copy = encoded.replaceAll(password, "");
        System.out.println((int) (encoded.length() - copy.length()) / password.length());
    }
}