# Coding Basics Project 5
## Table of Contents
1. [About The Project](#project)
    - [Built With](#built)
2. [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Installation](#installation)
3. [Usage](#usage)
4. [Contact](#contact)

## About the Project <a name=project></a>
-------------------------------
![API img](https://thefloppydisk.files.wordpress.com/2013/05/web20.png)

This project is a [command line interface](https://en.wikipedia.org/wiki/Command-line_interface) that displays json responses from the following APIs:

- [itunes](https://itunes.apple.com/search)
- [tvmaze](https://www.tvmaze.com/api)
- [Zippopotam.us](http://api.zippopotam.us/)
- [wikipedia](https://en.wikipedia.org/w/api.php)

## Getting Started <a name=getting-started></a>
-------------------------------------
To get a local copy up and running follow these simple example steps.

### Built With <a name=built></a>
I used [Java](https://go.java/?intcmp=gojava-banner-java-com) and [IntelliJ](https://www.jetbrains.com/idea/) to run debug and compile the multiple classes.

Also [Visual Studio Code](https://code.visualstudio.com/) was of great help editing and getting instant visual feedback for this README file.

 ### Prerequisites <a name=prerequisites></a>
 - the latest version of [Java](https://java.com/en/download/)
 - [Java JDK SE 7 or Higher](https://www.oracle.com/java/technologies/javase-downloads.html)

 ### Installation <a name=installation></a>
  1. Clone the Repo:
  ```console
    $ git clone https://github.com/bryantnovas/Coding-Basics-Project5.git
  ```
  2. Change into the repo's folder:
  ```console
    $ cd CodingBasicsProject5
  ```
  3. Compile and run app:
  ```console
    $ javac MyApp.java && java MyApp && clear
  ```
## Usage <a name=usage></a>
-----------------
  After the compiling is done the program will be ready to accept your inputs, this is the display message of the ```--help``` command:
  ```console
    $ --help, -h
      displays this message

    USAGE
    $ <command> [<args>]

    EXAMPLES
    $ tv the-4400
      {
        "id":39652,
        "url":"https://www.tvmaze.com/shows/39652/the-4400"

        ...
      }

    COMMANDS
      wiki            returns wikipedia json string
      zipcode         returns info on zipcode
      tv, television  returns json info on a tv show
      music           returns json info on a song
  ```

## Contact <a name=contact></a>
---------------------
Bryant Novas - [Linkedin](https://www.linkedin.com/in/bryantnovas/)

Portfolio - [Website](https://bryantnovas.github.io/)
