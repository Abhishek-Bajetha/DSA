
## \[LeetCode 1423] Maximum Points You Can Obtain from Cards

## Problem Statement

You are given an integer array `cardPoints` where each card has a point value.
You are also given an integer `k`.

In one move, you can take one card from the beginning or the end of the array. You must take exactly `k` cards.

Return the **maximum score** you can obtain by picking exactly `k` cards.

---

## Examples

### Example 1:

**Input:**

```
cardPoints = [1, 2, 3, 4, 5, 6, 1]
k = 3
```

**Output:**

```
12
```

**Explanation:**
Pick the last card (1) and the first two cards (1 + 2 + 6 + 3 — wait let me correct) → Best choice is taking `6 + 5 + 1 = 12`.

---

### Example 2:

**Input:**

```
cardPoints = [2, 2, 2]
k = 2
```

**Output:**

```
4
```

**Explanation:**
Only possible choice is to take two cards from the ends, total points = 4.

---

### Example 3:

**Input:**

```
cardPoints = [9, 7, 7, 9, 7, 7, 9]
k = 7
```

**Output:**

```
55
```

**Explanation:**
Must take all cards.

---

## Constraints

* `1 <= cardPoints.length <= 10^5`
* `1 <= cardPoints[i] <= 10^4`
* `1 <= k <= cardPoints.length`

---