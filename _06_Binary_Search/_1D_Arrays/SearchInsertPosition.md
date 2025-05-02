---
# Search Insert Position

## Problem Statement

Given a **sorted array** of distinct integers and a target value `x`, return the **index if the target is found**. If not, return the **index where it would be if it were inserted in order**.

You must write an efficient solution that uses binary search.
---

## Examples

### Example 1:

**Input:**

```
arr = [1, 3, 5, 6], x = 5
```

**Output:**

```
2
```

**Explanation:**
5 is found at index 2.

---

### Example 2:

**Input:**

```
arr = [1, 3, 5, 6], x = 2
```

**Output:**

```
1
```

**Explanation:**
2 is not in the array, but it would be inserted at index 1 to maintain sorted order.

---

### Example 3:

**Input:**

```
arr = [1, 3, 5, 6], x = 7
```

**Output:**

```
4
```

**Explanation:**
7 is greater than all elements, so it would be inserted at the end.

---

## Constraints

- `1 <= arr.length <= 10^4`
- `-10^4 <= arr[i], x <= 10^4`
- The array is sorted in ascending order and contains distinct values.

---
