Given two arrays containing letters A-Z, find which letters in the second array are missing from the first array. If a letter occurs multiple times in the arrays, you must ensure that the frequency of that letter in both arrays is the same. If that is not the case, then it is also a missing letter. Return the missing letters sorted according to alphabetical order. Only include a missing letter once in the sorted array, even if it is missing multiple times.

Input Format

All input letters will be capital letters.
There will be four lines of input: First line of input is an integer for n, which is the size of the first array (arr1). Second line of input contains n number of space-separated lettersfor arr1. Third line of input is an integer for m, which is the size of the second array (arr2). Fourth line of input contains m number of space-separated letters for arr2.
Constraints

n <= m
1 <= m,n <= 20
Output Format

Space-separated letterswhich are missing from arr1.
If no letters are missing, output “None”.
If input constraints failed, output –1.
Sample Input 0

6
D X E R E R
8
D X E T P R E R
Sample Output 0

P T
Explanation 0

the array with missing letters: arr1 = [D, X, E, R, E, R]
the original array of letters:arr2 = [D, X, E, T, P, R, E, R]
The letter(s) missing is/are:[P, T]