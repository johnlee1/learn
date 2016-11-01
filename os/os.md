### Operating system?
An operating system is software that abstracts and arbitrates the underlying hardware system.

### User Mode
In user mode, access to memory is limited to only some memory locations, and access to peripheral devices is denied. The ability to keep or relinquish the CPU is removed, and the CPU can be taken away from a program at any time.

### Kernel Mode
In kernel mode, the CPU has instructions to manage memory and how it can be accessed, plus the ability to access peripheral devices like disks and network cards. The CPU can also switch itself from one running program to another.

### Switching from User Mode to Kernel Mode
In the CPU, there is a privilege bit which records what mode the CPU is in: user or kernel mode. It should be obvious that we don't want user-mode programs to easily switch back to kernel mode; that would make the two privilege levels useless. At the same time, a user-mode program does need to cross into kernel mode. For example, when a program wants to read from disk, or get a line of text from the keyboard, it cannot do this in user mode. The only software which can is the operating system. The program needs to ask the operating system: "please access the hardware on my behalf and get me some input". We need a mechanism whereby a user-mode program can switch into kernel mode, but have no control over the instructions which will be performed in kernel mode. This mechanism is the **system call**, which is implemented in the CPU as the **trap instruction**.  
  
Here is how it works:
+ The user-mode program places values in registers, or creates a stack frame with arguments, to indicate what specific service it requires from the operating system.
+ The user-mode program then performs the trap instruction.
+ Immediately, the CPU switches to kernel mode, and jumps to instructions at a fixed location in memory.
+ These instruction, which are part of the operating system, have memory protections so that they cannot be modified by user-mode programs, and may also be unreadable by user-mode programs.
+ The instructions, known as the trap or **system call handler**, read the details of the requested service + arguments, and then perform this request in kernel mode.
+ With the system call done, the operating system resets the mode to user-mode and returns from the system call, or there is an instruction to do both at the same time.
  
From the point of view of the user-mode program, the trap instruction performs "magic" in a single instruction, with the results available at the next instruction. In reality, the CPU jumps in kernel mode to the system call handler, which does the work and returns to the program in user-mode.
