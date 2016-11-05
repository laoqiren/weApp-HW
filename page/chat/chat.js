var socketOpen = false;
Page({
    onLoad(options){
        this.setData({
            title:options.title
        });
        var that = this;
        console.log("准备连接")
        wx.connectSocket({
            url:"ws:localhost:8081",
            success(){
                console.log("成功")
            },
            fail(){
                console.log("失败")
            },
            complete(){
                console.log("完成")
            }
        });
        wx.onSocketOpen(function(res){
            socketOpen = true;
            console.log("websocket连接");
        });
        wx.onSocketError(function(res){
            console.log("未能正常连接")
        });
        wx.onSocketMessage(function(data){
            console.log(data.data);
        })
    },
    formsubmit(e){
        if(socketOpen){
            console.log("已经连接")
            wx.sendSocketMessage({
                data:e.detail.value.content,
                success(){
                    console.log("发送消息成功");
                }
            });
        } else {
            console.log("未连接")
        }
        
    }
})