# F1Project

DESIGN

Classes are as follows - 

Ferrari – abstract class, contains all the fields that are later inherited by child classes, contains abstract getter and setter functions later overridden by child classes, contains object arrays for Driver, Car and Race classes and functions to print a list of them, contains functions setFile(..) and getFile(..) to manipulate files, contains static variables countDriver, countCar and countRace that get updated every time a new object of the sub class is created

Driver – inherits all fields from Ferrari, contains parametrized constructor, contains array to store results of a driver (index = race ID), overrides setInfo() and getInfo() from Ferrari to handle driver data, contains isEligible() that uses exception handling (checks age and exp) and returns true if a driver is eligible to race

Car – inherits all fields from Ferrari, contains parametrized constructor, contains getter and setter functions for car data, contains static getSpeed() that is overridden from interface iCar, it factors in the downforce and weight of the car and returns a value for max speed of the car

Statistics – overrides getPoints(..) and getPrize(..) from interface iStats that return points scored and prize money earned depending on race result, contains static functions sortByResult() and carTest() that use Selection Sort and Bubble Sort to return decreasing order lists of races by pts scored and cars by their speed

TestClass – contains main function, contains main menu, sub menu static functions

Architecture
![Capture](https://user-images.githubusercontent.com/58221605/144983554-8306e373-b29e-474b-8c8f-0e88c3b6d58b.PNG)

