# Check for Balanced Parentheses

## Problem Statement

Given a string containing only the characters `(`, `)`, `{`, `}`, `[` and `]`, write a function to check if the **parentheses are balanced**.

A string is said to be balanced if:

* Every opening bracket has a corresponding closing bracket of the same type.
* Brackets are closed in the correct order.

Return `true` if the string is balanced, otherwise return `false`.

You must solve this problem using a **stack**.

## Examples

### Example 1:

**Input:**

```
s = "{[()]}"
```

**Output:**

```
true
```

**Explanation:**
All brackets are properly matched and nested.

---

### Example 2:

**Input:**

```
s = "{[(])}"
```

**Output:**

```
false
```

**Explanation:**
The closing `)` does not match the most recent opening `[`.

---

### Example 3:

**Input:**

```
s = "((()))"
```

**Output:**

```
true
```

---

### Example 4:

**Input:**

```
s = "[({})](]"
```

**Output:**

```
false
```

---
