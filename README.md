Alchemy Annotations
==============================================

[![Build Status](https://travis-ci.org/SirWellington/alchemy-annotations.svg)](https://travis-ci.org/SirWellington/alchemy-annotations)

# Purpose

Contains annotations which allow Java Developers to more clearly document code.
It can be used to document intent, expectations, behaviors, structure, and more.

# Why use this

It makes it much easier for other developers and architects to understand what is going on in the code base.
It also allows us to more explicitly document intent and expectations, reducing the chance for human mistake.

For example, by applying the `@StrategyPattern` annotation to a few classes, we know can more easily understand the
relationship between them.

# Requirements

+ JDK 8
+ Maven


# Building
This project builds with maven. Just run a `mvn clean install` to compile and install to your local maven repository


# Download

To use, simply add the following maven dependency.

## Release
```xml
<dependency>
	<groupId>tech.sirwellington.alchemy</groupId>
	<artifactId>alchemy-annotations</artifactId>
	<version>1.1</version>
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
	<version>1.2-SNAPSHOT</version>
</dependency>
```

# API
 Applying annotations is simple.

## Arguments
Documentation for arguments or fields.

+ `@Nullable` - Indicates that a parameter or field can be `null`. I.E., `null` is an acceptable value.
+ `@NonNull` - Indicates that a parameter or field that should never be `null`. I.E., it's an error condition if it is `null`.
+ `@NonEmpty` - Indicates that `String`, `Array`, `Collection`, or similar type should never be empty.

### Example Uses

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

### Examples
```java

@ThreadUnsafe
class PizzaFactory
{
	Pizza makePizza()
	{
		return new Pizza("Tasty!");
	}
}

class PizzaStore
{
	//Can also be used on variables
	@ThreadUnsafe
	private final PizzaFactory factory;

	...

	void serveCustomer()
	{
		//Handle synchronization
		synchronized (factory)
		{
			Pizza pizza = factory.makePizza();
			...
		}
	}
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
+ `@FluidAPIPattern`
+ `@SingletonPattern`
+ `@ObserverPattern`
+ `@StatePattern`

### Examples

```java

@ObserverPattern(SUBJECT)
class Apple
{
...
}

@ObserverPattern(OBSERVER)
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

+ `@FluidAPIPattern`

Some of these patterns require you to also document the role of each object in the pattern.
For example, the Observer Pattern:


# License

This Software is licensed under the Apache 2.0 License

http://www.apache.org/licenses/LICENSE-2.0

# Release Notes

## 1.2
+ New Annotations
	+ `@NonInstantiable`

## 1.1
+ New Annotations
	+ `@Internal`
	+ Package and Group ID rename to `tech.sirwellington`

## 1.0.0
+ Initial Release
