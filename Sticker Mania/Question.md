Once a week a sticker card seller visits Wycherley International primary school. Skailey and Shailey collect money throughout the week, from the pocket money they get from parents. They buy two sticker cards every week. Shailey never buys the same sticker card that Skailey does. The only other rule they have is that they spend all the money they collected during the week. Given a list of prices for the different sticker cards, select the two that will cost all the money they have.

Input Format

The first line contains an integer, w, denoting the number of weeks they bought sticker cards. The next sets of lines each describe information related to a particular week. Each week is described as follows:

The integer m, the amount of money they have collected during the week.
The integer n, the number of sticker card types offered at the time.
n space-separated integers denoting the cost of each sticker card type: cost1, cost2, …, costn.
Constraints

The (index + 1) within the cost array represents the type of sticker card in which the cost is given in the element. (i.e. 1, 2, …, n).
1 <= w <= 5
2 <= m <= 10
2 <= n <= 10
1 <= cost[i] <= 10; ∀ i ∈ [1, n]
There should be only one option they can buy by selecting from the available card types in a particular week.
Output Format

For each week, print two space-separated integers denoting the types of the two sticker cards purchased, in ascending order.
If there is no any pair of cards to buy output 0.
If input is wrong in any case, output –1.