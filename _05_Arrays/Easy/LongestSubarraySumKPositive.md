---
# Longest Subarray with Sum K (Positive Integers Only)

## Problem Statement

Given an array of **positive integers** and a target integer `k`, your task is to find the **length of the longest subarray** whose elements sum up to `k`.

Since the array contains only positive integers, an efficient two-pointer or sliding window approach can be used.
---

## Examples

### Example 1:

**Input:**

```
arr = [1, 2, 3, 1, 1, 1, 1], k = 5
```

**Output:**

```
4
```

**Explanation:**
The subarray `[1, 1, 1, 1]` has a sum of 5 and length 4.

---

### Example 2:

**Input:**

```
arr = [1, 2, 1, 1, 1], k = 3
```

**Output:**

```
3
```

**Explanation:**
The subarray `[1, 1, 1]` has a sum of 3 and is the longest such subarray.

---

## Constraints

- `1 <= arr.length <= 10^5`
- `1 <= arr[i] <= 10^4`
- `1 <= k <= 10^9`

---
