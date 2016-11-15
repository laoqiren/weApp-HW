const http = require("http");
const ws = require("ws");

var httpServer = http.createServer();
httpServer.listen(8066,"localhost");

var chat = new ws.Server({server:httpServer,path:'/chat'});

chat.on("connection",function(ws){
    console.log("来自客户端的websocket连接");
    ws.on("message",function(message){
        console.log(message);
        ws.send(message);
    })
});

console.log("websocket server at 8066")