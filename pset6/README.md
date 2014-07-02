PSET 6
======

#  Java and Data

We're going to deviate just a bit from the CS50 coursework to delve into the world of data in local style.


Practice:
----------

1.  Fork the following repository: https://github.com/MoMenne/metrolink-stl-data

2.  Watch the following [video](http://tv.launchcode.us/#/videos/sqlite?lesson=Databases) on the basics how to work with an SQLite database

3.  Brush up on your SQL.  In this video we're going to talk about SELECTs, CREATEs, UPDATEs, JOINs, and VIEWs

4.  Watch this video on how to output text from your queries

5.  We're going to ask some questions of the Metrolink transit data (hint:  you can use the [GTFS Documentation](https://developers.google.com/transit/gtfs/reference) for meaning of all the fields)

*     ->  Write a query to list  all of the Metrolink stations (hint:  all of the metrolink stations contain the words "METROLINK STATION")

*    ->  Write a query to list the total number of Metrolink stations  (hint:  all of the metrolink stations contain the words 'METROLINK STATION')

*    ->  Write a query to list of all of the arrival times at the Shrewsbury Metrolink Stations.


Coding:
--------

Great now create a maven, unit-testable, Spring-enabled project (Feel free to reuse the (Greedy template)[https://github.com/MoMenne/launchcode-greedy-template])

Write a command line Java app that does the following things:
*    -> Lists all of the Metrolink Stations
*    -> Asks the user what station they are currently at
*    -> Displays the amount time until the next arrives (aka 'The next train is arriving in {x} minutes')

After watching the following [video]() use JDBC to query the metrolink.db database for the information you need to complete the application

Email me when you're done.  Happy Coding!

