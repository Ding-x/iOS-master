## Group iOS
## UofM Used Textbook Ordering System (UMUTOS)
## Retrospective
### After the retrospective activity in Iteration 2, we found the book id and account id of our project (UMUTOS) was not as successful as we desired. In Iteration 1, we used a static integer variable in both book and account class to assign the ID, but when we transformed to HSQLDB, it becomes a problem. When this problem appeared, we have no idea how to solve, it becomes a bottleneck. After search and trying, we finally implement max id in database, the variable is incremented when a new book or new account been created. Although it works, it is not a wise way to solve this problem. 
### By deeply studing in HSQLDB and helpful advice from instructor, we found a new way to solve this problem. Compare to the previously one, it is more easier and efficiency to use. In this Iteration, we are going to use ‘IDENTITY’ in HSQLDB to get these IDs. We will add the key word ‘IDENTITY’ in front of the PRIMARY KEY of BOOK and ACCOUNT table, and the id of book and account will be created each time when we add a new book or account and increment automatically started from 0. After fix, if the id of books and accounts works well (we can use book id and account id), every time user register a new book or new user sign up, the book id and account id will increment automatically, then we can decide this change is succeed.
![alt text](/retrospective.png "retrospective")
### According to the chart, it is obviously that compared to the Iteration 1, the actual cost is more closed to the estimate cost in the Iteration 2. In Iteration 1, we are not very familiar with database, so we donate extra time to write 'fake' database, however, we still missed a lot of details, and then go back to solve those problems just before the due time. We spent most of our time on book id and account id, that is the part beyound out estimate time. When it comes to Iteration 2, we had a new tool that is HSQLDB, so we can estimate the cost more accurately.
### After all, according to this project, we have more comprehensive understanding of android application, and 3-tier architecture. We are making progress iteration by iteration, and known the importance of team working. Practice is always the best teacher, and this project will be a milestone along the way.