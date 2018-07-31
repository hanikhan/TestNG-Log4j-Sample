# testng-browserstack with Log4j implementation to write INFO level logs

[TestNG](http://testng.org) Integration with BrowserStack.

![BrowserStack Logo](https://d98b8t1nnulk5.cloudfront.net/production/images/layout/logo-header.png?1469004780)

## Setup

* Clone the repo
* Install dependencies `mvn compile`
* Update `*.conf.json` files inside the `src/test/resources/conf` directory with your [BrowserStack Username and Access Key](https://www.browserstack.com/accounts/settings)

## Running your tests

- To run a single test, run `mvn test -P single`
- To run local tests, run `mvn test -P local`
- To run parallel tests, run `mvn test -P parallel`
- To run the complete suite, run `mvn test -P suite`


## Notes
* You can view your test results on the [BrowserStack Automate dashboard](https://www.browserstack.com/automate)
* To test on a different set of browsers, check out [platform configurator](https://www.browserstack.com/automate/capabilities)
* You can export the environment variables for the Username and Access Key of your BrowserStack account

  ```
  export BROWSERSTACK_USERNAME=<browserstack-username> &&
  export BROWSERSTACK_ACCESS_KEY=<browserstack-access-key>
  ```

## Log4j implementation
* Log4j properties file available under 'src/test/resources/log4j.properties'
* Current implemenation uses INFO level appender. Current implementation can be extended to use multiple appenders
* Logs can be accessed under 'logs' folder
* Logs use the following format: [TimeStamp] [Log_Level] [Class] [SessionID] [Custom Log Message]
* Sample logs for a parallel test sessions can be accessed [here](https://github.com/hanikhan/TestNG-Log4j-Sample/blob/master/logs/Test_Sessions.log)