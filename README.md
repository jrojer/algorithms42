# 42/TUMO algorithms

Here you can find (and add) helping materials.


## Hello world steps

* Install java: use https://sdkman.io/ 
* Create and impletement `HelloWorld.java`
* Compile and run `HelloWorld`
  ```bash
  % javac HelloWorld.java
  % java HelloWorld
  Hello, World
  ```
* Create and impletement `HelloGoodbye.java`
* Compile and run `HelloGoodbye`
  ```bash
  % javac HelloGoodbye.java
  % java HelloGoodbye 123 456
  Hello 123 and 456.
  Goodbye 456 and 123.
  ```
* Create and impletement `RandomWord.java`
* Compile and run `RandomWord` with classpath
  ```bash
  % javac -cp $PWD/algs4.jar RandomWord.java
  % java -cp $PWD/algs4.jar:. RandomWord < animals8.txt
  ant
  ```
* Zip your submission
  ```bash
  zip submit.zip HelloGoodbye.java HelloWorld.java RandomWord.java
  ```
* Send `submit.zip`


## Sources
Coursera course:
* https://www.coursera.org/learn/algorithms-part1/

Official submission guide
* https://coursera.cs.princeton.edu/algs4/assignments/hello/specification.php