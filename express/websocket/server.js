const http = require("http");
const ws = require("nodejs-websocket");

var server = ws.createServer(function(conn){
    console.log("new connetion");
    conn.on("text",function(str){
        console.log("来自WeApp的聊天内容:"+str);
        conn.sendText(str,function(){
            console.log("向客户端回应")
        })
    })
}).listen(8081);

console.log("websocket server at 8081")