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

#### Sigmoid Function
A sigmoid function is a mathematical function having an "S" shaped curve (sigmoid curve).

#### Backpropagation
Backpropagation, an abbreviation for "backward propagation of errors", is a common method of training artificial neural networks used in conjunction with an optimization method such as gradient descent. It calculates the gradient of a loss function with respect to all the weights in the network, so that the gradient is fed to the optimization method which in turn uses it to update the weights, in an attempt to minimize the loss function.

Backpropagation requires a known, desired output for each input value in order to calculate the loss function gradient. It is a generalization of the delta rule to multi-layered feedforward networks, made possible by using the chain rule to iteratively compute gradients for each layer. Backpropagation requires that the activation function used by the artificial neurons (or "nodes") be differentiable.

#### Restriction Bias
The restriction bias tells you something about the representational power of the data structure you are using and the set of hypotheses that you are willing to consider. Neural networks can represent boolean, continuous, and arbitrary functions. The complexity of a network 

#### Preference Bias
The preference bias tells you something about the algorithm that tells you why the algorithm prefers one representation over another. For neural networks, if the weights get really big, that could lead to overfitting because it lets you represent arbitrary complex functions. Neural networks implement a kind of bias that prefer simpler explanations. This is reminiscent of Occam's Razor.
