A student in a secondary school always makes mistakes when writing notes. This student is asked to write the notes while the teacher reads the note. The student sometimes repeats some of the words, introduces some words or skips some words from the sentences the teacher read. All the words in the sentence are case sensitive and the student must follow the correct spelling and correct punctuation marks same as the teacher’s note. Given the words in the teacher's note and the words in the student’s note, print Yes if the student has written the same note as teacher’s note; otherwise, print No.

Input Format

The first line contains two space-separated integers, m and n, the numbers of words in the teacher’s note and the student’s note.
The second line contains m space-separated strings, each teacher_note[i].
The third line contains n space-separated strings, each student_note[i].
Constraints

Each word consists of English alphabetic letters (a to z and A to B).
1 <= m,n <= 30
Output Format

Print Yes if the student can write the note as same as teacher’s note. Otherwise, print No.
Sample Input 0

6 6
Providing the latest information on time
Providing the Latest information on time
Sample Output 0

No
Explanation 0

The student note has all the right words, but there's a case mismatch.