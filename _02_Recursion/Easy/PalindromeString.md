---
## Question: Check if a String is Not a Palindrome Using Recursion

### Problem Statement

Given a string `S`, write a recursive function to check **whether the string is not a palindrome**.
---

### Description

A string is said to be a **palindrome** if it reads the same backward as forward.

Your task is to write a recursive function that determines whether the input string is **not a palindrome**.

---

### Example

**Input:**

```
S = "radar"
```

**Output:**

```
false
```

**Explanation:**
"radar" is a palindrome.

---

**Input:**

```
S = "hello"
```

**Output:**

```
true
```

**Explanation:**
"hello" is not a palindrome.

---

### Constraints

- `1 <= |S| <= 10^4`  
  (Where `|S|` is the length of the string)

### Expected Time Complexity

- `O(N)`

### Expected Space Complexity

- `O(N)` (due to recursive call stack)

---
