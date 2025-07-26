# Remove Outermost Parentheses

## Problem Statement

A valid parentheses string is either:

* `""` (an empty string),
* `"(" + A + ")"`, where `A` is a valid parentheses string,
* `A + B`, where both `A` and `B` are valid parentheses strings.

Given a valid parentheses string `s`, **remove the outermost parentheses** of every primitive valid parentheses substring.

Return the resulting string.

> A **primitive** valid parentheses string is a non-empty valid parentheses string that cannot be split into two non-empty valid parentheses strings.

## Examples

### Example 1:

**Input:**

```
s = "(()())(())"
```

**Output:**

```
"()()()"
```

**Explanation:**

* The input has two primitive substrings: `"(()())"` and `"(())"`.
* After removing outermost parentheses: `"()()"` and `"()"` → combined → `"()()()"`.

---

### Example 2:

**Input:**

```
s = "(()())(())(()(()))"
```

**Output:**

```
"()()()()(())"
```

---

### Example 3:

**Input:**

```
s = "()()"
```

**Output:**

```
""
```

**Explanation:**
Each pair is a primitive and their outer parentheses are removed, resulting in an empty string.

---

## Constraints

* `1 <= s.length <= 10^5`
* `s[i]` is either `'('` or `')'`
* `s` is a valid parentheses string.

---
