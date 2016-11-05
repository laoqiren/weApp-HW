Page({
    data:{
        text:'hello, my team!',
        teams:[{
            name:'杭电麻花',
            intro:"杭电麻花好棒棒的哦哦哦哦哦"
        },
        {
            name:'杭电麻花',
            intro:"杭电麻花好棒棒的哦哦哦哦哦"
        },
        {
            name:'杭电麻花',
            intro:"杭电麻花好棒棒的哦哦哦哦哦"
        },
        {
            name:'杭电麻花',
            intro:"杭电麻花好棒棒的哦哦哦哦哦"
        },
        {
            name:'杭电麻花',
            intro:"杭电麻花好棒棒的哦哦哦哦哦"
        }],
        showLove:true,
        new1:{
            title:'微信小程序By HW来了',
            content:'嗯，我们正在开发'
        }
    },
    onLoad(options){

    },
    onPullDownRefreash(){
        this.setData({
            text:'hello, new text'
        })
    },
    viewtap(){
        console.log("hello")
        this.setData({
            text:"I'm tapped"
        })
    }
})