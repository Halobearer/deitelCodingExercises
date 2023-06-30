package chapter17.StreamsApi;

public class Docs {
    //Stream is not a Collection
    //A stream is a sequence of Elements
    //Stream A -> Terminal Operation -> Stream B
    //
    //ForEach takes a consumer
    //filter() takes a predicate: predicate return a boolean value depending on the operation::


    //=========================================
    //The map takes in a function-a function which is Represents a function that accepts one argument and produces a result
    //the filter takes in a predicate-a predicate which is

}

//+-----------+       +---------+       +--------------+
//        |   Admin   |       |  User   |       |  UserDetails |
//        +-----------+       +---------+       +--------------+
//        | admin_id  |<>-----| user_id |<--+   | user_id      |
//        | name      |       | name    |   |   | name         |
//        | password  |       | email   |   |   | email        |
//        | email     |       | phone   |   |   | age          |
//        | phone     |       | username|   |   | password     |
//        | image     |       | dob     |   |   | account_num  |
//        | dob       |       | password|   |   | account_name |
//        +-----------+       +---------+   |   | bank_name    |
//        |   +--------------+
//        |
//        +------------------------+
//        |
//        |
//        |
//        |     +--------------+
//        +-----| Transaction  |
//        |     +--------------+
//        |     | transaction_id |
//        |     | product_details|
//        |     | price          |
//        |     | quantity       |
//        +-----+----------------+

//
//Admin:
//
//        Primary Key: admin_id (underlined)
//        User:
//
//        Primary Key: user_id (underlined)
//        Transaction:
//
//        Primary Key: transaction_id (underlined)
//        Foreign Key: buyer_id (referencing User entity)
//        Foreign Key: seller_id (referencing User entity)
//        Message:
//
//        Primary Key: message_id (underlined)
//        Foreign Key: sender_id (referencing User entity)
//        Foreign Key: receiver_id (referencing User entity)
