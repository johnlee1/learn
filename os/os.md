### Operating system
An operating system is software that abstracts and arbitrates the underlying hardware system.

### User Mode and Kernel Mode
A processor has two different modes: user mode and kernel mode. The processor switches between the two modes depending on what type of code is running on the processor. Applications run in user mode, and core operating system components run in kernel mode. While many drivers run in kernel mode, some drivers may run in user mode.

### User Mode
In user mode, the executing code has no ability to directly access hardware or reference memory. Code running in user mode must delegate to system APIs to access hardware or memory.

### Kernel Mode
In kernel mode, the executing code has complete and unrestricted access to the underlying hardware. It can execute any CPU instruction and reference any memory address. Kernel mode is generally reserved for the lowest-level, most trusted functions of the operating system.

### Switching from User Mode to Kernel Mode
In the CPU, there is a privilege bit which records what mode the CPU is in: user or kernel mode. We don't want user mode programs to easily switch to kernel mode; that would make the two privilege levels useless. At the same time, a user mode program does need to cross into kernel mode. For example, when a program wants to read from disk, or get a line of text from the keyboard, it cannot do this in user mode. The only software which can is the operating system. The program needs to ask the operating system: "please access the hardware on my behalf and get me some input". We need a mechanism whereby a user mode program can switch into kernel mode, but have no control over the instructions which will be performed in kernel mode. This mechanism is the system call, which is implemented in the CPU as the trap instruction.  
  
Here is how it works:
+ The user mode program places values in registers, or creates a stack frame with arguments, to indicate what specific service it requires from the operating system.
+ The user mode program then performs the trap instruction.
+ Immediately, the CPU switches to kernel mode, and jumps to instructions at a fixed location in memory.
+ These instruction, which are part of the operating system, have memory protections so that they cannot be modified by user mode programs, and may also be unreadable by user mode programs.
+ The instructions, known as the trap or system call handler, read the details of the requested service and arguments, and then perform this request in kernel mode.
+ With the system call done, the operating system resets the mode to user mode and returns from the system call, or there is an instruction to do both at the same time.
  
From the point of view of the user mode program, the trap instruction performs "magic" in a single instruction, with the results available at the next instruction. In reality, the CPU jumps in kernel mode to the system call handler, which does the work and returns to the program in user mode.

### System Call
A system call is the programmatic way in which a computer program requests a service from the kernel of the operating system it is executed on. System calls provide an essential interface between a process and the operating system.

### Summary
A system call is a request made via a software interrupt by an active process for a service performed by the kernel.  

A process is an executing (i.e., running) instance of a program. An active process is a process that is currently progressing in the CPU, as contrasted with processes that are waiting for their next turns in the CPU.  

An interrupt is a signal to the kernel that an event has occurred, and this results in changes in the sequence of instructions that is executed by the CPU. A software interrupt, also referred to as an exception, is an interrupt that originates in software, usually by a program in user mode.  

User mode is one of two distinct execution modes of operation for the CPU in Linux. It is a non-privileged mode in which each process starts out. It is non-privileged in that processes in this mode are not allowed to access those portions of memory that have been allocated to the kernel or to other programs.  

The kernel is a program that constitutes the core of an operating system, and it has complete control over all resources on the system and everything that occurs on it. When a user mode process (i.e., a process currently in user mode) wants to utilize a service provided by the kernel (i.e., access system resources other than the limited memory space that is allocated to the user program), it must switch temporarily into kernel mode, also called system mode, by means of a system call.  

Kernel mode has root (i.e., administrative) privileges, including root access permissions (i.e., permission to access any memory space or other resources on the system). This allows the operating system to perform restricted actions such as accessing hardware devices or the memory management unit. When the kernel has satisfied the request made by a process, it restores that process to user mode. 

System calls can also be viewed as clearly-defined, direct entry points into the kernel through which programs request services from the kernel. They allow programs to perform tasks that would not normally be permitted.  

Examples of the services performed by the kernel include input/output and process creation. The former can be defined as any movement of data to or from the combination of the CPU and main memory (i.e. RAM), that is, communication between this combination and the computer's users (e.g., via the keyboard or mouse), its storage devices (e.g., disk or tape drives) or other computers. Process creation is the creation of a new process.
