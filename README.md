# open-closed-principle (OCP)
a short tutorial for demonstrating the Open Closed SOLID design principle

## Overview
The Open Closed Principle is the 'O' in Solid design principles. It is also referred to as OCP <br />
The other SOLID principles are
  * S - Single Responsibility
  * O - Open/Closed
  * L - Liskov Substitution
  * I - Interface Segregation
  * D - Dependency Inversion

## Motivation
These principles are a powerful tool for being a good developer<br />
Beyond being able to fulfill the requirements of your story these principles will help you be able to write code that is easier to understand, test, and update.<br />
Often when writing code the first thing a developer will write something that works before going back and refactoring.<br />
With these principles in mind you can review them by recite each letter and what they stand for comparing the concepts to what you have written before submitting your work for code review.<br />

## The Open Close Principle (OCP)
The open close principle simply stated is that your code is open for extending but closed for modification

## Signs you need to apply OCP
  * if you need to change or add to preexisting code to add functionality
  * if your code is hard to test because your new code is inside other logic
  * if you notice that the code has multiple responsibilities, it breaks the Single Responsibility principle
  
## Applying OCP
OCP places emphasis on the use of interfaces rather than using inheritance or composition <br />
This is so your code will be 'loosely coupled' and polymorphic so that you can easily substitute between them.
Where as when using inheritance or composition adding or changing an implementation may lead to a complexity of necessary changes.

## In Short
If you have a class that creates and object _and_ it also creates a feature of that object there is a good chance you might want to implement OCP. <br />
Applying this principle will make your code cleaner, easier to test, easier to understand and more joyful to work on
