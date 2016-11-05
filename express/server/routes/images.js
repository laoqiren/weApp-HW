var express = require('express');
var router = express.Router();
var fs = require("fs");
var multiparty = require("multiparty");

router.get("/",function(req,res,next){
    var bufs = [];
    var readerStream = fs.createReadStream(__dirname+"/../public/images/image0.jpg");
    readerStream.on("data",function(chunk){
        bufs.push(chunk);
    });
    readerStream.on("end",function(){
        var image = Buffer.concat(bufs);
        console.log("发送图片到客户端")
        res.status(200);
        res.send(image);
        bufs=[];
    })
});
router.post("/",function(req,res,next){
    var form = new multiparty.Form();
    form.parse(req,function(err,fields,files){
        console.log(files);
        var readerStream = fs.createReadStream(files.file[0].path);
        var writerStream = fs.createWriteStream(__dirname+"/../public/images/image0.jpg");
        readerStream.pipe(writerStream);
        console.log("读取并储存到服务器文件");
        res.status(200);
        res.end();
    })
});

module.exports = router;