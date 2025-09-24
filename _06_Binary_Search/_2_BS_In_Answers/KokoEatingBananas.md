## \[LeetCode 875] Koko Eating Bananas

## Problem Statement

Koko loves to eat bananas. There are `n` piles of bananas, where the `i-th` pile has `piles[i]` bananas. The guards have gone and will return in `h` hours.

Koko can decide her eating speed of bananas per hour, `k`. Every hour, she chooses a pile of bananas and eats `k` bananas from that pile. If the pile has fewer than `k` bananas, she eats all of them instead and does not eat from any other pile during that hour.

Return the **minimum integer k** such that Koko can eat all the bananas within `h` hours.

---

## Examples

### Example 1:

**Input:**

```
piles = [3, 6, 7, 11]
h = 8
```

**Output:**

```
4
```

**Explanation:**
Koko can eat at speed 4 bananas/hour and finish in 8 hours.

---

### Example 2:

**Input:**

```
piles = [30, 11, 23, 4, 20]
h = 5
```

**Output:**

```
30
```

---

### Example 3:

**Input:**

```
piles = [30, 11, 23, 4, 20]
h = 6
```

**Output:**

```
23
```

---

## Constraints

* `1 <= piles.length <= 10^4`
* `piles[i]` between `1` and `10^9`
* `1 <= h <= 10^9`

---

⚡ This is a **binary search on answer** type problem.

---