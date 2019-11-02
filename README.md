# spring-batch-homework-1
Spring Batch - Read CSV file then save to MySQL

Precondition: 
1. Import Source Code by Intellij IDEA

Steps:
1. Click Maven - clean
2. Click Maven - install
3. Open Terminal of Intellij
4. Type: "docker-compose up"
5. Go to "http://localhost:8082"
6. Login by Admin account: admin/admin123
7. Click the link "Go to Admin page"
8. Click the link "Read Data from CSV to MySQL"


How to check imported data: 
1. Go to the link "http://localhost:8082/admin/students"
2. OR access to database with config below:
- host: localhost
- port: 3396
- username: sa
- password: password
- database: test
- url: jdbc:mysql://localhost:3396/test
