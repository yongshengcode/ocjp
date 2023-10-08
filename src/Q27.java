public class Q27 {
    
}

// Which set of commands is necessary to create and run a custom runtime image from Java source files?
// java, jdeps
// javac, jlink
// jar, jlink
// javac, jar
// Answer: B

/*
 * https://dev.java/learn/jlink/
 * 
 *  javac –module-source-path src -d out -m demoModule
 * 
 * jlink –module-path out –add-modules demoModule,java.base –output myjre
 * 
 */