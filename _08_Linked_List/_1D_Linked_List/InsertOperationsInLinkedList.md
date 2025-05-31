---

# Insert Operations in a Singly Linked List

## Problem Statement

Implement the following **insert operations** in a singly linked list:

1. **Insert at head** of the linked list.
2. **Insert at tail** of the linked list.
3. **Insert at the Kth position** (1-based index).
4. **Insert before a given value** (insert a new node right before the first occurrence of a specified value).

Each operation should update the linked list correctly and maintain the node connections.

---

## Example

### Input Operations:

```
Initial List: 10 -> 20 -> 30 -> 40 -> 50 -> null
Insert at head: 100
Insert at tail: 200
Insert at position 3: 300
Insert before value 30: 400
```

### Output After Each Operation:

```
Initial List:
10 -> 20 -> 30 -> 40 -> 50 -> null

After inserting 100 at head:
100 -> 10 -> 20 -> 30 -> 40 -> 50 -> null

After inserting 200 at tail:
100 -> 10 -> 20 -> 30 -> 40 -> 50 -> 200 -> null

After inserting 300 at position 3:
100 -> 10 -> 300 -> 20 -> 30 -> 40 -> 50 -> 200 -> null

After inserting 400 before value 30:
100 -> 10 -> 300 -> 20 -> 400 -> 30 -> 40 -> 50 -> 200 -> null
```

---

## Constraints

- Do not use built-in LinkedList classes from Java.
- Implement all node structures and logic manually using a `Node` class.
- Position `k` is 1-based and valid (1 ≤ k ≤ length + 1).

---
