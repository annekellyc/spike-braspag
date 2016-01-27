# spike-braspag
Simple console application integrating with Braspag.

Braspag API documentation: http://apidocs.braspag.com.br/

## Configuring environment variables in your bash_profile or zhsrc file:
```
export MERCHANT_ID=<merchant_id>
export MERCHANT_KEY=<merchant_key>
export REQUEST_ID=<request_id>
```

To get the values for "merchant_id" and "merchant_key", you have to register in the sandbox (test enviroment).
Link: https://cadastrosandbox.braspag.com.br/

About "request_id" you can generate a UUID/Guid value.

## Running the application

```
$ ./gradlew run
```
