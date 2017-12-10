## About
Simple web app which provides a rest end point to get latest tweets containing a particular String in tweets contents.

### Technologies used :
* Java 8 
* SpringBoot
* Twitter4j
* maven 3
* junit

### How to run this application :
mvn clean install java -jar target/twittersearch-0.0.1-SNAPSHOT.jar

### End points :
http://localhost:8080/searchTweets/{searchString}

### Example:
http://localhost:8080/searchTweets/ipl2018

### Application Logs can be found in : 
${java.io.tmpdir}/searchTweets.log

### To install Cacerts required :
replace "cacertsFullFilePath" with full path of java cacerts location file twittersearch/src/main/java/com/twitter/twittersearch/certificate/InstallCert.java 
and run the java class InstallCert by passing parameters "api.twitter.com:443" "changeit"

