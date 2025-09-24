## \[LeetCode 1482] Minimum Number of Days to Make m Bouquets

## Problem Statement

You are given an integer array `bloomDay`, where `bloomDay[i]` represents the day on which the `i-th` flower will bloom.

You are also given integers `m` and `k`.

You want to make `m` bouquets. To make one bouquet, you need to pick `k` **adjacent** bloomed flowers from the garden.

Return the **minimum number of days** needed for you to be able to make `m` bouquets. If it is impossible, return `-1`.

---

## Examples

### Example 1:

**Input:**

```
bloomDay = [1, 10, 3, 10, 2]
m = 3
k = 1
```

**Output:**

```
3
```

**Explanation:**
On day 3:

* Flowers at indices \[0, 2, 4] bloom.
* We can make 3 bouquets using 1 flower each.

---

### Example 2:

**Input:**

```
bloomDay = [1, 10, 3, 10, 2]
m = 3
k = 2
```

**Output:**

```
-1
```

**Explanation:**
We need 6 flowers in total (3 bouquets × 2 flowers each), but there are only 5 flowers.

---

### Example 3:

**Input:**

```
bloomDay = [7, 7, 7, 7, 12, 7, 7]
m = 2
k = 3
```

**Output:**

```
12
```

**Explanation:**
On day 12, we have enough adjacent flowers to make 2 bouquets of 3 flowers each.

---

## Constraints

* `1 <= bloomDay.length <= 10^5`
* `1 <= bloomDay[i] <= 10^9`
* `1 <= m <= 10^6`
* `1 <= k <= bloomDay.length`

---

⚡ This is another **binary search on answer** problem, often paired with *Koko Eating Bananas* in interviews.

---