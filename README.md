# API_Producer_Docker
Introduction: Event Driven Systems are one of the modern architectural patterns for achieving scalability. Its not trivial to create a completely event driven system and also it not useful in every system you create. Events are useful in some particular kind of systems only. Micro-services is one of the use case to take advantage of Events. We are starting a series of assignments called "Event Chase". Event Chase is a series of multiple small-2 problems to make everyone learn and get better at designing event driven systems. We will get a chance to look at some patterns as well as anti patterns during the course of these assignments. Technologies we are going to learn in this assignment:

Spring Boot
Rabbit MQ Problem 

Statement 1: Purpose: To generate an event as a message and pass it to a broker system. You are learning "Event-Carried State Transfer" this way. If more interested, read first 2 heading of https://martinfowler.com/articles/201701-event-driven.html 


Problem: Suppose you have two micro services.
Service 1: Responsible to Generating Events
Service 2: Responsible fo Receiving Events
Rabbit MQ: For transferring the message from Service 1 to Service 2 
Use Cases 1: Service 1:
Create an api accepting the customer.json file as an Object.

Send the above message to a topic exchange. You can name is whatever you want. Service 2:
Create a listener in service 2. This listener should be able to receive message from the above topic exchange.
I am assuming you will figure out how to add queue to a listener using GOOGLE SEARCH.
Just print the message to the log together with the queue name and routing key. 
Use Cases 2: Service 1:
Create another api accepting the same JSON as an Object.

Send the above message to a direct exchange. You can name is whatever you want. 
Service 2:
Create a new listener in service 2. This listener should be able to receive message from the above direct exchange.
I am assuming you will figure out how to add queue to a listener using GOOGLE SEARCH.
Just print the message to the log. Together with the queue name. 
Use Cases 3: Service 1:
Create another api accepting the same JSON as an Object.

Send the above message to a Fanout exchange. You can name is whatever you want. 
Service 2:
Create 3 new listener in service 2. All should be able to receive message from the above Fanout Exchange.
I am assuming you will figure out how to add queue to a listener using GOOGLE SEARCH.
Just print the message to the log. Together with the current queue name




