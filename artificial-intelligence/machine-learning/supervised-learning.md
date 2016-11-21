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

## Support Vector Machines
A Support Vector Machine (SVM) is a classifier formally defined by a separating hyperplane. In other words, given labeled training data, the algorithm outputs an optimal hyperplane which categorizes new examples.

## Neural Networks
Neural Networks are a computational approach which is based on a large collection of neural units loosely modeling the way the brain solves problems with large clusters of biological neurons connected by axons. Each neural unit is connected with many others, and links can be enforcing or inhibitory in their effect on the activation state of connected neural units. Each individual neural unit may have a summation function which combines the values of all its inputs together. There may be a threshold function or limiting function on each connection and on the unit itself such that it must surpass it before it can propagate to other neurons. These systems are self-learning and trained rather than explicitly programmed and excel in areas where the solution or feature detection is difficult to express in a traditional computer program.

#### Perceptron Rule (thresholded)
The perceptron is an algorithm for supervised learning of binary classifiers (functions that can decide whether an input, represented by a vector of numbers, belongs to some specific class or not). It is a type of linear classifier, i.e. a classification algorithm that makes its predictions based on a linear predictor function combining a set of weights with the feature vector. It guarantees finite convergence in the case of linear separability. 
 
#### Gradient Descent (unthresholded)
Gradient descent is a first-order iterative optimization algorithm. It is more robust in cases that do not have linear separability. Converges to local optimum.

#### Backpropagation
Backpropagation, an abbreviation for "backward propagation of errors", is a common method of training artificial neural networks used in conjunction with an optimization method such as gradient descent. It calculates the gradient of a loss function with respect to all the weights in the network, so that the gradient is fed to the optimization method which in turn uses it to update the weights, in an attempt to minimize the loss function.

Backpropagation requires a known, desired output for each input value in order to calculate the loss function gradient. It is a generalization of the delta rule to multi-layered feedforward networks, made possible by using the chain rule to iteratively compute gradients for each layer. Backpropagation requires that the activation function used by the artificial neurons (or "nodes") be differentiable.

#### Restriction Bias
The restriction bias tells you something about the representational power of the data structure you are using and the set of hypotheses that you are willing to consider. Neural networks can represent boolean, continuous, and arbitrary functions. The complexity of a network 

#### Preference Bias
The preference bias tells you something about the algorithm that tells you why the algorithm prefers one representation over another. For neural networks, if the weights get really big, that could lead to overfitting because it lets you represent arbitrary complex functions. Neural networks implement a kind of bias that prefer simpler explanations. This is reminiscent of Occam's Razor.

## Instance-based Learning
Instance-based learning is a family of learning algorithms that, instead of performing explicit generalization, compares new problem instances with instances seen in training, which have been stored in memory.

#### K-Nearest Neighbors
The k-Nearest Neighbors algorithm (or k-NN for short) is a non-parametric method used for classification and regression. In both cases, the input consists of the k closest training examples in the feature space. The output depends on whether k-NN is used for classification or regression:

+ In k-NN classification, the output is a class membership. An object is classified by a majority vote of its neighbors, with the object being assigned to the class most common among its k nearest neighbors (k is a positive integer, typically small). If k = 1, then the object is simply assigned to the class of that single nearest neighbor.
+ In k-NN regression, the output is the property value for the object. This value is the average of the values of its k nearest neighbors.

#### Preference Bias
+ locality: near points are similar 
+ smoothness: by choosing to average and by choosing to look at points that are similar to one another we are expecting functions to behave smoothly
+ all features matter equally

#### Curse of Dimensionality
As the number of features or dimensions grows, the amount of data we need to generalize accurately also grows exponentially.

## Computational Learning Theory
In computer science, computational learning theory (or just learning theory) is a subfield of Artificial Intelligence devoted to studying the design and analysis of machine learning algorithms. It has three important components:
+ defining learning components
+ showing specific algorithms work
+ show these problems are fundamentally hard

#### Computational Complexity
How much computational effort needed for a learner to conver to the answer

#### Sample Complexity
In the case of a batch (we have a training set we can look at all at once), sample complexity is how many training examples are needed for a learner to create a successful hypothesis.

#### Mistake Bounds
In an online setting (data becomes available in a sequential order and is used to update our best predictor for future data at each step), mistake bounds is how many misclassifications can a learner make over an infinite run.

#### PAC Learning
In computational learning theory, probably approximately correct learning (PAC learning) is a framework for mathematical analysis of machine learning. In this framework, the learner receives samples and must select a generalization function (called the hypothesis) from a certain class of possible functions. The goal is that, with high probability (the "probably" part), the selected function will have low generalization error (the "approximately correct" part). The learner must be able to learn the concept given any arbitrary approximation ratio, probability of success, or distribution of the samples.

An important innovation of the PAC framework is the introduction of computational complexity theory concepts to machine learning. In particular, the learner is expected to find efficient functions (time and space requirements bounded to a polynomial of the example size), and the learner itself must implement an efficient procedure (requiring an example count bounded to a polynomial of the concept size, modified by the approximation and likelihood bounds).

## VC Dimensions
In statistical learning theory and computational learning theory, the VC dimension (for Vapnik–Chervonenkis dimension) is a measure of the capacity (complexity, expressive power, richness, or flexibility) of a space of functions that can be learned by a statistical classification algorithm. It is defined as the cardinality of the largest set of points that the algorithm can shatter (label in all possible ways). In other words, it is the size of the largest set of inputs that the hypothesis class can shatter. 
