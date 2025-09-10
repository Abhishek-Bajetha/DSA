## Leaders in an Array

## Problem Statement

Given an integer array `arr`, a **leader** is an element that is **greater than or equal to all the elements on its right side**.

Return all the leaders in the array.

---

## Examples

### Example 1:

**Input:**

```
arr = [16, 17, 4, 3, 5, 2]
```

**Output:**

```
[17, 5, 2]
```

**Explanation:**

* `17` is greater than all elements to its right.
* `5` is greater than `2`.
* `2` is the last element, so it is always a leader.

---

### Example 2:

**Input:**

```
arr = [7, 10, 4, 10, 6, 5, 2]
```

**Output:**

```
[10, 10, 6, 5, 2]
```

---

## Constraints

* `1 <= arr.length <= 10^5`
* `-10^9 <= arr[i] <= 10^9`

---