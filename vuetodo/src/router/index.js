import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from './views/Home'
import Edit from './views/Edit'
import Newitem from './views/Newitem'

Vue.use(VueRouter) //在vue中引入vue-router

//创建路由对象
const router = new VueRouter({
  //配置路由
  mode:"history",
  routes: [
    {
      path: '/',
      component: Home
    },
    {
      path: '/Edit',
      name: 'edit', //命名路由
      component: Edit
    },
    {
      path: '/Newitem',
      component: Newitem
    }
  ]
})

export default router;
