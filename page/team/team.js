Page({
    data:{
        text:'hello, my team!',
        teams:[]
    },
    onLoad(options){
        var that = this;
        wx.request({
            url:'http://localhost:3000/teams',
            success(res){
                console.log(res.data.teams);
                that.setData({
                    teams:res.data.teams
                })
            }
        })
    },
    onPullDownRefreash(){
        this.setData({
            text:'hello, new text'
        })
    },
    downImage(){
        var that = this;
        wx.downloadFile({
            url:"http://localhost:3000/images",
            success(res){
                console.log(res.tempFilePath);
                that.setData({
                    image:res.tempFilePath
                });
            }
        })
    },
    selectImage(){
        console.log("提取图片")
        wx.chooseImage({
            success(res){
                var tempFiles = res.tempFilePaths;
                console.log(tempFiles);
                wx.uploadFile({
                    url:"http://localhost:3000/images",
                    filePath:tempFiles[0],
                    name:'file',
                    formData:{
                        'user':'luoxia'
                    },
                    success(res){
                        if(res.status==200){
                            console.log("发送图片成功")
                        }
                    }
                })
            }
        })
    }
})