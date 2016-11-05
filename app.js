App({
  onLaunch: function () {
    var appInstance = getApp();
    console.log("is log?"+this.globalData.hasLogin)
    console.log('App Launch')
  },
  onShow: function () {
    console.log('App Show')
  },
  onHide: function () {
    console.log('App Hide')
  },
  globalData: {
    hasLogin: false
  }
})
