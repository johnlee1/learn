### Application
An application is a program. It is a static entity.

### Process
When an application is launched, it is loaded in memory and starts executing. A process is the state of a program when executing. It is an active entity. A single-core CPU handles one process at a time. 

### Address space
A process encapsulates all of the state of a running application. Every element of a process state has to be uniquely identified by its address. An os abstraction used to encapsulate all of the process state is an address space. An address space is defined by a range of addresses. Different types of process state will appear in different regions of the address space.

### Types of state
+ text and data
