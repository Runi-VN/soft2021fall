# Assignment 5 - EIP
_Scroll down for the assignment results_ 

## Subject wordlist

### EIP
_**E**nterprise **I**ntegration **P**atterns_
- Just like we have Design Patterns used for architectural choices in System Development, we have Integration Patterns used for System Integration. The patterns are proven solutions to the often-tackled problems of Enterprise Integration.
- It serves as a way to standardize integration between systems.
- It fragments the parts of the integration and therefore the problems.
- We have seen it implemented in Apache Camel.

More details: https://en.wikipedia.org/wiki/Enterprise_Integration_Patterns

### MOM
_**M**essage-**O**riented **M**iddleware_
- a software or hardware element that supports messages back and forth between distributed systems.
- reduces the complexity of messaging across infrastructure.
- Advantages of Asynchronicity(!), routing and transformation.
- Disadvantages of having an extra component in the tech stack. More work, maintenance and performance hit.
- Often found in systems with wide array of types that need to interconnect.
- Message brokers such as rabbitmq are implementations of the ideas behind MOM

More details: 
- https://en.wikipedia.org/wiki/Message-oriented_middleware
- https://stackoverflow.com/questions/3975474/what-is-message-oriented-middleware

### ETL 
_**E**xtract, **T**ransform, **L**oad. 
- This refers to the process of extracting data from source systems, transforming it into a different structure or format, and loading it into a destination.

### Related kewords:
- Data Integration
- Application Integration

## Assignment descriptiopn
Read [ch. 3](https://www.enterpriseintegrationpatterns.com/docs/EnterpriseIntegrationPatterns_HohpeWoolf_ch03.pdf) and extract at least 10 terms related to System Integration. Create a glossary of these terms.

## Glossary

These terms are, as stated, related to chapter 3 which is about messaging systems and therefore not System Integration as a whole. In no particular order:

### Channels
The applications of the system must transmit their data through a *message channel*, a virtual pipe that connects a sender to a receiver.  
This channel setup depends on the implementation and the needs of the system.

### Messages
A message is a packet of data that is transmitted on a channel. The data of an application can rarely fit within a single message and the data must therefore be parted up into more packets.

The messaging system will typically deliver the message continuously until succeeded.

Another type of message is known as an "Exchange" that holds two messages, one for "in" and one for "out". (Depends)
([More on slide 44](https://datsoftlyngby.github.io/soft2021fall/resources/ba584114-p7-eip.pdf))


### Publisher (Provider, Server)
As part of the publisher/subscriber pattern, which is often used in messaging systems, the publisher forwards messages to the subscribers of the system.

### Subscriber (Consumer, Client)
A subscriber (funnily enough) subscribes to a publisher, typically on a topic of interest, and receives and updates sent out by the publisher. It then acts accordingly as told to.

### Pipes
In the simplest exchange of messages, a message is sent from the provider to the consumer over a channel. In more advanced exchanges, the data sent may need to be validated or even transformed to be fit for the receiving system.  
For this purpose the data is run through pipes with such purpose that can be chained for performing multiple actions before it is received. There may even be more systems on the receiving end, and they may need different pipes.
  
### Filters
Closely related to pipes, filters are the actions on that happen on the pipes. A filter may be as simple as a translation or data notation, but it could also serve purposes such as verifying and authenticating data, cleaning up the data or transforming it to another standard that is fit for the receiving system.

### Routing
For larger systems it may not be feasible to try and run the various messages through the large channel infrastructure.   Instead, a *router* can be deployed that will determine how the message should navigate the channels. There may be more routers for certain parts of the channel topology.
  
### Endpoints
Implementing a messaging system in a system, be it new or already existing, will require an extra layer of code for it to interface between the application and the messaging system. These are coordinated in special endpoints depending on implementation.

### Transformation
The applications within a system may not send, receive or use the same type of data formats and messages may therefore need transformation during channel transportation. One application can use XML, but represent HTML. One may work with proprietary or custom structures, but receivers only work with JSON. Transformation typically happens in a filter.

### System
A system is a collection of applications and typically integrations with other applications or even systems. The applications within the system will work in unison for the purpose of the system.  
For our purpose here we typically look at larger systems to investigate how they interface and connect with eachother.

More details: https://en.wikipedia.org/wiki/Software_system

### Integration
Integration or System Integration is the process of combining multiple sub-systems (applications, services) into one system.

The system as a whole is dependant of the sub-systems. The sub-systems may be internal or external.

More details: https://en.wikipedia.org/wiki/System_integration

### Loose coupling 
A system is loosely coupled if its components are weakly assosciated and independant. Changes in a component should preferably not affect existing components or their performance.

A component within the system should not neccesarily depend on the knowledge of other components, but instead simply request the data necessary for its purpose. In this way, the other components can be changed out without effecting the main component.

More details: https://en.wikipedia.org/wiki/Loose_coupling


## Sources
- Slides of [week 41](https://datsoftlyngby.github.io/soft2021fall/SI/week-41/#6-application-integration-middleware)
- [Bad article with overview of EIP](https://warren2lynch.medium.com/enterprise-integration-patterns-eip-tutorial-f6d7134f67ae)
- https://www.stitchdata.com/data-integration/
