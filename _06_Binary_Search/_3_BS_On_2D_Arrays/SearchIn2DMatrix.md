## [LeetCode 74] Search a 2D Matrix

## Problem Statement

You are given an `m x n` integer matrix `matrix` with the following properties:

1. Each row is sorted in non-decreasing order.
2. The first integer of each row is greater than the last integer of the previous row.

Given an integer `target`, return `true` if `target` is present in the matrix, otherwise return `false`.

---

## Examples

### Example 1:

**Input:**

```
matrix = [
  [1, 3, 5, 7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
target = 3
```

**Output:**

```
true
```

---

### Example 2:

**Input:**

```
matrix = [
  [1, 3, 5, 7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
target = 13
```

**Output:**

```
false
```

---

### Example 3:

**Input:**

```
matrix = [[1]]
target = 1
```

**Output:**

```
true
```

---

## Constraints

* `1 <= m, n <= 100`
* `-10^4 <= matrix[i][j], target <= 10^4`

---

⚡ This is a **Binary Search in 2D** problem — treat the matrix as a flattened sorted array.

---