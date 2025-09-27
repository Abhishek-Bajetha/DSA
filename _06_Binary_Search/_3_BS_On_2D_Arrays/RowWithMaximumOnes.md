## Problem Statement

You are given a 2D binary matrix `mat` of size `n x m` where each row is **sorted in non-decreasing order** (all 0’s appear before 1’s).

Your task is to find the **index of the row that contains the maximum number of 1’s**.

If multiple rows have the same number of 1’s, return the index of the first such row.
If no 1’s are present in the matrix, return `-1`.

---

## Examples

### Example 1:

**Input:**

```
mat = [
  [0, 1, 1, 1],
  [0, 0, 1, 1],
  [1, 1, 1, 1],
  [0, 0, 0, 0]
]
```

**Output:**

```
2
```

**Explanation:**
Row `2` has `4` ones, which is the maximum.

---

### Example 2:

**Input:**

```
mat = [
  [0, 0],
  [0, 0]
]
```

**Output:**

```
-1
```

**Explanation:**
There are no 1’s in the matrix.

---

## Constraints

* `1 <= n, m <= 10^3`
* `0 <= mat[i][j] <= 1`
* Each row is sorted (all 0’s before 1’s).

---

⚡ This is a **matrix + binary search / greedy** type problem, often asked in interviews.

---