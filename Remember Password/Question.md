A commercial bank allows users to create their own passwords for online banking. The users should make a password with exactly 8 characters. Once the user inputs the password, the password preprocessing system will process that password into a complex string, where the original password is included n times in the generated string. The number of occurrences of the given password in the String will be then given to the user by the system, which can be used as one option for resetting the password when required.

Input Format

First line consists of the given password, pwd.
Second line consists of the generated string by the password preprocessing system, str.
Constraints

pwd.length() == 8
str.length() <= 100
0 < n < 10
Output Format

An integer for n, which is the number of occurrences of the password in the generated string.
Sample Input 0

hbd22391
akl9hbd2239149321khbd22391ophbd22391cddkshbd22391
Sample Output 0

4
Explanation 0

In the generated string; akl9hbd2239149321khbd22391ophbd22391cddkshbd22391 contains the given password hbd22391, 4 times.
