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
```diff
- missing
```

### Which basic principles should the developers of SOA consider?
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

If I were to prioritize any different it would be like so:
```diff
- missing
```

## Sources
- https://en.wikipedia.org/wiki/Service-oriented_architecture
- https://en.wikipedia.org/wiki/Service-orientation
- http://www.soa-manifesto.org/

## Other
- https://en.wikipedia.org/wiki/Web_Services_Discovery