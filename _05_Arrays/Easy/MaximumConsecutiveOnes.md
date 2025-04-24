---
# Maximum Consecutive Ones

## Problem Statement

Given a binary array (containing only `0`s and `1`s), find the **maximum number of consecutive `1`s** present in the array.

You need to return the length of the longest contiguous subarray consisting only of `1`s.
---

## Examples

### Example 1:

**Input:**

```
arr = [1, 1, 0, 1, 1, 1]
```

**Output:**

```
3
```

**Explanation:**
There are two sequences of consecutive `1`s: `[1, 1]` and `[1, 1, 1]`. The maximum length is `3`.

---

### Example 2:

**Input:**

```
arr = [1, 0, 0, 1, 0, 1, 1]
```

**Output:**

```
2
```

**Explanation:**
The longest consecutive `1`s are at the end: `[1, 1]`.

---

## Constraints

- `1 <= arr.length <= 10^6`
- Each element of the array is either `0` or `1`

---
