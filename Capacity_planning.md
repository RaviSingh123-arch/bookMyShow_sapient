Assumption : 

46 MM requests per day is expected for the search flow.

each instance of our search api can handle 7 requests per second.
i.e. approx. 600 K Per day
hence no of instance required = 46 MM/ 600 K

Database Disk Space : --- Using Oracle Sizing Template

Table 1. Steps for disk space estimation for the Distributed Book My Show module

1.	number of years' worth of information to be kept in the system (retention time).	___3 years________
2.	number of orders you expect to be in the system during the time period specified in Step 1.	__1 MM_________
3.	number of booking lines present in a typical booking.	____1_______
4.	number of booking lines that are to be stored in the database (multiply the values provided in Step 2 and Step 3).	____1 MM_______
5.	booking line multiplier: Choose one of the following storage factors that most closely approximates a description of your Movie Ticket Booking Management Software system:
(a) 30 KB - This is primarily used for order management with very little customization.

(b) 35 KB - This is primarily used for order management with moderate amount of customization.

_____30 KB______
6.	Multiply the expected number of booking lines from Step 4 and the storage factor from Step 5.	____286 GB_______
7.	The minimum base storage requirement.	150 MB
8.	The minimum operational storage requirements for Booking Management Software .	500 MB
9.	Enter the total estimated storage obtained by adding the values from Step 6, Step 7, and Step 8.	_____~ 30 GB______

Table space - derived in Step 9 above
Index space - plan to allow the same amount of space as you calculated for tables. For example, if your database tables require 4 GB, add another 4 GB for index space. You may want to factor in an additional 10-20% for good measure.
Temporary space - this space is based on the products you are implementing. For example, if you are deploying only Sterling Order Management Software, this space should be at least double the size of the largest database table in your environment. If your largest table is 1 GB, plan on at least 2 GB for temporary space.
If you are installing additional products, such as Business Intelligence or Business Intelligence Operational Reports, more space is required for data warehousing and moving large amounts of data among multiple databases. For more information, see Disk sizing.

Log space - estimate 10% of the total amount of space calculated in Steps 1, 2, and 3.

Total DB space required - ~ 70 GB
