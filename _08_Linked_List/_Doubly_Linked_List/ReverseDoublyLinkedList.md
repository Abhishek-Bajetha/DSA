---

# Reverse a Doubly Linked List

## Problem Statement

Given the head of a **doubly linked list**, reverse the list and return the new head.

You should reverse the links of all nodes so that the next pointer becomes the previous one and vice versa.

## Examples

### Example 1:

**Input:**

```
Doubly Linked List: 1 <-> 2 <-> 3 <-> 4 <-> 5
```

**Output:**

```
5 <-> 4 <-> 3 <-> 2 <-> 1
```

**Explanation:**
All node links are reversed properly.

---

### Example 2:

**Input:**

```
Doubly Linked List: 10
```

**Output:**

```
10
```

**Explanation:**
Only one node, so the list remains the same.

---

## Constraints

- `1 <= Number of nodes <= 10^5`
- `-10^9 <= Node.data <= 10^9`
- The list is **doubly linked**, meaning each node has both `next` and `prev` pointers.

---
