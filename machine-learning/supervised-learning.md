## Supervised Learning
Supervised learning is the machine learning task of inferring a function from labeled training data. 

## Decision Trees
A decision tree is a set of rules used to classify data into categories. It looks at the variables in a data set, determines which are most important, and then comes up with a tree of decisions which best partitions the data.

#### ID3 Algorithm
In decision tree learning, ID3 (Iterative Dichotomiser 3) is an algorithm used to generate a decision tree from a dataset. 
+ Calculate the entropy of every attribute using the data set S
+ Split the set S into subsets using the attribute for which entropy is minimum (or, equivalently, information gain is maximum)
+ Make a decision tree node containing that attribute
+ Recurse on subsets using remaining attributes.

## Regression
Regression is concerned with modelling the relationship between variables that is iteratively refined using a measure of error in the predictions made by the model. Use **cross-validation** to avoid over-fitting.
