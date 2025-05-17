---

# Find Peak Element

## Problem Statement

You are given an array of integers. A **peak element** is an element that is strictly greater than its neighbors. Your task is to find the index of **any one** peak element in the array.

Note:

* An array element is considered a peak if it is **greater than both** its neighbors.
* For the edge elements, we consider only one neighbor.

## Example

### Example 1:

**Input:**

```
arr = [1, 2, 3, 1]
```

**Output:**

```
2
```

**Explanation:**
Element at index 2 is 3, which is greater than its neighbors 2 and 1.

### Example 2:

**Input:**

```
arr = [1, 2, 1, 3, 5, 6, 4]
```

**Output:**

```
1 or 5
```

**Explanation:**
Both 2 (index 1) and 6 (index 5) are peak elements.

## Constraints

* `1 <= arr.length <= 10^5`
* `-10^9 <= arr[i] <= 10^9`
* The array may contain multiple peak elements. Return the index of **any one** of them.

---