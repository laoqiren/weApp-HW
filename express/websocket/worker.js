process.on('message',function(m,server){
    if(m==='server'){
        server.on('connection',function(socket){
            socket.end('\nchild:handled by child\n')
        })
    }
})
