
## String to Integer (Recursive Atoi)

## Problem Statement

Implement a function to convert a string to a 32-bit signed integer using **recursion**, similar to the C/C++ `atoi` function.

The function should follow these rules:

1. Discard all leading whitespaces.
2. Check for an optional `'+'` or `'-'` sign.
3. Read digits until a non-digit character is found or the end of the string is reached.
4. Return the integer formed. If the number exceeds the 32-bit signed integer range, clamp it to `[-2^31, 2^31 - 1]`.

You must **not** use any built-in methods like `Integer.parseInt()`.

---

## Examples

### Example 1:

**Input:**

```
str = "   -42"
```

**Output:**

```
-42
```

**Explanation:**
The function discards the leading spaces and parses `-42`.

---

### Example 2:

**Input:**

```
str = "4193 with words"
```

**Output:**

```
4193
```

**Explanation:**
The function stops reading after encountering the space after `4193`.

---

### Example 3:

**Input:**

```
str = "words and 987"
```

**Output:**

```
0
```

**Explanation:**
Since the string doesn't start with a number, the function returns `0`.

---

## Constraints

* `0 <= str.length <= 10^5`
* The string may contain leading whitespaces.
* The string may begin with a '+' or '-' sign.
* Only the **first** valid integer sequence is considered.
* Clamp the result within the 32-bit signed integer range: `[-2^31, 2^31 - 1]`.

---

Ready for the next one when you are.
