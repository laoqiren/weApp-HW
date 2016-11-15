var child = require('child_process').fork('worker.js');

var server = require('net').createServer();
server.on('connection',function(socket){
    socket.end('handled by master\n');
});

server.listen(1337,function(){
    child.send('server',server);
})