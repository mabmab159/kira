#Descargando la imagen
FROM openjdk:11
#Copiando el proyecto
COPY . /usr/src/myapp
#Instalando maven
RUN wget https://dlcdn.apache.org/maven/maven-3/3.9.1/binaries/apache-maven-3.9.1-bin.tar.gz -O /tmp/maven.tar.gz
#extract the file
RUN cd /tmp && tar xvf maven.tar.gz
#copy the file into opt/maven
RUN mkdir "/usr/share/maven/"
RUN cp -R /tmp/apache-maven-3.9.1/* /usr/share/maven/
#RUN cp /opt/files/* /usr/share/maven
ENV MAVEN_HOME /usr/share/maven
ENV MAVEN_CONFIG "$USER_HOME_DIR/.m2"
COPY ./java.security /usr/local/openjdk-11/conf/security/
WORKDIR /usr/src/myapp
CMD ["sh","/usr/share/maven/bin/mvn","install"]
CMD ["sh","/usr/share/maven/bin/mvn","package"]
#Habilitar el tls
CMD ["java","-jar","/usr/src/myapp/target/kira-0.0.1-SNAPSHOT.jar"]