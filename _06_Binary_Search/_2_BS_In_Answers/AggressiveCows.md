## Problem Statement

You are given an array `stalls` of size `n` which represents the positions of `n` stalls in a straight line.

You have `k` cows, and you want to assign the stalls to the cows such that the **minimum distance between any two cows is as large as possible**.

Return the largest minimum distance possible.

---

## Examples

### Example 1:

**Input:**

```
stalls = [1, 2, 8, 4, 9]
k = 3
```

**Output:**

```
3
```

**Explanation:**
If we place cows at stalls 1, 4, and 8 → minimum distance = 3.
This is the largest possible minimum distance.

---

### Example 2:

**Input:**

```
stalls = [10, 1, 2, 7, 5]
k = 2
```

**Output:**

```
9
```

**Explanation:**
Place cows at stalls 1 and 10 → minimum distance = 9.

---

## Constraints

* `2 <= n <= 10^5`
* `0 <= stalls[i] <= 10^9`
* `2 <= k <= n`

---

⚡ This is a **Binary Search on Answer** problem and is very popular in **interviews and competitive programming**.

---