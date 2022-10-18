# Algorithms-in-JAVA
This is the course on algorithms in java by princeton university by "Proff Robert Sedgewick" and "Proff Kevin Wayne". This course covers essential info that every serious programmer needs to know about algorithms and data structures.

Week 1: 

Solving Dynamic Connectivity Problem in which we have to find there is a connected path or not for an object.

Implementing below Algorithms to solve this problem:
    1. Quick Find
    2. Quick Union
    
In week 1 assignment 0, there is a jar file which needs to be extracted. to extract files just run "jar xf jarfilename" command in terminal.
    
Quick find is too slow for huge problems so we have alternative to it is Quick union, which is kind of lazy approach.
Quick union is faster than quick find algo but it could be too slow and expensive. In this approach while performing union approach, we are changing the root of by another element's root unlike quick find. In quick find we were keeping value of that perticular element same as another element with whom we wanted to connect.
To solve dynamic connectivity problem in more efficient way is "Weighted Quick Union". which is less expensive and it does not make taller trees like other two approaces.
