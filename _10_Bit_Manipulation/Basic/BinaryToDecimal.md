# Convert Binary to Decimal

## Problem Statement

Given a binary number as a **string**, convert it to its **decimal (base-10)** equivalent.

You are **not allowed** to use built-in conversion methods like `Integer.parseInt(str, 2)`.

Return the decimal integer as output.

---

## Examples

### Example 1:

**Input:**

```
binary = "101"
```

**Output:**

```
5
```

**Explanation:**
`1×2² + 0×2¹ + 1×2⁰ = 4 + 0 + 1 = 5`

---

### Example 2:

**Input:**

```
binary = "1111"
```

**Output:**

```
15
```

---

### Example 3:

**Input:**

```
binary = "0"
```

**Output:**

```
0
```

---

## Constraints

* `1 <= binary.length <= 32`
* The string contains only characters `'0'` or `'1'`.
* The input represents a non-negative binary number.

---
