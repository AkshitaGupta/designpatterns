package Structural.Decorator.CustomizeCoffee;

/*
The decorator pattern shows us how we can use composition to get the flexibility we want without all the complexity.
The decorator pattern attaches additional responsibilities to an object dynamically.
Decorators provide a flexible alternative to subclassing for extending functionality,

Open close principe: This principle says that classes should be open for extension but closed for modification.

For eg: We want to leave our design open for new beverage types and condiments but closed in the sense that we don't
want to touch existing code.

PROBLEMS: Overuse of the Open/Closed principle can lead to abstract and complex code. This principle should really only
be used in places where code is least likely to change.

The Design Patterns book does point out a couple of disadvantages with this pattern. Decorators can lead to a system
with a lot of smaller objects that will look similar to a developer and introduce a maintenance headache. Also, the
Decorator and it's enclosed components are not identical, so tests for object type (instanceof) will fail.


 */
public class CoffeeShop {
}
