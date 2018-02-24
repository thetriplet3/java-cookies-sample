
Generate Java Webapp with Maven

mvn archetype:generate -DgroupId=sliit -DartifactId=myproject -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false


Build Java project with maven

mvn clean install


java keytool commands
https://www.sslshopper.com/article-most-common-java-keytool-keystore-commands.html

configure https in tomcat
https://tomcat.apache.org/tomcat-7.0-doc/ssl-howto.html

<Connector
           protocol="org.apache.coyote.http11.Http11NioProtocol"
           port="8443" maxThreads="200"
           scheme="https" secure="true" SSLEnabled="true"
           keystoreFile="${user.home}/.keystore" keystorePass="changeit"
           clientAuth="false" sslProtocol="TLS"/>
          
