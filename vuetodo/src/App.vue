<template>
  <div id="app">
    <Navbar></Navbar>
    <!-- vue-router提供，表示渲染路由组件的出口 -->
    <div class="container">
      <!-- Page Content goes here -->
      <router-view></router-view>
    </div>

  </div>
</template>

<script>
import Navbar from './components/Navbar'

export default {
  name: 'App',
  data() {
    return {
      activeIndex1: '1'
    }
  },
  methods: {

  },
  components: {
    Navbar
  }

}
</script>

<style>
a {
  text-decoration: none;
}
</style>
