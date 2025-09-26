## [LeetCode 1539] Kth Missing Positive Number

## Problem Statement

Given an array `arr` of positive integers sorted in strictly increasing order, and an integer `k`, return the **k-th missing positive integer**.

---

## Examples

### Example 1:

**Input:**

```
arr = [2, 3, 4, 7, 11]
k = 5
```

**Output:**

```
9
```

**Explanation:**  
The missing positive integers are `[1, 5, 6, 8, 9, 10, 12, ...]`.  
The 5th missing number is `9`.

---

### Example 2:

**Input:**

```
arr = [1, 2, 3, 4]
k = 2
```

**Output:**

```
6
```

**Explanation:**  
The missing positive integers are `[5, 6, 7, ...]`.  
The 2nd missing number is `6`.

---

## Constraints

- `1 <= arr.length <= 1000`
- `1 <= arr[i] <= 1000`
- `1 <= k <= 1000`
- `arr` is strictly increasing.

---

⚡ This is a **Binary Search on Missing Count** type problem.

---
