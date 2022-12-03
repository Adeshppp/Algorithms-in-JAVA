# Week 2

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

# Elementary Sort

To sort data irrespective of their data type, we have to write one program. which is possible by using mechanism
callback.

callback = reference to executable code

we are going to implement callbacks by using interfaces. In JAVA, there is built in Comparable interface available.
which has compareTo() in it. which takes object as an argument and compare with this object and returns 1(greater), -1 (
lesser) and 0(==) depends on the result of comparison. compareTo() method has no dependence on file data type. Data type
handled by comparable interface.

built-in comparable types: Integer, Double, String, Date, File
User-defined comparable types : Implement the Comparable interface.

## Implementation of Comparable interface to sort generic data types:

when any class implements comparable interface then that class must inherit the compareTo() in it and accordingly we can
define the behaviour of that compareTo() method.

File name: SongSorter

in this example, that compareTo() method is getting called by sort method internally.

## Elementary sorting methods

1. Selection Sort
2. Insertion Sort
3. Shell Sort
4. Shuffling
5. Convex hull

## Sort any type of data.

1. Sort random real number in ascending order.
   file name: SortExp.java
   compile cmd : javac-algo4 SortExp.java
   run cmd: java-algo4 SortExp 10

2. Sort strings from file in alphabetical order.
   file name: StringSort.java
   compile cmd : javac-algo4 StringSort.java
   run cmd: java-algo4 StringSort

3. Sort files in alphabetical order.
   file name: FileSorter.java
   compile cmd : javac-algo4 FileSorter.java
   run cmd: java-algo4 FileSorter "file_path or ."

   generic typed comparable implementation example : Date class in java.util package.

## Selection Sort

1. In iteration i, find index min of smallest remaining entry.
2. Swap a[i] and a[min]
3. Repeat until i reaches to the end of an array.

file name: SelectionSort.java // Integer type
file name: Selection.java // generic type

time complexity : O(n^2) // nested for loop
space complexity : O(1) // only used two extra variables, one for swapping purpose and one for keeping track of smallest
in unsorted array.

## insertion sort

best ase time complexity : linear
worse case time complxity : quadratic time

## Shell Sort

Shell sort is a variation of insertion sort.In insertion sort, we move elements only one position ahead. When an element
has to be moved far ahead, many movements are involved. The idea of ShellSort is to allow the exchange of far items. In
Shell sort, we make the array h-sorted for a large value of h. We keep reducing the value of h until it becomes 1. An
array is said to be h-sorted if all sublists of every h’th element are sorted.

Worst case number of compares used by shell-sort with 3x+1 increments is O(N^3/2).

