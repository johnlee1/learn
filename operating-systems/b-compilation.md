## Compiled vs Interpreted
A programming languages can be compiled, which means that programs are translated into machine language and then executed by hardware, or interpreted, which means that programs are read and executed by a software interpreter. But the distinction is not always clear-cut. Many languages can be either compiled or interpreted. Also, there are languages like Java that use a hybrid approach, compiling programs into an intermediate language and then running the translated program in an interpreter. Java uses an intermediate language called Java bytecode, which is similar to machine language, but it is executed by a software interpreter, the Java virtual machine (JVM).

## Steps of Compilation
The steps of compilation are:    
1. Preprocessing: C is one of several languages that include “preprocessing directives” that take effect before the program is compiled. For example, the #include directive causes the source code from another file to be inserted at the location of the directive.    
2. Parsing: During parsing, the compiler reads the source code and builds an internal representation of the program, called an “abstract syntax tree.” Errors detected during this step are generally syntax errors.    
3. Static checking: The compiler checks whether variables and values have the right type, whether functions are called with the right number and type of arguments, etc. Errors detected during this step are sometimes called “static semantic” errors.
4. Code generation: The compiler reads the internal representation of the program and generates machine code or byte code.
5. Linking: If the program uses values and functions defined in a library, the compiler has to find the appropriate library and include the required code.     
6. Optimization: At several points in the process, the compiler can transform the program to generate code that runs faster or uses less space. Most optimizations are simple changes that eliminate obvious waste, but some compilers perform sophisticated analyses and transformations.

## Machine Code
Machine code is binary code that is directly understandable by the CPU, and it is the language into which all programs must be converted before they can be run.

## Object Code
Object code is a compiled program. Object code is not executable, but it can be linked into an executable.

## Assembly Code
Assembly code is a human-readable form of machine code.
