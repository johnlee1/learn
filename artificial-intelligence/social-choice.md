## Social Choice
A mathematical theory that deals with aggregation of individual preferences.

#### Voting Rules
+ voting rule = function from preference profiles to alternatives that specifies the winner of the election
+ plurality
    + each voter awards one point to top alternative
    + alternative with most points win
    + used in almost all political elections
+ borda count
    + each voter awards m-k points to altnerative ranked k'th
    + alternative with most points wins
+ x beats y in a pairwise election if the majority of voters prefer x to y
+ plurality with runoff
    + first round: two alternatives with highest plurality scores survive
    + second round: pairwise election between tehse two alternatives
+ single transferable vote (stv)
    + m-1 rounds
    + in each round, alternative with least plurality votes is eliminated 
    + alternative left standing is the winner

#### Condorcet Winner
+ condorcet winner beats every other alternative in pairwise election
+ condorcet paradox = cycle in majority preferences

#### Condorcet Consistency
+ condorcet consistency = select a condorcet winner if one exists

#### Voting Rules that satisfy Condorcet Criterion
+ copeland: alternative's score is number of alternatives it beats in pairwise election 
+ dogson's rule
    + dogson score of x = the number of swaps between adjacent alternatives needed to make x a condorcet winner
    + dogson's rule: select alternative that minimizes dogson score

#### Condorcet's Noise Model
+ true ranking of the alternatives
+ voting pairwise on alternatives, each comparison is correct with probability 
