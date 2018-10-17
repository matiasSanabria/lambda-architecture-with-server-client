# lambda-architecture-with-server-client
Lambda architecture implementation with thrift server and client  and local File system and hadoop

### download project
`git clone https://github.com/matiasSanabria/lambda-architecture-with-server-client.git`

### server compile
`cd lambda-architecture-with-server-client/`

### comment the lines in the `lambda-architecture-server-client/pom.xml`
`<!-- <artifactId>lambda-architecture-client</artifactId> -->`<br/>
`<!-- <mainClass>tp.bigdata.client.Client</mainClass> -->`

### uncomment the lines in the `lambda-architecture-server-client/pom.xml`
`<artifactId>lambda-architecture-server</artifactId>`<br/>
`<mainClass>tp.bigdata.server.Server</mainClass>`

### run server
`java -jar lambda-architecture-server-1-with-dependencies.jar`

### output
`listening at port 9090`

### run client
`java -jar lambda-architecture-client-1-with-dependencies.jar <input_data_file.csv>`
