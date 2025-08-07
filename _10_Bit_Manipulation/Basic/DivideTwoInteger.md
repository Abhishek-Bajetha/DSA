## Divide Two Integers Without Division Operator

## Problem Statement

Implement a function to **divide two integers** without using multiplication (`*`), division (`/`), or modulo (`%`) operators.

The result should be truncated toward zero (i.e., discard the fractional part).

If the result exceeds the range of a 32-bit signed integer, **clamp** it to `[-2^31, 2^31 - 1]`.

---

## Examples

### Example 1:

**Input:**

```
dividend = 10
divisor = 3
```

**Output:**

```
3
```

**Explanation:**
10 divided by 3 is 3.333..., which is truncated to 3.

---

### Example 2:

**Input:**

```
dividend = 7
divisor = -3
```

**Output:**

```
-2
```

**Explanation:**
7 divided by -3 is -2.333..., which is truncated to -2.

---

### Example 3:

**Input:**

```
dividend = -2147483648
divisor = -1
```

**Output:**

```
2147483647
```

**Explanation:**
The result overflows 32-bit signed int range and is clamped to `2^31 - 1`.

---

## Constraints

* `-2^31 <= dividend, divisor <= 2^31 - 1`
* `divisor ≠ 0`
* Do **not** use multiplication `*`, division `/`, or modulo `%`

---
