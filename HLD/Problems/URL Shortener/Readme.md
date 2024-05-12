
# Design a URL Shortener

#### 1. Functional Requirements

    1. Given a URL convert it to short form URL which redirects to original Link
    2. Shot form should not be lengthy and it consists of (a-zA-Z0-9)
    3. can be deleted (but for future use case)
    4. Expiry for a url.

#### 2. Non-Functional Requirements
    
    1. Highly Scalable
    2. Highly available
    3. Fault tolarant

#### 3. Calc
    
    100M url's generated per day => 1200 urls/sec
    1:10 Write to read => 12000 reads/sec
    
#### 4. API's
    
    1. api/v1/shorten
        @param : longurl
        return : shorturl
    
    2. api/v1/shortURL
        returns : 301
        location : {longurl}

#### 5. Tables
    
    url Table : 
    shorturl: INDEXED CLUSTERED
    longurl: INDEXED NON-clustered
    expiry:
    created_at:

#### High level design 

    
    
