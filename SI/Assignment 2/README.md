# Assignment 2: Service Oriented Architechture

## Part 1

### What is SOA? 
SOA is based on the design paragidgm [Service-Orientation](https://en.wikipedia.org/wiki/Service-orientation) which is based on the idea of partitioning components of the program into discrete and autonomous units. Such a unit should be able to solve their own concerns within its responsibility and will be clarified as "services".

SOA in itself is an architectural style meant to support service-orientation in software design.

One definition explains the services of SOA to be composed of four parts:

1. It logically represents a repeatable business activity with a specified outcome.
2. It is self-contained.
3. It is a black box for its consumers, meaning the consumer does not have to be aware of the service's inner workings.
4. It may be composed of other services. (source: Wikipedia)

### Which are the main building blocks of SOA architecture? 
The SOA architecture consists of 3 building blocks:

#### Service registry (Also "Broker", "Repository")
Registries can be both public and private but serve the same purpose: List and inform requesters (users, other services) of the available services.

#### Service provider
The service provider creates the service and provides information to the service registry. It is up to the service provider on how the service is defined (uses, availability, pricing) and this should then be reflected for use in the registry.

#### Service requester/consumer
The requester finds the services it needs through the registry and through the registry it will connect to the provider of the service.

The service consumer–provider relationship is governed by a standardized service contract, which has a business part, a functional part and a technical part. 


### What are the advantages and disadvantages of applying it in enterprise applications development? 

I feel like SOA would be harder to implement and/or refactor in an existing system that could be described as "monolithic". SOA is fit for one type of system (i.e. microservices) rather than another. With that said, it is not impossible, and there are definitely companies that have made the switch and applied these practices to an aready tightly coupled system.

**Advantages**
- Reusability
  - The self contained services can be used in other applications.
- Maintainability
  - Services don’t influence each other and because of that, updating, maintaining or refactoring a service only affects the service itself. 
- Testability
  - Individual services are easier to debug and test since their area of influence is limited to the service. 
- Independence
  - Services are independent of the platform, since they communicate with other applications through common language. 
- Scalable
  - A single service can be run in several instances on different servers at the same time, increasing the scalability. 
- Quality
  - The reusability of the services minimizes code redundancies, which improves the quality of the code.  
   
**Disadvantages**
- Performance/overhead
  - Services-to-service interaction requires validation of the input parameters, which reduces the performance
- Service Management
  - Service-to-service messaging growth is high and the management of this can be challenging and requires enough bandwidth for this.  
- High Cost
  - Initial investment in implementing SOA are high in terms of development and technology.

### Which basic principles should the developers of SOA consider?
This is not touched on by SOA in itself but rather by implementations of SOA. There are a number of those and therefore prnciples. The most common ones have been noted on wikipedia.

See https://en.wikipedia.org/wiki/Service-oriented_architecture#Principles.

## Part 2
Define and argument your own priority of the six values in the SOA manifesto.

The manifesto is originally written as so:

1. Business value over technical strategy
2. Strategic goals over project-specific benefits
3. Intrinsic interoperability over custom integration
4. Shared services over specific-purpose implementations 
5. Flexibility over optimization
6. Evolutionary refinement over pursuit of initial perfection 

Where each item is prioritized by the leftmost part.

I don't necessarily want to change up the order, as I'm sure the creators are more fit than I At the same time their choices make sense to me.  
If I were to prioritize any different it would be like so:

1. Business value over technical strategy
3. **Intrinsic interoperability over custom integration**
4. **Shared services over specific-purpose implementations** 
2. Strategic goals over project-specific benefits
5. Flexibility over optimization
6. Evolutionary refinement over pursuit of initial perfection

Point 3 and 4 was moved up to point 2 and 3. This is simply because I feel like point 2 may not be worth prioritizing over point 3 and 4, as I feel they should be the "standard".


## Sources
- https://en.wikipedia.org/wiki/Service-oriented_architecture
- https://en.wikipedia.org/wiki/Service-orientation
- http://www.soa-manifesto.org/
- https://www.xenonstack.com/insights/service-oriented-architecture
- https://techspirited.com/advantages-disadvantages-of-service-oriented-architecture-soa

## Other
- https://en.wikipedia.org/wiki/Web_Services_Discovery