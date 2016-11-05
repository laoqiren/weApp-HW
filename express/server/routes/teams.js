var express = require('express');
var router = express.Router();

router.get("/",function(req,res,next){
    console.log("来自weApp的请求")
    res.status(200);
    res.json({
        teams:[{
            name:'HelloWorld',
            content:'HW社团，技术型社团，爱技术，爱生活'
        },
        {
            name:'HelloWorld',
            content:'HW社团，技术型社团，爱技术，爱生活'
        },
        {
            name:'HelloWorld',
            content:'HW社团，技术型社团，爱技术，爱生活'
        },
        {
            name:'HelloWorld',
            content:'HW社团，技术型社团，爱技术，爱生活'
        },]
    })
});

module.exports = router;