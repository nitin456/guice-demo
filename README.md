Guice tries proxying classes to support a circular dependency, but it should be interface. We can verify this using this sample code.

In this Demo, there are two objects A and B which have cyclic dependency on each other. Guice is able to resolve this using proxying classes.
However, it will fail if we try to call some method of class B in the constructor of class A. 
