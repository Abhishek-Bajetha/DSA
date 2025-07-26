# Largest Odd Number in String

## Problem Statement

You are given a numeric string `num`, representing a large integer.

Return **the largest-valued odd number** that is a **non-empty substring** of `num` and is a **prefix** (i.e., starting from the first character) of `num`.

If no odd number exists, return an empty string `""`.

A number is odd if its **last digit** is odd (`1`, `3`, `5`, `7`, or `9`).

## Examples

### Example 1:

**Input:**

```
num = "52"
```

**Output:**

```
"5"
```

**Explanation:**
"52" is not odd, but its prefix "5" is an odd number.

---

### Example 2:

**Input:**

```
num = "4206"
```

**Output:**

```
""
```

**Explanation:**
No prefix of this string ends with an odd digit.

---

### Example 3:

**Input:**

```
num = "35427"
```

**Output:**

```
"35427"
```

**Explanation:**
The entire string ends with an odd digit, so it's valid.

---

## Constraints

* `1 <= num.length <= 10^5`
* `num` consists only of digits and does **not** contain any leading zeroes.

---
