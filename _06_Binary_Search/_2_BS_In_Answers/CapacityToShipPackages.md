## [LeetCode 1011] Capacity To Ship Packages Within D Days

## Problem Statement

A conveyor belt has packages that must be shipped from one port to another within `days` days.

The `i-th` package has a weight of `weights[i]`. Each day, you load the ship with packages in the given order.
The ship’s capacity is the maximum weight it can carry in one day.

Return the **minimum ship capacity** required to ship all the packages within the given `days`.

---

## Examples

### Example 1:

**Input:**

```
weights = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
days = 5
```

**Output:**

```
15
```

**Explanation:**
A ship capacity of 15 can ship the packages in 5 days as follows:

* Day 1: [1, 2, 3, 4, 5] (total = 15)
* Day 2: [6, 7] (total = 13)
* Day 3: [8]
* Day 4: [9]
* Day 5: [10]

---

### Example 2:

**Input:**

```
weights = [3, 2, 2, 4, 1, 4]
days = 3
```

**Output:**

```
6
```

---

### Example 3:

**Input:**

```
weights = [1, 2, 3, 1, 1]
days = 4
```

**Output:**

```
3
```

---

## Constraints

* `1 <= weights.length <= 5 * 10^4`
* `1 <= weights[i] <= 500`
* `1 <= days <= 10^5`

---

⚡ Another **Binary Search on Answer** problem, commonly paired with:

* [875] Koko Eating Bananas
* [1482] Minimum Days to Make Bouquets
* [1283] Find the Smallest Divisor Given a Threshold

---