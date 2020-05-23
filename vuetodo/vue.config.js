module.exports = {
  devServer: {
    proxy: {
      '/api': {
        target: '35.220.210.125:8080',
        ws: true,
        changeOrigin: true,
        pathRewrite: { '^/api': '' },
        secure: false,
      },
    }
    
  }
}