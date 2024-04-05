Design an application for flight inventory and booking management systems. Where every day multiple flights are flying on different sectors and flights can have multiple fares and for each fare there will be a list of seats.
Assumptions:
* There is a supplier that is providing flight data.
* Flights can have multiple fareType and for each fareType airline is providing an available
seallist.
* Il a seat is already booked, other users can't book the same seat.
* Take today's date as 1.
* For departbale simple number is provided like - 1, 2, 3, 4, ele
* For time, assume its 24 hour format and will be a decimal number.
* User fund will be a decimal number only,
Features:
* AddUser(userid, name, funds)
Return user detalls
Output:- <u1, name, funds>
* SearchFlight(from, to, departDate, paxCount)
Return available flights for given request in below format. (for the same date and if all available seats are equal or
more than provided pax count.
Output: efightNumber sirine, from, to, departDete, departTime, price, fareType,
List«seat>
Book flight(userld, from, to, flightNumber, departDate, fareType, list<seat?)
Book flight if all seats are available with the same fareType and the user has enough funds in his/her wallet. Deduct funds from userAccount for booking and return bookingld.
Hit fails, then return a proper error message.•
Bonus Question
* SearchFlightByPreferedAirline(from, to, departDate, paxCount, preferredAirline, sortBy, SortType)
Retum available flights for given request in below format

Features:
* AddUser(userld, name, funds)
Retur user details
Output:- <uf, name, funds>
* SearchFlight(from, to, departDate, paxCount)
Return available flights for given request in below format. (for the same date and if all available seats are equal or more than provided pax count).
Output:- «flightNumber, airline, from, to, departDate, departTime, price, fare Type.
List<seat>
* Book flight(userld, from, to, flightNumber, departDate, fare Type, list<seat)
Book flight if all seats are available with the same fareType and the user has enough funds in his/her wallet. Deduct funds from userAccount for booking and return bookingld.
I it fails, then retum a proper error message.
Bonus Question
* SearchFlightByPreferedAirline(from, to, departDate, paxCount, preferredAirline, sortBy, SortType)
Retur available flights for given request in below format


Output:- <flightNumber, airline, from, to, departDate, depart Time, price, List<seat»>
Create entities and service classes such that if new requirements come code will be extensible.
Commands(Test cases):
AddUser(userld, name, funds)
ADDUSER u1 Vinit 5000
ADDUSER u2 Neha 1500
SearchFlight(from, to, departDate, paxCount)
SEARCHFLIGHT DEL BLR 21
SEARCHFLIGHT DEL BLR 22
SEARCHFLIGHT DEL HYD 2 22
Book flight(userld, from, to, flightNumber, airline, departDate, fare Type, list<seat>)
BOOK u1, DEL, BOM, 111, 6e, 2, F1, 10a, 11c, 20b BOOK u1, DEL, BOM, 211, 6e, 2, F2, 10a, 11c, 20b
BOOK u2, DEL, BOM, 141, 6e, 2, F4, 32e

Book flight(userld, from, to, flightNumber, airline, departDate, fare Type, list«seat>)
BOOK u1, DEL, BOM, 111, 6e, 2, F1, 10a, 11c, 20b BOOK u1, DEL, BOM, 211, 6e, 2, F2, 10a, 11c, 20b BOOK u2, DEL, BOM, 141, 6e, 2, F4, 32e
SearchFlight(from, to, departDate, paxCount, preferredAirline, sortBy, Sort Type)
SEARCHFLIGHT DEL, BLR, 2, 1, AI, PRICE, DESC
Flight Data:
New Tab
+20
Flight No.
Airli ne
Fro m
To
Availabl e Seats
Dep art
Date
Dep art
Arriv al
Time Time e
Pric
Fare

123 6E

DEL
BLR
3

10
11
2000 F1

Seats Available
1b, 2c, 4e
123 6E

DEL
BLR
3

10
11
3000 F4

1e, 2f, 4a
234 6E

DEL
HYD
4

15
16
1000 F3

29a, 40e, 1e, 4e
456 6E

AMD
CCU
10
2
18
22
1000
0F5

7c, 7d, 12c, 5f, 8e, 7e, 4d,
Зе, 4а, 10а
987 SJ

DEL
BLR
6
2
11
16
2500
F11
12c, 5f, 4d, 3e, 4a, 10a

Guidelines:
* Do not implement user/admin authentication
* Input can be read from a file or STDIN or coded in a driver method.
* Output can be
Shubham Tiwari or STDOUT.
* Feel free to store all interim/output data in-memory.
* Restrict internet usage to looking up syntax
* You are free to use the language of your choice.
* Save your code/project by your name and email it. Your program will be executed on another machine. So, explicitly specify dependencies, if any, in your email.
Expectation
•
•
Code should be Demo-able and functionally complete.
Code should fail gracefully with a proper error message for corner/invalid cases, use exceptions for handling these cases.
* Code should be modular, try thinking in terms of Object-Oriented Design.
Input can be taken from the command line or in the main function.
* Do not use any database or NoSQL store, use in-memory data structure.
* Do not create afy Ul for the application
* Driver class can be designed as per your choice, but it should cover all the scenarios.
