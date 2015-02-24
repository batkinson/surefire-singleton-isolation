# Surefire Singleton Isolation Test

A simple maven test project useful for determining whether changes to singletons
will be visble in:

  * Test methods in the same test class
  * Test classes in the same module
  * Test classes in other modules

## Why?

I created this test when trying to find the root cause of some intermittent test
failures in Apache Continuum's test suite
[CONTINUUM-2736](http://jira.codehaus.org/browse/CONTINUUM-2736). After reading
all the of relevant documentation and determining the project's settings, I
wanted concrete verification of the runtime model so I could attempt to reason
about how to fix the issue. I am publishing it so I can reference it, and so
that others wanting to do similar verification may find it.

## Requirements

To run this program, you'll need:

  * A working installation of Apache Maven

## Running

To run the test, you just need to run:

```
mvn clean install
```

