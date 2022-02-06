# Using WebSocket to build an interactive web application

The WebSocket API is an advanced technology that makes it possible to open a two-way interactive communication session between the user's browser and a server. With this API, you can send messages to a server and receive event-driven responses without having to poll the server for a reply.

## How to run the project
- From within the root of the application run
For instance, with
```bash
./gradlew bootRun
```
- alternatively, You can run
```bash
./gradlew build
```
- then run
```bash
jar build/libs/hello_websocket-0.0.1-SNAPSHOT.jar
```


## Test the service
- Now that the service is running, point your browser at http://localhost:8080 and click the Connect button.
- Upon opening a connection, you are asked for your name. Enter your name and click Send. Your name is sent to the server as a JSON message over STOMP. 
- After a one-second simulated delay, the server sends a message back with a “Hello” greeting that is displayed on the page. At this point, you can send another name or you can click the Disconnect button to close the connection.


## Resources
- [Using WebSocket to build an interactive web application](https://spring.io/guides/gs/messaging-stomp-websocket/)
- [The WebSocket API (WebSocket)](https://developer.mozilla.org/en-US/docs/Web/API/WebSockets_API)