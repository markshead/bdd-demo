
This is a very simple demo web application designed as a starting point
interviews, training or just experimenting. This demo application uses:

* AngularJS - UI framework
* Spring - Dependency injection
* Bootstrap - CSS styling
* Selenium - Control a web browser for UI testing
* Cucumber - Behavior Based Development
* JUnit - Unit testing

There is a single page in the application with one section that lets
you increment a counter and another that lets you add two numbers. Both
of these features communicate with a Spring controller using REST. The 
controller then uses the corresponding service to do the work.

The services are tested with unit tests (that end in Test) and the 
controllers are tested with integration tests (that end in IT). Cucumber
is triggered by RunCucumberIT as an integration tests. It will read and 
execute the .feature files by locating the corresponding steps file (for
example DemoSteps.java) and running the correct code for each step. 

The steps file will interact with the UI using the Page Object pattern.
For example, DemoPage contains the code that tells Selenium how to 
interact with the page. (This gives you a single place to update if
you rename CSS ids or classes for a particular page.)

One problem with many interviews that use coding is that they check the
wrong things. Tricky computer science questions may be fun, but 
there are a number of jobs out there where your ability to modify an
existing application following the existing patterns is more important
than how quickly you can write a recursive factorial algorithm on a 
whiteboard.
 
A suggested project for someone you are wanting to interview would be to
take this project and use TDD and BDD to add a new section to the front 
page that takes a number as an input and returns it as a Roman Numeral.

Some basics for getting the demo app up and running:

####Run all the unit tests:
```mvn test```

####Start the web app, run the tests and then shut it back down:
```mvn verify```

####Start the web app using Maven on http://localhost:8080:
```mvn spring-boot:run```

####Start the web app from inside an IDE:
Run the main method in DemoApplication.java

##Angular 5
The angular-5 branch contains an [Angular 5](https://angular.io/guide/quickstart) implementation of the demo. The angular-cli build system is embedded in maven build lifecycle phases. The integration is done as follows :-

* Node & NPM installation is done when maven starts.
* ```npm install``` is done 
* ```npm -no-optional -g angular-cli``` is done in order to install ```angular-cli```.
* In the ```package``` lifecycle phase, ```npm run-script build``` is called to build the angular-js project located in ```src/main/angular``` folder.
* For live loading, ```ng build --watch``` is called in the ```prepare-package``` phase in a separate thread. This thread is terminated when maven shuts down.
