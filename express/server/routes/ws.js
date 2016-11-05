var express = require('express');
var router = express.Router();

router.ws("/",function(ws,req){
    console.log("来自weapp的websocket连接")
    ws.on('message',function(msg){
        ws.send('back from node');
    })
});
module.exports=router;