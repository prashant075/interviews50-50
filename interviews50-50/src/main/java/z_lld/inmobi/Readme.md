=================================  Design a Sport Tournament =================================


Functional requirements
============================

1. Tournament will be played wtih a fixed number of teams.
2. Each Team will have fixed desginated players (playing squad) and a home ground.
3. A Match will play against two teams in a Venue (the venue should be chosen from the home grounds of the playing teams).
4. Points Table will be updated after every Match.
5. Win or loose will be decided based on a random variable.
6. Tournament rules will be applicable for deciding semis and finals.
7. Each team should play at least 2 matches against all the other teams.
8. A winner would be the team winning the final.
9. if the teams have equal points the tie will be resolved based on the result from their head-head clash. If the tie still holds, decide by Toss.


Non-Functional requirements
============================

1. OOPs design and priniciples should be followed for creating the solution.
2. Time and Space complexity should be optimized.

Objective
============

Run the program should generate following results:
1. Fixtures
2. Result against each Fixture
3. Points Table
4. Semifinal qualifies teams
5. Final qualified teams
6. Winner


/*
User (Basic Entity)
AdminUser extends User 
(
createTournent();
AddTeamsToTournent();
createMatchesBetweenTeam();
UpdatePointTablesforTournent();
)

Player( )
Team()
Match( 2 teams)
Venue()
Tournament(teams, match, venue)
PointTable()
Score()



*/