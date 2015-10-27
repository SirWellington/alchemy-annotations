Alchemy Annotations
==============================================

<img src="https://raw.githubusercontent.com/SirWellington/alchemy/develop/Graphics/Logo/Alchemy-Logo-v3-name.png" width="200">

## "Write what you mean, mean what you write."

[![Build Status](https://travis-ci.org/SirWellington/alchemy-annotations.svg)](https://travis-ci.org/SirWellington/alchemy-annotations)


# Purpose
**Alchemy Annotations** allow clearer documentation of intent of your code.

It can be used to document intent, expectations, behaviors, structure, and more.

# Why use this

It is much easier for other developers and architects to understand what is going on in the code base when they
know what to look for, and what behavior to expect.

It also allows us to more explicitly document intent and expectations, reducing the chance for human mistake.

For example, by applying the `@StrategyPattern` annotation to a few classes, we know can more easily understand the
relationship between them.


# Download

To use, simply add the following maven dependency.

## Release
```xml
<dependency>
	<groupId>tech.sirwellington.alchemy</groupId>
	<artifactId>alchemy-annotations</artifactId>
	<version>1.2</version>
</dependency>
```

## Snapshot

>First add the Snapshot Repository
```xml
<repository>
	<id>ossrh</id>
    <url>https://oss.sonatype.org/content/repositories/snapshots</url>
</repository>
```

```xml
<dependency>
	<groupId>tech.sirwellington.alchemy</groupId>
	<artifactId>alchemy-annotations</artifactId>
	<version>1.3-SNAPSHOT</version>
</dependency>
```

# Javadocs
## [Latest](http://www.javadoc.io/doc/tech.sirwellington.alchemy/alchemy-annotations/)


# API
 Applying annotations is simple.

## Access
`tech.sirwellington.alchemy.annotations.access`

Labels describing expectations about access to code or data.


+ `@Internal` - Indicates that a Type, Function, or Variable is only intended to be used within the Project.
+ `@NonInstantiable` - Indicates that a Class is not designed to be instantiated, and may throw an Exception if an attempt is made to instantiate it.

### Examples

#### @Internal

```java
@Internal
public class MapOperations
{
	public Map findIntersection(Map first, map second) { }
}
```

#### @NonInstantiable
```java
@NonInstantiable
public final class Strings
{
	private Strings() { throw new IllegalAccessException(); }

	public static String toJson(String string) { }
}
```


## Arguments
Documentation for arguments or fields.

+ `@Nullable` - Indicates that a parameter or field can be `null`. I.E., `null` is an acceptable value.
+ `@NonNull` - Indicates that a parameter or field that should never be `null`. I.E., it's an error condition if it is `null`.
+ `@NonEmpty` - Indicates that `String`, `Array`, `Collection`, or similar type should never be empty.

### Examples

#### @NonEmpty
```java
class MyService
{
	private final String name;

	MyService(@NonEmpty String serviceName)
	{
		Arguments.checkThat(serviceName)
				 .is(nonEmptyString());
		this.name = serviceName;
	}
}

```
#### @Nullable
```java

public Pizza create(Bread bread, @Nullable List<Condiments> condiments)
{
	Pizza pizza = createPizza(bread);

	if (Lists.notEmpty(condiments))
	{
		pizza.addCondiments(condiments);
	}
}

```

## Concurrency
Documentation for Concurrency concerns and concepts.

+ `@ThreadSafe` - Indicates that an Object or method is Thread-Safe and can be used in multi-threaded environments without additional precautions.
+ `@ThreadUnsafe` - Opposite of `@ThreadSafe`. Used to indicate that an object is definitely not Thread-Safe and should be handled cautiously in multi-threaded environments.
+ `@Mutable` - Labels an Object or variable as Mutable, meaning that its state **can** change once set.
+ `@Immutable` - Labels an Object or variable as Immutable, meaning that its state **cannot** change once set.

### Examples

#### @ThreadSafe

```java
@ThreadSafe
class PizzaFactory
{
	Pizza makePizza()
	{
		return new Pizza("Tasty!");
	}
}

#### @ThreadUnsafe

```java
@ThreadUnsafe
class PizzaStore
{
	private PizzaFactory factory;

	...

	void serveCustomer()
	{
		factory.makePizza();
		//...
	}
}
```
#### @Mutable

```java
@Mutable
class Store
{
	@Mutable
	private List<Customer> customers;
}
```

#### @Immutable

```java
class Store
{
	private List<Customer> customers;

	@Immutable
	private final String storeName;
}
```


## Design Patterns
Documents the Application or Use of Design Patterns. This allows others to know right away how objects relate.

`tech.sirwellington.alchemy.annotations.designs.patterns`

+ `@BuilderPattern`
+ `@FactoryPattern`
+ `@AbstractFactoryPattern`
+ `@StrategyPattern`
+ `@DecoratorPattern`
+ `@SingletonPattern`
+ `@ObserverPattern`
+ `@StatePattern`

### Examples


#### @ObserverPattern

```java
@ObserverPattern(role = SUBJECT)
class Apple
{
...
}

@ObserverPattern(role = OBSERVER)
class AppleFanboy implements AppleWatcher
{

	void onNewRelease(PressRelease info)
	{
		print("WooHoo!");
	}
}

```

## Other Designs
These are not "Textbook" Design Patterns, but are still common and useful.

`tech.sirwellington.alchemy.annotations.designs`

+ `@FluidAPIDesign`

Some of these patterns require you to also document the role of each object in the pattern.
For example, the Observer Pattern:


# Requirements

+ Java 8
+ Maven


# Building
This project builds with maven. Just run a `mvn clean install` to compile and install to your local maven repository


# Release Notes

## 1.2
+ New Annotations
	+ `@NonInstantiable`
	+ `@StatePattern`

## 1.1
+ New Annotations
	+ `@Internal`
	+ Package and Group ID rename to `tech.sirwellington`

## 1.0.0
+ Initial Release

# License

This Software is licensed under the Apache 2.0 License

http://www.apache.org/licenses/LICENSE-2.0
