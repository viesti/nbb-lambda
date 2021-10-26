# NBB in AWS Lambda NodeJS runtime

```sh
# Install deps
$ npm install
# Package for deployment
$ zip -r function.zip .
# Create the function. First invocation seems to require a bit more timeout than the default 3 seconds
$ aws lambda create-function --function-name hello-nbb --role arn:aws:iam::xxxx:role/service-role/basic_execution --zip-file fileb://function.zip --runtime nodejs14.x --handler index.handler --timeout 10
# Invoke it
$ aws lambda invoke --function-name hello-nbb foo
# Check results
$ cat foo
{"hello":"world"}%
```
