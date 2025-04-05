# Check Armstrong Number

## Problem Statement

Given an integer `n`, determine whether it is an Armstrong number. An Armstrong number (also known as a Narcissistic number) for a given number of digits is a number such that the sum of its own digits each raised to the power of the number of digits is equal to the number itself.

## Examples

### Example 1:

**Input:**
```
n = 153
```
**Output:**
```
Armstrong Number
```
**Explanation:**
153 has 3 digits: `1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153`.
Since the sum of the digits raised to the power of 3 equals the number itself, it is an Armstrong number.

### Example 2:

**Input:**
```
n = 9474
```
**Output:**
```
Armstrong Number
```
**Explanation:**
9474 has 4 digits: `9^4 + 4^4 + 7^4 + 4^4 = 6561 + 256 + 2401 + 256 = 9474`.
Since the sum matches the original number, it is an Armstrong number.

### Example 3:

**Input:**
```
n = 123
```
**Output:**
```
Not an Armstrong Number
```
**Explanation:**
123 has 3 digits: `1^3 + 2^3 + 3^3 = 1 + 8 + 27 = 36`.
Since the sum does not match the original number, it is not an Armstrong number.

## Constraints
- `1 <= n <= 10^9`

## Expected Time Complexity
- `O(d)`, where `d` is the number of digits in `n`.

## Expected Space Complexity
- `O(1)`, as no extra space is used apart from variables.

