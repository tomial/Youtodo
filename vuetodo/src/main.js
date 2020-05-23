import Vue from 'vue'
import App from './App.vue'
import router from './router/index'
Vue.config.productionTip = false

new Vue({
  //一定要挂载
  router,
  render: h => h(App),
}).$mount('#app')
