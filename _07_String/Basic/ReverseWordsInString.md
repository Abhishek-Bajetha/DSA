# Reverse Words in a String

## Problem Statement

Given a string `s`, **reverse the order of words** in the string.

A word is defined as a **sequence of non-space characters**.
The words in `s` will be separated by at least one space.

Return a string with the **words in reverse order**, joined by a **single space**.
The **leading or trailing spaces** should be removed, and multiple spaces between words should be reduced to a **single space**.

## Examples

### Example 1:

**Input:**

```
s = "  the sky  is blue "
```

**Output:**

```
"blue is sky the"
```

---

### Example 2:

**Input:**

```
s = "  hello world  "
```

**Output:**

```
"world hello"
```

---

### Example 3:

**Input:**

```
s = "a good   example"
```

**Output:**

```
"example good a"
```

---

## Constraints

* `1 <= s.length <= 10^4`
* `s` contains English letters (uppercase or lowercase), digits, and spaces `' '`.
* There is **at least one word** in `s`.

---