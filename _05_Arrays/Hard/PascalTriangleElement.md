## Pascal’s Triangle – Find Element at Given Row and Column

## Problem Statement

Given two integers `row` and `col`, return the element at the specified position in **Pascal’s Triangle**.

Pascal’s Triangle is constructed as follows:

* The top element is `1` (row 0, col 0).
* Each element is the sum of the two elements directly above it.
* The element at row `r` and column `c` corresponds to the binomial coefficient:

  ```
                    1
                1       1
            1       2       1
        1       3       3       1
    1       4       6       4       1
  ```

---

## Examples

### Example 1:

**Input:**

```
row = 4, col = 2
```

**Output:**

```
6
```

**Explanation:**
The 4th row of Pascal’s Triangle is `[1, 4, 6, 4, 1]`.
At column `2`, the element is `6`.

---

### Example 2:

**Input:**

```
row = 5, col = 0
```

**Output:**

```
1
```

**Explanation:**
The first and last element of every row in Pascal’s Triangle is always `1`.

---

## Constraints

* `0 <= row <= 30`
* `0 <= col <= row`

---