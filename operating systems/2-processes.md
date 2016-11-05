### Application
An application is a program. It is a static entity.

### Process
When an application is launched, it is loaded in memory and starts executing. A process is the state of a program when executing. It is an active entity. A single-core CPU handles one process at a time. 

### Address Space
A process encapsulates all of the state of a running application. Every element of a process state has to be uniquely identified by its address. An OS abstraction used to encapsulate all of the process state is an address space. An address space is defined by a range of addresses. Different types of process state will appear in different regions of the address space. These addresses are virtual addresses. They do not have to correspond to actual locations in the physical memory.

### Types of Address Space state
+ text and data
  * static data when process first loads
+ heap
  * dynamically created state during execution
+ stack
  * dynamic part of address space state that grows and shrinks as a LIFO queue
  
### Page Tables
A page table stores the mapping between virtual addresses and physical addresses.

### Process Control Block
A process control block is a data structure in the operating system kernel containing the information needed to manage a particular process. It can be said that the set of the PCBs defines the current state of the operating system.

### Context Switch
A context switch is the mechanism used by an operating system to switch from the context of one process to the context of another process. Context switches are usually expensive because of the number of cycles that have to be executed to load and store all the values of the PCBs to and from memory, and because it can create a a cold cache.

### Process states
+ new
 * the process is being created
+ ready
 * the process is waiting to be assigned to a processor
+ running
 * instructions are being executed
+ waiting
 * the process is waiting for some event to occur
+ termianted
 * the process has finished execution
 
### Process creation
+ fork
 * copies the parent PCB into new child PCB
 * child continues execution at instruction immediately after fork
+ exec
 * replace child image
 * load new program and start from first instruction
 
The fork call basically makes a duplicate of the current process, identical in almost every way. The exec call is a way to basically replace the entire current process with a new program. It loads the program into the current process space and runs it from the entry point. So, fork and exec are often used in sequence to get a new program running as a child of a current process.

### CPU scheduler
A CPU scheduler is an operating system component that manages how processes use CPU resources. It determines which one of the currently ready processes will be dispatched to the CPU to start running, and how long it should run for.

In order to manage the CPU, OS must be able to:
+ preempt
 * interrupt and save current context
+ schedule
 * run scheduler to choose next process
+ dispatch
 * dispatch process and switch into its context
 
### Inter-Process Communication (IPC)
+ message-passing
 * OS provides communication channel, like shared buffer
 * processes message to/from channel
 * beneficial because OS manages channels and provides the exact same APIs (system calls) for writing/sending data and reading/receiving data from the communication channel
 * the downside is the overhead of every piece of information being copied from a process into a channel and then into the address space of another process
+ shared memory
 * OS establishes shared memory channel and maps it into each process address space
 * processes directly read/write from this memory
 * beneficial because OS is out of the way (so no overheads from the OS)
 * the downside is that without OS, there are no fixed or well-defined APIs of how the shared memory region is used

With shared-memory based communication the individual data exchange is cheap because they don't require that the data is copied in and out of the kernel. However, the actual operation of mapping memory between two processes is expensive. It only makes sense to do shared-memory based communication if the setup cost can be amortized across a sufficiently large number of messages.
