Assignment 3: Sorting and Searching Algorithm Analysis System

Project Overview
In this project I implemented and compared several algorithms in Java.
I chose Bubble Sort, Merge Sort and Binary Search.
The main goal was to see how fast they work on different array sizes and understand the difference
between them in practice.

Algorithms

Bubble Sort
This algorithm goes through the array and compares two neighboring elements.
If they are in the wrong order, it swaps them.
This process repeats many times.
Time complexity: O(n²)

Merge Sort
Merge Sort works using divide and conquer.
It splits the array into smaller parts until there is only one element in each part.
Then it combines them back in sorted order.
Time complexity: O(n log n)

Binary Search
Binary Search works only with sorted arrays.
It looks at the middle element and decides whether to go left or right.
Each step removes half of the array.
Time complexity: O(log n)

Experimental Results

Array Size | Input Type | Bubble Sort | Merge Sort | Binary Search
10         | Random     | 16400 ns    | 23600 ns   | -
10         | Sorted     | 6700 ns     | 15600 ns   | 11900 ns
100        | Random     | 507800 ns   | 125300 ns  | -
100        | Sorted     | 205400 ns   | 92900 ns   | 1600 ns
1000       | Random     | 6865700 ns  | 986400 ns  | -
1000       | Sorted     | 1944200 ns  |  333700 ns | 3000 ns

Analysis
From the results, for small arrays the difference is not very big.
But when the size increases, Bubble Sort becomes much slower.
Merge Sort works faster on large arrays because it splits the problem into smaller parts.

Binary Search is very fast because it reduces the search space by half each time.
It only works with sorted arrays.

Screenshots
![Program Output](docs/screenshots/output.png)

Reflection
In this project I understood how algorithms work not only in theory but also in practice.
I saw that Merge Sort is much better for large data compared to Bubble Sort.
The most difficult part was understanding how Merge Sort works.
After testing it became clearer why it is more efficient.