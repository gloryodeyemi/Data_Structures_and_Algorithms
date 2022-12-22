# Data Structures and Algorithms
This is a repository that contains information about data structures and algorithms in Java.

### Definition of terms
1. **Data Structure:** A data structure is a storage that is used to store and organize data. It is a way of arranging data on a computer so that it can be accessed and updated efficiently.
2. **Algorithms:** An algorithm is a procedure used for solving a problem or performing a computation. Algorithms act as an exact list of instructions that conduct specified actions step by step in either hardware- or software-based routines.
3. **Time Complexity:** Time complexity refers to the amount of time an algorithm takes to run when the input tends towards a specific or limiting value. It calculates the time taken to execute each code statement in an algorithm.
4. **Big-O Notation:** Big O Notation is a tool used to describe the time complexity of algorithms. It calculates the time taken to run an algorithm as the input grows. In other words, it calculates the worst-case time complexity of an algorithm. Big O Notation in Data Structure describes the upper bound of an algorithm's runtime. It calculates the time and amount of memory needed to execute the algorithm for an input value. 
    
    Examples of Big-O Notations includes;
    
    | Big-O    | Names    |
    | -------- | -------- |
    | O(1)     | Constant |
    | O(logn)  | Logarithmic |
    | O(n)     | Linear |
    | O(nlogn) | n log-star n |
    | O(n^2)   | Quadratic |
    
### Types of Data Structures
1. **Array:** An array is a linear data structure that collects elements of the same data type and stores them in contiguous and adjacent memory locations. Arrays work on an index system starting from 0 to (n-1), where n is the size of the array.
    
    Sample Array initialization
    
          int[] intArray = new int[n];
    
          // int = integer data type
    
          // n = number of items in the array
          
    The Big-O values for Array operations includes;
    
    | Operation | Time complexity |
    | --------- | --------------- |
    | Retrieve with index     | O(1) - Constant time|
    | Retrieve without index  | O(n) - Linear time |
    | Add an element to a full array | O(n) |
    | Add an element to the end of an array with space | O(1) |
    | Insert or update an element at a specific index | O(1) |
    | Delete an element by setting it to null | O(1) |
    | Delete an element by shifting elements | O(n) |

### Sort Algorithms
1. **Bubble Sort:**


### References
1. [Udemy online course](https://www.udemy.com/course/data-structures-and-algorithms-deep-dive-using-java/learn/lecture/8435752#overview)
2. [Data Structure definition](https://www.geeksforgeeks.org/data-structures/)
3. [Algorithms definition](https://www.techtarget.com/whatis/definition/algorithm#:~:text=An%20algorithm%20is%20a%20procedure,throughout%20all%20areas%20of%20IT.)
4. [Time Complexity & Big-O Notation](https://www.simplilearn.com/big-o-notation-in-data-structure-article)
5. [Array definition](https://www.simplilearn.com/tutorials/data-structure-tutorial/arrays-in-data-structure)
