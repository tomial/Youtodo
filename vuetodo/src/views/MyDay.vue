<template>
  <div class="home">
    <!-- <img alt="Vue logo" src="../assets/logo.png"> -->
    <!-- <HelloWorld msg="Welcome to Your Vue.js App"/> -->
    <TodoList></TodoList>
  </div>
</template>

<script>
// @ is an alias to /src

import  TodoList  from "@/components/TodoList";

export default {
  name: 'Home',
  components: {
    TodoList
  }
}
</script>
<style scoped>
.home{
   /* background-image: url("../assets/todo-bg.jpg"); */
   /* background-size: cover */
   background-color: #ffe4e9;
}
</style>

