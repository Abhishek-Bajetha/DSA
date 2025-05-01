---
# Find the Upper Bound in a Sorted Array

## Problem Statement

Given a **sorted array** of integers and a target value `x`, your task is to find the **index of the first element greater than `x`** (also known as the **upper bound** of `x` in the array).

If no such element exists, return `-1`.

You should aim to implement this using a **binary search approach**.
---

## Examples

### Example 1:

**Input:**

```
arr = [1, 3, 5, 6, 9], x = 5
```

**Output:**

```
3
```

**Explanation:**
The first element greater than 5 is 6, which is at index 3.

---

### Example 2:

**Input:**

```
arr = [2, 4, 4, 4, 8, 10], x = 4
```

**Output:**

```
4
```

**Explanation:**
The first element greater than 4 is 8, found at index 4.

---

### Example 3:

**Input:**

```
arr = [1, 2, 3], x = 5
```

**Output:**

```
-1
```

**Explanation:**
There is no element greater than 5 in the array.

---

## Constraints

- `1 <= arr.length <= 10^5`
- `-10^9 <= arr[i], x <= 10^9`

---
