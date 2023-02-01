Had a total of 70 minutes to solve 4 questions. Questions were in range of Easy Medium and Medium Hard range.

Q1. Find the sum of Maximum SubArray [https://leetcode.com/problems/maximum-subarray/]
Q2. Question was about solving a Chess Tournament

Chess Tournament
There are n participants numbered 1 to n where ith participant has the potential denoted by potential[i]. The potential of each player is distinct. Initially, all players stand in queue in order from the 1st to nth player in each game, the first 2 participant of the queue compete and the participant with a higher potential wins the game. After each game, the winner remains at the beginning of the queue and plays with the next person from the queue and the losing player goes to the end of the queue. The game continues until a player wins k consecutive games.

Given the potential of the participants and the deciding factor k, find the potential of the winning player.
Example
Consider n = 4, participants have potential [3,2,1,4] and k = 2

Initial position of participants [1,2,3,4]
Participants 1 and 2 compete, Their potentials are 3 and 2. Player 1 wins due to the higher potential. Player 1 stays at the front of qyeye and player 2 moves to the back, now their positions are [1,3,4,2]
Participants 1 and 3 compete. Their potentials are 3 and 1. 1 wins second consecutive game. Since k = 2, player has won enough games
Return player 1s potential, 3

solve for getPotentialOfWinner(int[] potential, int k)

Q3. Visiting Cities

There are a number of cities in a row, and there are two bus lines that go between them. They both visit all cities in order, but one may take longer than the other to go between any two cities. Starting on or moving to the Blue line takes a certain amount of extra time. There is not extra time required to start on or move to the Red Line. Determine the minimum cost to move from the first city to each of the cities.

Example:
red = [2,3,4]
blue = [3,1,1]
blueCost = 2

There are 4 cities numbered 0 through 3. Times from city 0 to cities 1,2 and 3 are at indices 0,1, and 2 respectively in the red and blue arrays. Through the explanation, an answer array, ans will be created.

The minimum cost o go from city 0 to itself is 0. Now ans = [0]
The time from city 0 to city 1 is
2 on the Red
3 + blueCost = 5 on Blue
The blueCost applies when you start on the Blue
The min time to city 1 is 2 on the Red so ans is [0,2]
Continuing to city 2:
stay on the red line, arriving at 2+3 = 5
switch to the blue line and arrive at 2 +1 + 2 = 5
the bluecost applies when you switch to the Blue line
in this case, you arrive at time 5 regardless of the carrier on the second leg, now ans = [0,2,5]
to get to city 3:
take the red line, arriving at 5+4 = 9
stay on the blue line arriving at 5 + 1 = 6
the blueCost does not apply if stay on the Blue or move to the red line
the final ans array is [0,2,5,6]
Solve the following:

public static List<long> minCost(List<Integer> red, List<Integer> blue, int blueCost)

Q4: Fourth question was about creating a team using the initial letters of the subjects

Given a string constisting of p, c, m, b and z. Each char represent a particular one skill of student. Given a list of student's skills find the no of teams that can be formed such that each team has 5 students and each student in team has should have different skill. A student can be only one team.
Eg - pcmpcbmz
no of teams possible - 1

[https://github.com/mkprj5/HackerRank/blob/master/Level Challange/ThePerfectTeam.java]