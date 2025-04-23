---
# Lower Bound in Array

## Problem Statement

Given a **sorted array** of integers and a **target value**, find the **lower bound** of the target in the array.

The **lower bound** of a target is the index of the **first element** in the array which is **greater than or equal to** the target.

If all elements in the array are smaller than the target, return the size of the array.

You must solve this using **binary search** logic. Do not use built-in methods or libraries like `Arrays.binarySearch()`.
---

## Examples

### Example 1:

**Input:**

```
arr = [1, 3, 3, 5, 8]
target = 4
```

**Output:**

```
3
```

**Explanation:**
The first element greater than or equal to `4` is `5`, which is at index `3`.

---

### Example 2:

**Input:**

```
arr = [1, 2, 2, 2, 2, 5, 6]
target = 2
```

**Output:**

```
1
```

**Explanation:**
The first index where `2` appears is `1`.

---

### Example 3:

**Input:**

```
arr = [10, 20, 30]
target = 35
```

**Output:**

```
3
```

**Explanation:**
All elements are smaller than `35`, so the lower bound is at index `3` (i.e., beyond the last element).

---

## Constraints

- `1 <= arr.length <= 10^5`
- `-10^9 <= arr[i], target <= 10^9`
- The array is sorted in non-decreasing order.

---
