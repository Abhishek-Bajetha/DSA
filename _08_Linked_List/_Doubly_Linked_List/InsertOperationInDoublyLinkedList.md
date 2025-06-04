---

# Insert Nodes Before Given Positions in a Doubly Linked List

## Problem Statement

You are given a Doubly Linked List and your task is to perform the following insert operations:

1. Insert a new node **before the head**.
2. Insert a new node **before the tail**.
3. Insert a new node **before the k-th node** (1-based index).

Each node of the Doubly Linked List contains three fields:

* `data`: the value of the node.
* `next`: a reference to the next node.
* `back`: a reference to the previous node.

Implement the logic for all three insertions manually using pointer manipulation.

---

## Example

### Input:

```
Initial List: 1 -> 2 -> 3 -> 4 -> 5
Insert 100 before head
Insert 200 before tail
Insert 300 before 3rd node (1-based)
```

### Output:

```
100 -> 1 -> 2 -> 3 -> 4 -> 5
100 -> 1 -> 2 -> 3 -> 4 -> 200 -> 5
100 -> 1 -> 2 -> 300 -> 3 -> 4 -> 200 -> 5
```

---

## Constraints

- `1 <= number of nodes <= 10^5`
- You may assume `k` is always valid (i.e., `1 <= k <= length of DLL`)
- Implement the DLL and insertion methods without using Java collections like `LinkedList`

---
