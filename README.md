# Scala Exception Handling for Control Flow

This repository demonstrates an example of using exceptions for standard control flow in Scala. This approach is generally discouraged for better code readability and maintainability.

## Bug Description
The `myMethod` function uses an `IllegalArgumentException` to handle the case where input 'x' is non-positive. However, this exception is used not for handling an exceptional state, but as a standard part of the function's logic.  This is an anti-pattern.

## Solution
The preferred approach is to avoid using exceptions for regular flow of control. Returning an `Option` or using pattern matching often leads to more readable and efficient code. 

