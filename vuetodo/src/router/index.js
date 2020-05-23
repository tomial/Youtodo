import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '@/components/Home'
import Edit from '@/components/Edit'
import NewTask from '@/components/NewTask'
import Login from '@/components/Login'
import Setting from '../components/Setting'
import ViewTask from '../components/ViewTask'

Vue.use(VueRouter) //在vue中引入vue-router

//创建路由对象
const router = new VueRouter({
  //配置路由
  // mode:"history",
  routes: [
    {
      path: '/login',
      name: 'login',
      component: Login
    },
    {
      path: '/',
      name:'home',
      component: Home,
    },
    {
      path: '/edit:task_id',
      name: 'edit', //命名路由
      component: Edit
    },
    {
      path: '/new',
      name: 'new-task',
      component: NewTask
    },
    
    {
      path: '/setting',
      name:'setting',
      component: Setting
    },
    {
      path: '/:task_id',
      name: 'view-task',
      component: ViewTask
    }
  ]
})

export default router;
