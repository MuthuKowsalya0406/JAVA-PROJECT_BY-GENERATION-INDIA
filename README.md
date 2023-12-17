**Activity 1 (Introduction): My First Input**
1)Open your IntelliJ Idea IDE and follow the instructions below
2)Create a project called 'MyFirstInput'
3)Create a class called MyFirstInput
4)Add a main method to your app.
5)Make your code looks like the file shown below

package com.generation.java;
import java.io.Console;

class MyFirstInput {
 public static void main(String[] args) {
   Console console = System.console();
   System.out.println("Please enter your name ");
   String name = console.readLine();

   System.out.println("My name is "+ name);
 }
}
6)Run your application.
7)Notice the prompt on the IntelliJ console asking you to enter your name.

