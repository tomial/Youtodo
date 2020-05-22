<template>
  <div id="app">
    <router-link to="/">首页</router-link>
    <router-link :to="{name: 'edit'}">编辑</router-link>
    <!-- vue-router提供，表示渲染路由组件的出口 -->
    <router-view></router-view>
  </div>
</template>

<script>
    

export default {
  name: 'App',
  components: {
    
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
