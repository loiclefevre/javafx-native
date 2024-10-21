# JavaFX Native Demo

This is a demo of a JavaFX application generated as a native image (for Windows) thanks to GraalVM (JDK 23). It uses the Native image plugin for Maven (version 0.10.3).

## How to build?

To build it, you need to first follow [installation instructions for Visual Studio Build Tools for Windows](https://medium.com/graalvm/using-graalvm-and-native-image-on-windows-10-9954dc071311).

Then, you'll need to configure properly your Maven environment, either using `.idea/workspace.xml` if you're using Intellij IDEA or your shell if using Maven.

Build using: `mvn verify`
