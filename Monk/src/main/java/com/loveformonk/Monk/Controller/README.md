Problem faced while testing POST request - 

* While testing the request via POSTMAN, the content-type for 'raw' body was set to text/plain
    * But the application was expecting application/json type
    * So, had to manually set it to application/json
    * NOTE: POSTMAN does not let you change that, so for this, open a new postman reqquest and first set the content type to application/json in headers
    * Then type the request URL and content body