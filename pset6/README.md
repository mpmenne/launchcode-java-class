PSET 6
======

#  Java and Data

We're going to deviate just a bit from the CS50 coursework to delve into the world of data in local style.

Tag your most recent commit and put your new changes on a branch  :-)

Steps:
1)  Fork the following repository: https://github.com/MoMenne/metrolink-stl-data

2)  Watch the following [video](http://tv.launchcode.us/#/videos/sqlite?lesson=Databases) on the basics how to work with an SQLite database

3)  Brush up on your SQL.  For this assignment you need to know about SELECTs and JOINs

4)  We're going to ask some questions of the Metrolink transit data (hint:  you can use the [GTFS Documentation](https://developers.google.com/transit/gtfs/reference) for meaning of all the fields)

    ->  Question 1:  Write a query to list  all of the Metrolink stations (hint:  all of the metrolink stations contain the words 'METROLINK STATION')

    ->  Question 2:  Write a query to list the total number of Metrolink stations  (hint:  all of the metrolink stations contain the words 'METROLINK STATION')

    ->  Question 3:  Write a query to list of all of the arrival times at the Shrewsbury Metrolink Stations.

6)  Great now create a maven, unit-testable, Spring-enabled project (Feel free to reuse the (Greedy template)[https://github.com/MoMenne/launchcode-greedy-template])

7)  Write a command line Java app that does the following things:
    1)  Lists all of the Metrolink Stations
    2)  Asks the user what station they are currently at
    3)  Displays the amount time until the next arrives (aka 'The next train is arriving in {x} minutes')

<<<<<<< HEAD
8)  After watching the following [video](http://tv.launchcode.us/#/videos/java_jdbc?lesson=Java) use JDBC to query the metrolink.db database for the information you need to complete the application
=======
Great now create a maven, unit-testable, Spring-enabled project 

(Feel free to reuse the (Greedy template)[https://github.com/MoMenne/launchcode-greedy-template])

Write a command line Java app that does the following things:
*    -> Lists all of the Metrolink Stations
*    -> Asks the user what station they are currently at
*    -> Displays the amount time until the next arrives (aka 'The next train is arriving in {x} minutes')

Use [JDBC](http://tv.launchcode.us/#/videos/java_jdbc?lesson=Java) to query the metrolink.db database to gather the information that you need
>>>>>>> 706635db37ead2d21818c97f4f4d52473ea73aff

Email me when you're done.  Happy Coding!

