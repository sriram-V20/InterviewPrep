# Design a Rate Limiter

    Ask as many question as possible : 
        what kind of rate limiter are we going to design ?
        is this client side or server side ?
        how do we throttle requests ? based on Ip or user ID or any other properties ?
        is this in a distributed system ?
        do we need to inform users who are throttled ?
        what is the scale of the system ?


Asking questions will help you decide on what you should design and what direction you should think ?

    Functional Requirements : 
        - Limit excessive requests.
        - rate limiter should not slow down the requests
        - rate limiter can be shared across multiple servers or processes.
        - show users when they are being throttled. 429 Response code.
        
    
    Non Functional Requirements : 
        - High Fault tolerence : if a cache server goes offline it should not affect the system.
        - low latency : 
        
 ### Propose a High Level Design 

    - Where to put the rate limiter ? client side or server side ? obviously it is server side.

    - Where to implement the rate limiter ? In a gateway or in the server ?
    
        There is no answer for this and it depends on other factors such as cache, engineering resources etc.

There are several algorithms to implement a rate limiter.

Each Algo has pros and cons, and we should pick a algo based on the needs.

### Algorithms

- Token bucket
- leaking bucket
- fixed window counter
- sliding window log
- sliding window counter

### Token Bucket Algorithm
 

