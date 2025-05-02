---
# Floor and Ceil in Sorted Array

## Problem Statement

Given a **sorted array** of integers and a target value `x`, find the **floor** and **ceil** of `x` in the array.

- **Floor**: The greatest element in the array which is less than or equal to `x`.
- **Ceil**: The smallest element in the array which is greater than or equal to `x`.

If the floor or ceil does not exist, return `-1` for that part.

---

## Examples

### Example 1:

**Input:**
```
arr = [1, 2, 8, 10, 10, 12, 19], x = 5
```

**Output:**
```
Floor: 2, Ceil: 8
```

**Explanation:**
2 is the greatest number ≤ 5, and 8 is the smallest number ≥ 5.

---

### Example 2:

**Input:**
```
arr = [1, 2, 8, 10, 10, 12, 19], x = 20
```

**Output:**
```
Floor: 19, Ceil: -1
```

**Explanation:**
20 is greater than all elements, so floor is 19 and ceil doesn't exist.

---

### Example 3:

**Input:**
```
arr = [1, 2, 8, 10, 10, 12, 19], x = 0
```

**Output:**
```
Floor: -1, Ceil: 1
```

**Explanation:**
0 is less than all elements, so floor doesn't exist and ceil is 1.

---

## Constraints

- `1 <= arr.length <= 10^5`
- `-10^9 <= arr[i], x <= 10^9`
- The array is sorted in non-decreasing order

---