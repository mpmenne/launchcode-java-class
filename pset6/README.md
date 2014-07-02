PSET 6
======

#  Java and Data

We're going to deviate just a bit from the CS50 coursework to delve into the world of data in local style.


Practice:
----------

1.  Fork the following repository: https://github.com/MoMenne/metrolink-stl-data

2.  Watch the following [video](http://tv.launchcode.us/#/videos/sqlite?lesson=Databases) on the basics how to work with an SQLite database and this []() to brush up on your SQL

3.  Write the following queries against the databse (hint:  you can use the [GTFS Documentation](https://developers.google.com/transit/gtfs/reference) for meaning of all the fields)

* Query to list  all of the Metrolink stations (hint:  all of the metrolink stations contain the words "METROLINK STATION")

* Query to list the total number of Metrolink stations 

* Query to list of all of the arrival times at the Shrewsbury Metrolink Stations.


Coding:
--------

Great now create a maven, unit-testable, Spring-enabled project 

(Feel free to reuse the (Greedy template)[https://github.com/MoMenne/launchcode-greedy-template])

Write a command line Java app that does the following things:
*    -> Lists all of the Metrolink Stations
*    -> Asks the user what station they are currently at
*    -> Displays the amount time until the next arrives (aka 'The next train is arriving in {x} minutes')

Use JDBC to query the metrolink.db database to gather the information that you need

Email me when you're done.  Happy Coding!

