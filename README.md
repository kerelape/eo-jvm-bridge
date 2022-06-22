<img src="https://www.yegor256.com/images/books/elegant-objects/cactus.svg" height="100px" />

[![EO principles respected here](https://www.elegantobjects.org/badge.svg)](https://www.elegantobjects.org)
[![We recommend IntelliJ IDEA](https://www.elegantobjects.org/intellij-idea.svg)](https://www.jetbrains.com/idea/)

[![License](https://img.shields.io/badge/license-MIT-green.svg)](https://github.com/kerelape/eo-native-object/blob/main/LICENSE.txt)

[EOLANG](https://www.eolang.org) Wrapper for java objects.

## How-to

### Create a java object inside EO program

```
+alias org.eolang.jvm-bridge.native-object

# Without constructor parameters
native-object "java.lang.StringBuilder"

# With constructor parameters
native-object
  "java.math.BigInteger"
  "8"
```

### Call java object methods

```
+alias org.eolang.jvm-bridge.native-object

native-object > builder 
  "java.lang.StringBuilder"

builder.append "text"
builder.to-string
```

> All methods of an object are translated to kebab-case (for example, `toString` turns into `to-string`)

## Nullability

A `native-object` can be `null` (nowhere to go, it's java), in this case it will have `is-null` attribute, being `TRUE`. If the object is not `null`,
`is-null` is `FALSE`.

If an object is `null`, dataization will throw `NullPointerException`, in other cases this will call `toString` of the java object.

## How to contribute
Fork repository, make changes, send us a pull request.
We will review your changes and apply them to the `main` branch shortly,
provided they don't violate our quality standards. To avoid frustration,
before sending us your pull request please run full Maven build:

```bash
$ mvn clean install -Pqulice
```

You will need Maven 3.3+ and Java 8+.
