## [LeetCode 1283] Find the Smallest Divisor Given a Threshold

## Problem Statement

You are given an array of integers `nums` and an integer `threshold`.

You need to find the **smallest positive integer divisor** such that the sum of the following expression is less than or equal to `threshold`:

```
sum = ⌈nums[0] / divisor⌉ + ⌈nums[1] / divisor⌉ + ... + ⌈nums[n-1] / divisor⌉
```

Here, `⌈x⌉` represents the ceiling function (rounding up).

Return the smallest integer divisor that satisfies this condition.

---

## Examples

### Example 1:

**Input:**

```
nums = [1, 2, 5, 9]
threshold = 6
```

**Output:**

```
5
```

**Explanation:**
Using divisor = 5 → ceil(1/5)+ceil(2/5)+ceil(5/5)+ceil(9/5) = 1+1+1+2 = 5 ≤ 6.

---

### Example 2:

**Input:**

```
nums = [44, 22, 33, 11, 1]
threshold = 5
```

**Output:**

```
44
```

---

### Example 3:

**Input:**

```
nums = [21212, 10101, 12121]
threshold = 1000000
```

**Output:**

```
1
```

---

## Constraints

- `1 <= nums.length <= 5 * 10^4`
- `1 <= nums[i] <= 10^6`
- `nums.length <= threshold <= 10^6`

---

⚡ This is a **Binary Search on Answer** type of problem.

---
