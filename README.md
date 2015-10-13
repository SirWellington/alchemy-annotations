Documentation Annotations
==============================================

[![Build Status](https://travis-ci.org/SirWellington/alchemy-annotations.svg)](https://travis-ci.org/SirWellington/alchemy-annotations)

# Purpose

Contains annotations which allow Java Developers to more clearly document code. 
It can be used to document intent, expectations, behaviors, structure, and more.

# Why use this

It makes it much easier for other developers and architects to understand what is going on in the code base.
It also allows us to more explicitly document intent and expectations, reducing the chance for human mistake.

For example, by applying the `@StrategyPattern` annotation to a few classes, we know exactly what relation is intended between
the classes.

# Requirements

* JDK 8
* Maven

# License

This Software is licensed under the Apache 2.0 License


# Building
This project builds with maven. Just run a `mvn clean install` to compile and install to your local maven repository


# Download

> This library is not yet available on Maven Central

To use, simply add the following maven dependency.

## Release
```xml
<dependency>
	<groupId>sir.wellington.alchemy</groupId>
	<artifactId>alchemy-annotations</artifactId>
	<version>1.0</version>
</dependency>
```


## JitPack 

You can also use [JitPack.io](https://jitpack.io/#SirWellington/alchemy-annotations/v1.0.0).

```xml
<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>
```

```xml
<dependency>
    <groupId>com.github.SirWellington</groupId>
    <artifactId>alchemy-annotations</artifactId>
    <version>v1.0.0</version>
</dependency>
```

# API
 Applying anotations is simple.

## Arguments
Documentation for arguments or fields.

+ `@Nullable` - Indicates that a parameter or field can be `null`. I.E., `null` is an acceptable value.
+ `@NonNull` - Indicates that a parameter or field that should never be `null`. I.E., it's an error condition if it is `null`.
+ `@NonEmpty` - Indicates that `String`, `Array`, `Collection`, or similar type should never be empty. 

### Examples

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

+ `@BuilderPattern`
+ `@FactoryPattern`
+ `@AbstractFactoryPattern`
+ `@StrategyPattern`
+ `@DecoratorPattern`
+ `@FluidAPIPattern`
+ `@SingletonPattern`
+ `@ObserverPattern`
+ `@FluidAPIPattern`

Some of these patterns require you to also document the role of each object in the pattern. 
For example, the Observer Pattern:

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

# Release Notes


## 1.1


## 1.0.0
+ Initial Release