# Design a XYZ System which does ABC

## This is my general template I follow in Interviews

### Gather Requirements and talk with the Interviewer to know what exactly you need to design


>    __Functional Requirements :__
>>        1. get to know what you need to design and who are you designing for.
>>        2. Should do A
>>        3. Should allow user to do X etc..
>>        4. Only allows text or files with a specific format etc.

    
>    __Non-Functional Requirements :__
>>        1. System should should be able to handle scale
>>        2. System should be extensibile, fault tolarent, available etc..
    

>    __Back of Envelope Calc :__
>>        1. 50M DAU and each users will send 10 requests a day
>>        2. Read/Write
>>        3. Memory reqs
        
    
    
>    __High-level Design:__
>>        1. come up with a high level design, walk thorugh each use case end to end flow
>>        2. Http/web socket/ FMTP etc
    
>    __Data Model :__
>>        1. Talk about different tables you need, most important tables only.
>>        2. Talk about database - SQL/NoSQL depends on data we need and read/write access
>>        3. indexes, partitons or sharding, clustering keys, partiton keys, keys can be composite.
    
>    __API's :__ 
>>        Talk about different API's you need to expose
>>        Eg : /v1/api/user/:id
>>            @param id - Request
>>            JSON USER details - Response
        
            
>    __Bottlenecks :__
>>        Talk about various bottlenecks about the system.
    
>    __IMPORTANT : DO NOT TALK ABOUT ANYTHING YOU ARE NOT SURE ABOUT.__