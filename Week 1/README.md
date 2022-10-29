# Algorithms-in-JAVA

This is the course on algorithms in java by princeton university by "Proff Robert Sedgewick" and "Proff Kevin Wayne".
This course covers essential info that every serious programmer needs to know about algorithms and data structures.

In week 1 assignment 0, there is a jar file which needs to be extracted. to extract files just run "jar xf jarfilename"
command in terminal.

Solving Dynamic Connectivity Problem in which we have to find there is a connected path or not for an object.

Implementing below Algorithms to solve this problem:

1. Quick Find
2. Quick Union
3. Weighted Quick Union
4. Quick Union with Path compression

Quick find is too slow for huge problems so we have alternative to it is Quick union, which is kind of lazy approach.
Quick union is faster than quick find algo but it could be too slow and expensive. In this approach while performing
union operation, we are changing the root by another element's root unlike quick find. In quick find we were keeping
value of that particular element same as another element with whom we wanted to connect.
To solve dynamic connectivity problem in more efficient way, we have "Weighted Quick Union" approach. which is less
expensive and it does not make taller trees like Quick Union.

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
   with brute force it algo needs n^2 steps and by using Fast Fourier Transform algo problem will be solve in N*logN
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

# Stacks and Queues:

## Stacks by using LinkedList in java

file name: StackOfStrings.java
Time complexity : In this implementation every operation (push/pop) takes constant time in the worst case as in push
operation we are adding new node at the start of an linked list and in pop operation we are returning value of 1st node
and deleting that node by unlinking from out linkedlist.
Space complexity : In java for inner class every object there is 16 bytes of overhead, extra 8 bytes overhead as we are
using ListNode inner class. there is two references in out code, one is for string val and another is for Node next,
which take 8 bytes each. so 40 bytes are needed for a stack.

## Stacks by using array in java

In this approach time and space needed by the algorithm to implement a stack is more resultant this operation will be
too expensive as in we are going to resize the array by twice the length of previous array which is full and will copy
all the ements from older array to newer one. for each resizing operation it will take N time and for each push and pop
operation algo will take constant time.

## Queues by using LinkedList in java

In QueueOfStringsLL.java, I have implemented Queues by using linkedlist. where I have enqueued the queue at the front of
the linkedlist and performed dequeued operation at the end of the linkedlist. so for enqueuing operation algo takes
constant time whereas for dequeuing operation linkear time is required. 



