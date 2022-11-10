# Stacks and Queues:

## Stacks by using LinkedList in java

file name: StackOfStrings.java
Time complexity : In this implementation every operation (push/pop) takes constant time in the worst case as in push
operation we are adding new node at the start of a linked list and in pop operation we are returning value of 1st node
and deleting that node by unlinking from out linked-list.
Space complexity : In java for inner class every object there is 16 bytes of overhead, extra 8 bytes overhead as we are
using ListNode inner class. there is two references in out code, one is for string val and another is for Node next,
which take 8 bytes each. so 40 bytes are needed for a stack.

## Stacks by using array in java

In this approach time and space needed by the algorithm to implement a stack is more resultant this operation will be
too expensive as in we are going to resize the array by twice the length of previous array which is full and will copy
all the elements from older array to newer one. for each resizing operation it will take N time and for each push and
pop
operation algo will take constant time.

## Queues by using LinkedList in java

In QueueOfStringsLL.java, I have implemented Queues by using linked-list. where I have enqueued the queue at the front
of
the linkedlist and performed dequeued operation at the end of the linked-list. so for enqueuing operation algo takes
constant time whereas for dequeue operation linear time is required.

# Generics

In above implementations we have explicitly designed an algorithm for a strings only but if we want to implement the
same
stack for url or something else then we would be copying and pasting the code by changing the type from string to
others.

which is not the good approach as it could result in lengthy and error-prone code. to avoid that we are using type
casting, although type casting is also not good in programming, but it solves the problem.

As type casting is not good enough, there is a better way to solve this. By using generic type.

I have implemented the generic type casting for stack implementation.

file name: StackGeneric.java
compile cmd: javac -Xlint:unchecked StackGeneric.java
run : java StackGeneric

# Perfomred Queue by using two stacks

File Name: StackFIFO.java

# Performed Queue by using singly LinkedList

File Name: StackWithMax.java

In this program, regular pushing operation will happen and if pop operation command receive then program will print
largest/maximum number out of the stack.
