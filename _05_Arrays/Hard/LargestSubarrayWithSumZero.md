## Problem Statement

Given an array of integers `arr`, find the **length of the largest subarray** whose sum is equal to `0`.

Return the maximum length of such a subarray.

---

## Examples

### Example 1:

**Input:**

```
arr = [15, -2, 2, -8, 1, 7, 10, 23]
```

**Output:**

```
5
```

**Explanation:**
The largest subarray with sum `0` is `[-2, 2, -8, 1, 7]`, which has length `5`.

---

### Example 2:

**Input:**

```
arr = [1, 2, 3]
```

**Output:**

```
0
```

**Explanation:**
There is no subarray with sum `0`.

---

### Example 3:

**Input:**

```
arr = [1, -1, 3, 2, -2, -3, 3]
```

**Output:**

```
6
```

**Explanation:**
The largest subarray with sum `0` is `[3, 2, -2, -3, 3, -0]` (indices 2 to 7).

---

## Constraints

- `1 <= arr.length <= 10^5`
- `-10^4 <= arr[i] <= 10^4`

---
