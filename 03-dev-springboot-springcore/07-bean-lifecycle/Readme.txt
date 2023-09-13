Bean Life Cycle Methoed

1 . Container Started
2 . Beans Will get instantiated
3 . Dependencies Will get Injected
4 . Internal Spring Processing
5 . Your Custom init methods
6 . Bean is Ready For Use
7 . Container Shutdown
8 . Custom Destroy Methods
9 . Stop

##Notes

Prototype Beans and Destroy Lifecycle
There is a subtle point you need to be aware of with "prototype" scoped beans.

For "prototype" scoped beans, Spring does not call the destroy method. Gasp!
---
In contrast to the other scopes, Spring does not manage the complete lifecycle of a prototype bean: the container instantiates, configures, and otherwise assembles a prototype object, and hands it to the client, with no further record of that prototype instance.
Thus, although initialization lifecycle callback methods are called on all objects regardless of scope, in the case of prototypes, configured destruction lifecycle callbacks are not called. The client code must clean up prototype-scoped objects and release expensive resources that the prototype bean(s) are holding.

Prototype Beans and Lazy Initialization
Prototype beans are lazy by default. There is no need to use the @Lazy annotation for prototype scopes beans.


