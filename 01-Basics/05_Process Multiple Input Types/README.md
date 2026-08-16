# 05. Process Multiple Input Types

## Problem Overview

Read and process three different types of input: a string, an integer, and a floating-point number. Display the string and integer without modification, then print the floor value of the floating-point number as an integer.

## Approach

Read each input using the appropriate data type. Print the string and integer directly, then use `Math.floor()` to obtain the largest integer less than or equal to the floating-point value before printing it.

## Time Complexity

**O(n)**

## Space Complexity

**O(n)**

## Key Learning Points

- Reading different data types using `Scanner`.
- Using `nextLine()`, `nextInt()`, and `nextFloat()` appropriately.
- Converting floating-point values to integers using `Math.floor()`.
- Working with mixed input and output operations in a single program.
