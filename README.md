# Automatic integrations test with Wildfly
This project shows how to do integration tests on a Wildfly (http://www.wildfly.org/) application server.
<p>
Using the wildfly-maven-plugin (https://mvnrepository.com/artifact/org.wildfly.plugins/wildfly-maven-plugin) it will automatically start, deploy and stop the server during the integration tests.
</p>
<h2> How to run </h2>
mvn clean install -P integration-test // To run integration tests
<br/>
mvn clean install -P local // To run unit tests
