# Java API Wrapper for Binary.com 

[![Build Status](https://travis-ci.org/binary-com/java-api-wrapper.svg?branch=master)][travis-ci]

A higher-level wrapper around [Binary.com API][binary-api] for Java.

## Usage
```java
ApiWrapper api = ApiWrapper.build(appId, language, websocketURL);

TickRequest request = new TickRequest("R_10");

api.sendRequest(request)
    .subscribe(
            response -> {
                System.out.printf("epoch: %S, price: %s", 
                    response.getTick().getEpoch(), responce.getTick().getQuote());
            }
    );
```

## API Documentation
[Binary.com API documentation][binary-api]


[travis-ci]: https://travis-ci.org/binary-com/java-api-wrapper
[binary-api]: https://developers.binary.com/api
