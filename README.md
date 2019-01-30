# KreasITindo Coding Assesment Solution
## The Goal: Name Sorter
Build a name sorter. Given a set of names, order that set first by last name, then by any given
names the person may have. A name must have at least 1 given name and may have up to 3 given
names.
## Assesment Criteria
We will execute your submission against a list with a thousand names. Your submission must
meet the following criteria:
- The solution should be available for review on github.
- The names should be sorted correctly.
- It should print the sorted list of names to screen.
- It should write/overwrite the sorted list of names to a file called sorted-names-list.txt.
Unit tests should exist.
- Minimal, practical documentation should exist.
## Installation
### Build and Compile
If you build code directly, you need JDK installed. For [installtion](https://www.oracle.com/technetwork/java/javase/downloads/index.html).
Extract the code and compile it
```
javac -d output src\com\navri\*.java
```
Copy the *unsorted file* at **output** directory

## Run
After that go to output directory
```
cd output
```
and run 
```
java com.navri.namesorter *(your file name)*
```
