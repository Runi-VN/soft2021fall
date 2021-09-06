# System Integration Assignment 1 - DDD


## What is DDD?
DDD stands for **D**omain-**D**riven **D**esign and is a concept that the structure and content of an application should match its business domain.

Domain, in this context, means "subject area" and it is on this area that the other departments (development, design, ...) base their work on.

It ties the connection between the real-world system with the software structure and the business language. For example, if a software processes loan applications, it might have classes such as `LoanApplication` and `Customer`, and methods such as `AcceptOffer` and `Withdraw`.

If all the domains matches the others it becomes easier to talk across departments and makes several tasks easier. It is of particular use for complex systems, but requires all parts to be aware and utilizing DDD at all times.

## When did it originate?

The term was coined by Eric Evans in his book of the same title (2003).  
*Domain-Driven Design: Tackling Complexity in the Heart of Software* by Eric Evans, 2003,  ISBN: 0-321-12521-5

## Which problems did it address?
The complexity of large systems, in particular between departments and across the different developing stages.

## Which are the basic concepts and building blocks of a domain model
DDD consists of high-level concepts and practices. It typically ties together with the layers of the [Multitier architecture](https://en.wikipedia.org/wiki/Multitier_architecture) but can be based on any architecture that fits the context.

The software operates within its domain, or its "subject area". The subject area has a certain context, or meaning, for certain words and statements. The developers will build their *domain model* solely based on this domain and its context.

It is worth noting the difference between domain context and "bounded context", which is the context within a subsystem of the domain.

- Models
  - **Entities**: A simple object defined by its its identity (i.e. airline seat number)
  - **Value Object**: 
  - **(Domain) events**: Occurences of particular interest not only in the business logic
  - **Model aggregations**: Models can depend on on a root model. A `Car` object can be an aggregate of several other objects (engine, tires, brakes, etc)  

Objects are often not created by itself, but rather by another component:
- **Repository**: Object that retrieves domain objects from a data store (database)
- **Factory**: Object with methods that creates domain objects.
- **Service**: Objects that encapsulate behavior of the business domain but doesn't fit in the domain objects themselves.

An interpretation of objects can be found [here](https://martinfowler.com/bliki/EvansClassification.html). 

## How does DDD relate to microservices architecture?
In DDD, *when part of a programs functionality does not belong to an object, it is typically expressed as a service.* (\-Wikipedia)  
This fits well with the ideas of microservices where we also divide each subsystem into its own, bounded domain, to have its own purpose in the larger domain.

*([Relevant Microsoft Article](https://docs.microsoft.com/en-us/dotnet/architecture/microservices/microservice-ddd-cqrs-patterns/ddd-oriented-microservice))*

---
## Sources 
- https://en.wikipedia.org/wiki/Domain-driven_design  
- https://www.dddcommunity.org/
- https://martinfowler.com/bliki/EvansClassification.html
- https://domaindrivendesign.org
  - https://domaindrivendesign.org/the-main-goal-of-domain-driven-design/

### Useful resources
- https://www.infoq.com/articles/ddd-in-practice/
- https://en.wikipedia.org/wiki/Object-oriented_analysis_and_design
- [martinfowler.com/articles/microservices.html](https://martinfowler.com/articles/microservices.html)
- [martinfowler.com/bliki/DomainDrivenDesign.html](https://martinfowler.com/bliki/DomainDrivenDesign.html)
- [confluent.io/blog/microservices-apache-kafka-domain-driven-design/](https://www.confluent.io/blog/microservices-apache-kafka-domain-driven-design/)
- [simpleprogrammer.com/importance-domain-driven-design/](https://simpleprogrammer.com/importance-domain-driven-design/)
- [medium.com/microtica/the-concept-of-domain-driven-design-explained](https://medium.com/microtica/the-concept-of-domain-driven-design-explained-3184c0fd7c3f)
- [medium.com/ssense-tech/domain-driven-design-everything-you-always-wanted-to-know-about-it-but-were-afraid-to-ask](https://medium.com/ssense-tech/domain-driven-design-everything-you-always-wanted-to-know-about-it-but-were-afraid-to-ask-a85e7b74497a)
- [airbrake.io/blog/software-design/domain-driven-design](https://airbrake.io/blog/software-design/domain-driven-design)
- [towardsdatascience.com/what-is-domain-driven-design](https://towardsdatascience.com/what-is-domain-driven-design-5ea1e98285e4)
- [lucidchart.com/blog/domain-driven-design-introduction](https://www.lucidchart.com/blog/domain-driven-design-introduction)
- [Driven%20Design%20Quickly.pdf](https://matfrs2.github.io/RS2/predavanja/literatura/Avram%20A,%20Marinescu%20F.%20-%20Domain%20Driven%20Design%20Quickly.pdf)
- [stackoverflow.com/questions/1222392/what-is-domain-driven-design](https://stackoverflow.com/questions/1222392/what-is-domain-driven-design-ddd/1222488#1222488)