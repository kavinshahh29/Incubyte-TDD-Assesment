## 📋 Method Description

This method:

- Accepts a string of numbers separated by delimiters (e.g., commas, newlines).
- Returns the sum of the numbers.
- Starts with basic functionality and expands step-by-step by adding features through tests.

---

## 📋 Features (TDD Steps)

The `add(String numbers)` method should:

- ✅ Return 0 for an empty string: `"" → 0`
- ✅ Return the number itself when only one number is passed: `"4" → 4`
- ✅ Return sum of two comma-separated numbers: `"1,2" → 3`
- ✅ Handle multiple numbers: `"1,2,3,4" → 10`
- ✅ Support newline `\n` as a delimiter: `"1\n2,3" → 6`
- ✅ Support custom delimiter: `"//;\n1;2" → 3`
- ✅ Throw exception for negative numbers: `"1,-2"` → `Exception: Negatives not allowed: -2`
- ✅ Ignore numbers greater than 1000: `"2,1001" → 2`

---

## 🧪 Tech Stack

- 🧠 **Java**
- 🧪 **JUnit 5 
