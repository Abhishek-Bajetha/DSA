## Problem Statement

Given an array of integers `arr` and an integer `K`, count the **number of subarrays** whose XOR is equal to `K`.

A subarray is defined as a contiguous part of the array.

---

## Examples

### Example 1:

**Input:**

```
arr = [4, 2, 2, 6, 4]
K = 6
```

**Output:**

```
4
```

**Explanation:**
The subarrays with XOR `6` are:

* `[4, 2]`
* `[2, 6]`
* `[6]`
* `[4, 2, 2, 6]`

---

### Example 2:

**Input:**

```
arr = [5, 6, 7, 8, 9]
K = 5
```

**Output:**

```
2
```

**Explanation:**
The subarrays with XOR `5` are:

* `[5]`
* `[6, 7, 8, 9]`

---

## Constraints

* `1 <= arr.length <= 10^5`
* `0 <= arr[i], K <= 10^9`

---