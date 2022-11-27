# Algorithms-in-JAVA

This is the course on algorithms in java by princeton university by "Proff Robert Sedgewick" and "Proff Kevin Wayne".
This course covers essential info that every serious programmer needs to know about algorithms and data structures.

In week 1 assignment 0, there is a jar file which needs to be extracted. to extract files just run "jar xf jarfilename"
command in terminal.

# Week 1

Solving Dynamic Connectivity Problem in which we have to find there is a connected path or not for an object.

Implementing below Algorithms to solve this problem:

1. Quick Find
2. Quick Union
3. Weighted Quick Union
4. Quick Union with Path compression

Quick find is too slow for huge problems, so we have alternative to it is Quick union, which is kind of lazy approach.
Quick union is faster than quick find algo, but it could be too slow and expensive. In this approach while performing
union operation, we are changing the root by another element's root unlike quick find. In quick find we were keeping
value of that particular element same as another element with whom we wanted to connect.
To solve dynamic connectivity problem in more efficient way, we have "Weighted Quick Union" approach. which is less
expensive, and it does not make taller trees like Quick Union.

Both Quick Find and Quick Union algorithms are easy to implement but simply does not support huge dynamic connectivity
problems.

Improvement to Quick Union algo:

1. Weighted Quick Union is one of the improvements in Quick Union algorithm to avoid tall trees. In this algorithm while
   performing
   union operation algorithm first checks the height of the trees where those two elements located and connect the
   smaller
   tree to the larger tree accordingly.
   e.g: if union(x,y)
   algorithm will check the trees in which these x and y element located. if height of the tree of x has height less
   than y's tree then tree of x will be connected to the root of y's tree.
2. Weighted Quick Union with Path Compression. this algo makes it possible to solve problems that could not otherwise be
   treated.

Time complexity analysis:

to perform x number of union and find operations Quick-find algo takes x secs.
so for large problems for example for 10^9 unions and finds operations with 10^9 objects, machine takes 30 years to
solve. same problem could be solved in 3 sec if we use the "Weighted Quick Union Path Compression" algorithm.

# Analysis of Algorithm:

Some Algorithmic success:

1. Discrete Fourier Transform:
   with brute force it algo needs n^2 steps and by using Fast Fourier Transform algo problem will be solved in N*logN
   time.
2. N body simulation problem:
   Brute force N^2 --> Barnes Hut algorithm Nlog(N)

Scientific method for analysis of algorithm:

1. Observe feature
2. Hypothesize model
3. Predict events
4. Verify prediction
5. validate by repeat until hypothesis and observation agrees

Commonly used notations in the theory of algorithms:

1. Big theta : classify algorithms
2. Big Oh : Worst case : Upper bound
3. Big Omega : Easy case : Lower bound

