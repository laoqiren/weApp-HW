process.on('message',function(m){
    console.log('child get message:'+m);
});
process.send({foo:'bar'})