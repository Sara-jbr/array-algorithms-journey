# array-algorithms-journey

I’m currently working on a complete learning journey through array algorithms, progressing from basic to advanced levels.
The project is structured into three parts:

Basic Level: To understand array operations and implement fundamental algorithms.

Intermediate Level: To explore searching, sorting, and problem-solving patterns.

Advanced Level: To tackle optimization, dynamic programming, and complex array manipulation.

---

## 🔷 Array Definition
An array is a data structure that allows you to store multiple values of the same type in a single variable.

Arrays store data contiguously in memory.

Each element is accessed using an index.

Array indexing starts from 0.

##  Main Features of Arrays

| Feature              | Description                                                                 |
|----------------------|-----------------------------------------------------------------------------|
| Same Data Type       | Only values of the same type (e.g., `int`, `String`) can be stored          |
| Zero-Based Indexing  | The first element starts at index `0`                                       |
| Contiguous Memory    | Elements are stored one after another in memory, allowing fast access       |
| Fixed Length         | In most languages (Java, C, C++), the size is fixed once defined            |

##  General Array Structure in Java

```java
// Defining an array
int[] numbers = new int[5]; // Array with 5 integers (default value is 0)

// Assigning values
numbers[0] = 10;
numbers[1] = 20;

// Defining with initial values
int[] ages = {18, 25, 30, 40};
```
##  Types of Arrays

###  1. One-Dimensional Array
A simple list of values.

```java
String[] fruits = {"Apple", "Banana", "Orange"};
System.out.println(fruits[1]); // Banana
```
 Real-world uses: list of names, prices, scores, phone numbers

### 2. Two-Dimensional Array
A table-like structure with rows and columns.

```java
int[][] matrix = {
{1, 2, 3},
{4, 5, 6}
};

System.out.println(matrix[1][2]); // 6
```

 Real-world uses:

Student grade tables

Pixel visualization

Game map grids

### 3. Multidimensional Array
An array of 2D arrays or more.

```java
int[][][] cube = new int[2][2][2];
```

 Real-world uses:

3D imaging

Modeling complex data like weather (time × location × temperature)

### 4. Dynamic Array
In Java, a dynamic array can be implemented using ArrayList.

```java
ArrayList<String> names = new ArrayList<>();
names.add("Sara");
names.add("Ali");
System.out.println(names.size()); // 2
```

 Real-world uses:

Shopping cart

WhatsApp messages

Mobile contact list

##  Key Points About Arrays

| Point                      | Description                                                                 |
|---------------------------|-----------------------------------------------------------------------------|
| Fixed Length              | Array size cannot be changed after creation                                |
| Default Values            | `0` for `int`, `null` for objects, `false` for `boolean`                   |
| Out-of-Bounds Access Error| Accessing index out of range causes an error (e.g., `arr[10]` in 5-element array) |
| Loops for Traversal       | Commonly accessed using `for` or `foreach` loops                           |

---
## Algorithm Efficiency Guide

### Time Complexity (How fast an algorithm runs)

- **O(1) — Constant Time:**  
  The operation takes the same time regardless of input size (e.g., accessing an element by index in an array).

- **O(n) — Linear Time:**  
  Time grows linearly with input size (e.g., traversing an array).

- **O(log n) — Logarithmic Time:**  
  Time grows slowly, typically with divide-and-conquer (e.g., binary search).

- **O(n²) — Quadratic Time:**  
  Time grows proportional to the square of the input size (e.g., bubble sort).

###  Space Complexity (How much extra memory an algorithm uses)

- **O(1) — Constant Space:**  
  Uses a fixed amount of memory regardless of input size (e.g., swapping elements in-place).

- **O(n) — Linear Space:**  
  Uses memory proportional to input size (e.g., creating a new array to store results).

---

**Remember:**  
Lower time and space complexity means better efficiency.  
Choosing the right algorithm depends on the problem and constraints.

---

## Traversing Arrays with Loops

```java
int[] numbers = {10, 20, 30, 40};

// Using a traditional for loop
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}

// Using a foreach loop
for (int num : numbers) {
    System.out.println(num);
}
```
## Common Array Operations

| Operation        | Example                                   |
|------------------|-------------------------------------------|
| Initialization   | `int[] nums = {1, 2, 3};`                 |
| Access Element   | `nums[0]`                                 |
| Modify Value     | `nums[1] = 10;`                           |
| Length           | `nums.length`                             |
| Traversal        | `for (int i = 0; i < nums.length; i++)`   |
| Sorting          | `Arrays.sort(nums);`                      |
