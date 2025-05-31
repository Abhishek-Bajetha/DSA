---

# Delete Operations in a Linked List

## Problem Statement

Implement various delete operations in a **singly linked list**. You are required to perform the following operations on a linked list:

1. **Delete the head node** of the list.
2. **Delete the tail node** of the list.
3. **Delete the K-th node** in the list (1-based indexing).
4. **Delete a node by its value** (first occurrence only).

After each operation, print the updated linked list.

---

## Example

### Input:

```
Initial list: 10 → 20 → 30 → 40 → 50

Operation 1: Delete head
Operation 2: Delete tail
Operation 3: Delete 3rd node
Operation 4: Delete node with value 40
```

### Output:

```
10 20 30 40 50
20 30 40 50
20 30 40
20 30
20 30
```

---

## Constraints

- All node values are integers.
- The list will contain at least 1 node before each operation.
- For the K-th node deletion, 1 ≤ K ≤ size of the list.

---
