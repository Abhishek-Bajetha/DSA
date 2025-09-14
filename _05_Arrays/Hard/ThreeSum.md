## \[LeetCode 15] 3Sum

## Problem Statement

Given an integer array `nums`, return all the **unique triplets** `[nums[i], nums[j], nums[k]]` such that:

* `i != j`, `i != k`, and `j != k`
* `nums[i] + nums[j] + nums[k] == 0`

The solution set must not contain duplicate triplets.

---

## Examples

### Example 1:

**Input:**

```
nums = [-1, 0, 1, 2, -1, -4]
```

**Output:**

```
[[-1, -1, 2], [-1, 0, 1]]
```

**Explanation:**

* Triplet `[-1, -1, 2]` sums to 0.
* Triplet `[-1, 0, 1]` sums to 0.
  Other combinations either don’t sum to 0 or are duplicates.

---

### Example 2:

**Input:**

```
nums = [0, 1, 1]
```

**Output:**

```
[]
```

**Explanation:**
No triplet sums to 0.

---

### Example 3:

**Input:**

```
nums = [0, 0, 0]
```

**Output:**

```
[[0, 0, 0]]
```

---

## Constraints

* `3 <= nums.length <= 3000`
* `-10^5 <= nums[i] <= 10^5`

---