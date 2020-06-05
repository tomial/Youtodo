import Vue from 'vue'
import VueRouter from 'vue-router'
import MyDay from '../views/MyDay'

Vue.use(VueRouter)

const routes = [{
    path: '/',
    name: 'MyDay',
    component: MyDay
  },
  {
    path: '/about',
    name: 'About',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import( /* webpackChunkName: "about" */ '../views/About.vue')
  },
  {
    path: '/assigned',
    name: 'Assigned',
    component:() => import('../views/Assigned.vue')
  },
  
  
  {
    path: '/important',
    name: 'Important',
    component: () =>import('../views/Important.vue')
  },
  {
    path: '/planned',
    name: 'Planned',
    component:() =>import('../views/Planned')
  },
  {
    path: '/tasks',
    name: 'tasks',
    component:() => import('../views/Tasks.vue')
  },
  {
    path: '/flagged',
    name: 'Flagged',
    component: () => import('../views/FlaggedEmail.vue')
  },

]

const router = new VueRouter({
  routes
})

export default router