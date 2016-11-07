## Supervised Learning
Supervised learning is the machine learning task of inferring a function from labeled training data. 

## Decision Trees
A decision tree is a set of rules used to classify data into categories. It looks at the variables in a data set, determines which are most important, and then comes up with a tree of decisions which best partitions the data.

#### ID3 Algorithm
In decision tree learning, ID3 (Iterative Dichotomiser 3) is an algorithm used to generate a decision tree from a dataset. The ID3 algorithm begins with the original set S as the root node. On each iteration of the algorithm, it iterates through every unused attribute of the set S and calculates the entropy H(S) (or information gain IG(S)) of that attribute. It then selects the attribute which has the smallest entropy (or largest information gain) value. The set S is then split by the selected attribute (e.g. age is less than 50, age is between 50 and 100, age is greater than 100) to produce subsets of the data. The algorithm continues to recurse on each subset, considering only attributes never selected before.
Recursion on a subset may stop in one of these cases:

+ every element in the subset belongs to the same class (+ or -), then the node is turned into a leaf and labelled with the class of the examples
+ there are no more attributes to be selected, but the examples still do not belong to the same class (some are + and some are -), then the node is turned into a leaf and labelled with the most common class of the examples in the subset
+ there are no examples in the subset, this happens when no example in the parent set was found to be matching a specific value of the selected attribute, for example if there was no example with age >= 100. Then a leaf is created, and labelled with the most common class of the examples in the parent set.

Throughout the algorithm, the decision tree is constructed with each non-terminal node representing the selected attribute on which the data was split, and terminal nodes representing the class label of the final subset of this branch.

Summary
+ Calculate the entropy of every attribute using the data set S
+ Split the set S into subsets using the attribute for which entropy is minimum (or, equivalently, information gain is maximum)
+ Make a decision tree node containing that attribute
+ Recurse on subsets using remaining attributes.

## Regression
