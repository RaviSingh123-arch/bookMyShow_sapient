# bookMyShow_sapient
Book My Show Implementation - Domain Exercise

Problem statement
XYZ wants to build an online movie ticket booking platform that caters to both B2B (theatre partners) and B2C (end customers) clients.

Key goals it wants accomplished as part of its solution:
•	Enable theatre partners to onboard their theatres over this platform and get access to a bigger customer base while going digital. 

•	Enable end customers to browse the platform to get access to movies across different cities, languages, and genres, as well as book tickets in advance with a seamless experience.



Technologies recommended
•	Language -Java and other add-on languages
•	Frameworks- Any
•	Database - Any
•	Integration technologies- Any
•	Cloud technologies- Any
•	Preferred editor to build and present solution

Evaluation criteria
•	Code implementation and completeness (APIs and Design Patterns)
•	Design principles to address functional requirement and non-functional requirement
•	Platform solutions detailing
•	Solution completeness, presentation, and discussion.
•	Solution coverage uniqueness and extensibility.

Note: Incomplete solution component would be discussed during discussion round.
You can skip solution areas that you are not comfortable by making a note of it.

Functional features to implement (Mandatory - Code Implementation):

Anyone of the following read scenarios: (Only Service Implementation needed/ No UI required)
•	Browse theatres currently running the show (movie selected) in the town, including show timing by a chosen date
•	Booking platform offers in selected cities and theatres
o	50% discount on the third ticket
o	Tickets booked for the afternoon show get a 20% discount

Anyone of the following write scenarios: (Only Service implementation needed-No UI required)
•	Book movie tickets by selecting a theatre, timing, and preferred seats for the day
•	Theatres can create, update, and delete shows for the day.
•	Bulk booking and cancellation
•	Theatres can allocate seat inventory and update them for the show

Non-functional requirements-(Mandatory -Design/Arch solution & Optional Implementation): 
•	Describe transactional scenarios and design decisions to address the same.
•	Integrate with theatres having existing IT system and new theatres and localization(movies)
•	How will you scale to multiple cities, countries and guarantee platform availability of 99.99%?
•	Integration with payment gateways
•	How do you monetize platform?
•	How to protect against OWASP top 10 threats.


Platform provisioning, sizing & Release requirements: (Mandatory-Architecture artifacts)
•	Discuss your technology choices and decisions through key drivers
•	Discuss database, transactions, and data modelling.
•	Discuss enterprise systems that you may need to manage specific areas.
•	Discuss hosting solution and sizing (Cloud / Hybrid/ Multi cloud)- Any
•	Discuss release management across cities, languages etc
•	Provide details on monitoring solution
•	Discuss overall KPIs 
•	Create a high-level project plan and estimates breakup.

Product management and Stakeholder management
•	Please talk about stakeholder management instances 
o	What decisions and actions were taken for decision closure?
•	Overall technology management 
•	Enabling team and introducing efficiencies
•	Delivery planning and estimates


Disclaimer:
This document is meant to assess your technical skills and is classified as "Sapient confidential". This document by any means shall not be used/shared without permission from Sapient, non-adherence to this can get your candidature blocked for employment with Sapient. 

<div class="mxgraph" style="max-width:100%;border:1px solid transparent;" data-mxgraph="{&quot;highlight&quot;:&quot;#0000ff&quot;,&quot;nav&quot;:true,&quot;resize&quot;:true,&quot;toolbar&quot;:&quot;zoom layers tags lightbox&quot;,&quot;edit&quot;:&quot;_blank&quot;,&quot;xml&quot;:&quot;&lt;mxfile host=\&quot;app.diagrams.net\&quot; modified=\&quot;2022-09-05T03:05:10.580Z\&quot; agent=\&quot;5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36\&quot; etag=\&quot;VIYgBtewI-oeyygIzKyY\&quot; version=\&quot;20.2.8\&quot; type=\&quot;github\&quot;&gt;&lt;diagram id=\&quot;R2lEEEUBdFMjLlhIrx00\&quot; name=\&quot;Page-1\&quot;&gt;7V3bcuK4Fv0aHpOyfAnw2KSTzqkkPZmkz5k5T1MKVsATY1O2SMJ8/ch3sIyRwHepqqs6FkaA9vJa2hdJI+169fXDg+vlo2sie6Qq5tdI+z5SVTAGE/Jf0LKNWwxDiVoWnmXGbVnDi/UPihuT2zaWify9G7Hr2tha7zfOXcdBc7zXBj3P/dy/7c219z91DReIaniZQ5tu/cMy8TJqnSS/Imi/Q9ZimXwyUOJXVjC5OW7wl9B0P/ea0Be+dR0cf8Un5K2ggxxMXnmE3jvyRsbNEuPgl34bqbfk31tw9+XCdRc2gmvLv5y7K9I898ktt29wZdnBOO90NIs7Ih+n3Yy0a891cfTX6usa2YGxEjNE3+n2wKvpOHhBvwxvuL742D68K9i5+9T+hx8fF0/j1ws16uUD2pt4fB/dDwvFA4S3yaiTsVoHf2L4GjTNfAw9HINDU0gDMTeGlkN+mfYdhNe2Dde+Fd4etSwt23yAW3eDk46Sq9mb9YXM5wgbwb0EJg+ks+Ay6DwY5Zf4ywQvQ9taOOTvOfnpwSfOPOST7/IAfRzfQQ9OPF4fyMPoa6cpHqwfyF0h7G3JLfGr2lUMivhJ0a+iy88MdSC5ZbmDuGncBmMULdKeM+OQP2L7cNhKo2x10Ezkh2ML2s/kAYTOIrTYvkGCUTU9d/0LeguE44a1awXjefOBokcgHHrLtq9d2w3s6rgOSm4Lf5wxI//Iz71WLo2RQb7ANbkG2TX5F9zu4WvX8bFH8BF8FCJm+kSBqWbYXcefY6O35Gt48VgGf7+6GJMn6pBRSzF93NKxZTWFzbJaXZbVKcs+3fPY1iW/9c0OuWxpmSZyogcy4F+Y2bvAlIXjn4553hj5x5DRHhqzPXYMoHGOf9xZNircvUGbYN+BGM3cjWP6lFHT73m6nQ3KzquAbf/6j9lBayckG90789dwbjmLh+idVzk4GHXA4Wt08PGsFh5M3TWAjyuRGV6pkeGv2mb48VmWbeiJZxz9K+bRHzqfTyirOnB1ePLcYS6v3PTCcbdKT89nrvtOhvkgHgRypoCx70wBA1waNDR0g7alqkySWyunZZWeeQukuDw+FfusrcSpKjJvbZKr0rPtIXlVKXSlDKv0vPk1ot6/LJE8Kw5IlMgz4HxIj8gzS3dNYOS8GXjPmZ7Ht+Jm+iLnqlmmp+fht/eggw8+qwnGzCYYPLVPKdP6S/ezp7xevf2HzOPTi3fN0e/M6e3f8+f7d2t+90O7SLIrLDweGvc5MPts6XrWP4FXZce22vW5wutPa2VDB90haOaaZm6YLD0AEVZlGBTlTxuk/GIYAAoGt/ecil7rTF45QDu0ScphLpQEFA+FSpnaRxBzJk3ansY3hwfhJGHCkTaRklCXJACVUROS2U3lmjChXbzbe204mjCpLPFSZgJ+Tcj31sQjT3t8Gx95YmkCBx44NeF0fDB118SkQWpCFzRBH7ftJxRpgj4cTZgKmYwvHgpaE8ij4fhwji3XIcpwrY6+KS2bvlGfoTZ96L/PADSOalopELUJxLhtgQDauSUAlXMEMq2kP3AeA2Qol/IANLoeIM4Sv2CIN37XlaEhHIgnBXR88WXuITK+pXowEqJu6wLkVsFoakHZ1rjgEU/fWANln8nYvU7lFxu2HNlnFW0VGbc+OR7MUphy6Eo9BrQc+yHt9jS3f7xm61xElCizXm1JNUt3TUBEroepi+iLaraaJfqiwFw/arbKsSqZHdCBuBMS9l3h9ertLyCPy2xMBzi/qGirWc6/KiJ9PknvcjImw7kUAXBVkI5ZEhnwkFBJeh5MiCcMdHW3nOBXQ/aF5ViNsn3yBfq25r0cqZLZ0yDyEFe9n2t84Shcp8N4L0ti2dLp/UjM3MmFVrCFWBEnp/vRVU7KutAhNY5IfYrr/uROdNq7GlLuRJfOVToUBRG2/q6KPDFzwoEH4VTZkKvd66L51jMnRn9Xu5djVfK6QcdDog0i+0ns1QNAOCLXZYSsLiJvPR2SbIk2FCLXZYwsNS0dI+t1cVP1CBCOyYFCR8oOQkEmweti/fbzIkChY3CDyoIr7EYZug4AhXbEw1ooPhloOyrTICIE1AXan5e60LwuGO3rwrm+XpdXIqYol6IAAO34mRsPhsvUnRdEDGkOejUiBxaEkwNDPZMEZMDnIMVP2qZ447yVi90K96RIlYxu0KsWw9nYL2vQdVEcCBCOx4FChwApKCBzgRIfiwy1hbfPyA7nATfZK5EnFs3rgRrM/PHKjmdkyDG/BWdqksubZwKFX+4jdLaBuYMfhpJ5P+nb2/65e/H/4OLSSC6/f+2++D1xDtCXhf9MPor8vfMucpW9KbhI3kNjJwlpuxtvjhjghBO1Gh3ZHzkYPlbeSY8B3VujnjR64bB/oL0vXAK+p0AcM1gnmIuFRp3k8Bb99PhNGdaofkCuI5DvKBoaqqPqQMsw+2gctOA00CpVg7bsNLtdzJYmOTuDWTVXnDiuCLNNQ1ajo6n/9aMDdkUvQNVBjpdAkfwW7MKSBkNq2LtD6Mokrq0i2OvbWjhy6cB3pmOZQypBzdArfR6g0eHKE/bg7YrLc/L2HfKsjsODwxPMkqmN2nShyQOaDgDh3C27upzakIGwnbGgI2G8iwP7ls2oJgrWewXYTG+9v9988Ae+u/h9DJX3+cO3C8n/vPxPoYhdErgqXevi/0IY9Jf9j5jjMOgHzf2FP5tmfmiaHvJ7nMqu0PpDpv4DusgR6ZHkX9vkn/lcphpn/xwVbh3jf4bpnwwJZWNRtH7t1bLRz83qtSQm33khqBQG4klBEoDoVlrxUlFzqcXx0dxicPWEPIsMSZgoqjXhWO5v9i9NriVSdG6eXM911HiefEw7tr+ize3KpzgjIfKO2nR8aewZSBsXkF3hqQF5S1a44bA8NoBRy1J092fvGzAe+MEBKXrlNBOM6ZWU8daiPV1ee2rykQMU4hVgjoXe6ownqMDP961vgpMeHDeUzRMyuEqCB+OC/c0E2D6BBwPi8fmE9rkkn1fE563vhQMmQ1oalWFVkjmYnF8S0jce5zC/gDwu84JdoPwObIQzGXJecCLzgtlY0HnBOGDz4M7DHE/Ldq81NciBBPHUYMqwTFaqQf1q0P72N9Nz/bsuq8GUPYk2eDWY0q7efAmJ9ewhqwAHAgRUAdpHpLDQWIHICeUcp65Vp8HDXAaSxAqPrjxPTibtTBlI/licdJkybxlIfgm7lu+o7jKQKUOKqVrYrqBj/hZSWzjhKXqhGM08W3gUoxnUh2XWTRSSstXOQlnLH9zECuWLdLKV1EYpTWOZDsu8EBftoCQLVM8EtHw9k846Xa5xJ4XpudGTXudDeGpnpuwOeGfqmaZ0yGRQ9UxTuR9odlAqXR59wibRXUmSnFrMxIEI4RwkVWFwkIZL9jyxL36yb72YSeU5GqLzye8Mq5La1YKzHsiM9qfbQfNWlf3msb+ARC6z313g/NYLnlSeYx/6lu7IUC4lQFVoTy6Y3fNpQM+yHTwAEE8DCs5/kBrQvAa0XwGlAo7qh96JQApzKQIEa5Sh3fl8s4bOfPuCId70eJecSpEgoBp0MPd9UrYwvag99x3PqI7mC1NXtLMJQyOPONaE4XS/nys910/N6UIVMISsuoza09E3ZS68SCLa3UFfLsmsn7rpv5rrSMt3VDv86LjaE9yukCMT1qOdrHNsnmyb6qM7/09AkuquYbYr9/5nnTD1b+9/Ah36kRxQxjpDr3RnVEDHtMjD4fhwHqi7WIlrHmAIt/WbqtGOb7lCy1hXHfLQ+hEAqtbfTaCPGyRFudQGVSvYCHpFPu7wzHwAES4OAIinAUlsQmpAqxrQ5DEAB4Aw5HRHinKpAapOz/oW5BM/4fbnsE+D4UGBgELAUcUqhaA2IWj/SABVP6/iteNKIAtgs7GgA/X+4PPdHAAQTwR4TgCWIlCfCBQtYWw4JDTkElh5VPDOWBSdC2MO2g+Q5wKX6SODBAxm34SKKqGKj3iJJxrHK6G0rh0Gk69FoVbKn1qLku+n7lIUnUHFulwJdah+T62xgC9Z/MJQQ9V13FKbzpyKW7Wy3WvIpee6ePd2D66Xj0Rygzv+BQ==&lt;/diagram&gt;&lt;/mxfile&gt;&quot;}"></div>
<script type="text/javascript" src="https://viewer.diagrams.net/js/viewer-static.min.js"></script>
