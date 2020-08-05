<template>
  <li class="wp">
    <el-checkbox :checked="todo.completed"></el-checkbox>
    <label :class="{done: todo.completed}">{{todo.text}}</label>
    <el-button class="delete" type="danger" icon="el-icon-delete" circle @click="$emit('remove', todo.id)"></el-button>
  </li>
</template>

<script>
  export default {
    model:{
      prop: 'checked',
      event: 'change'
    },
    props:{
      todo:{
        type: Object,
        required: true,
      },
      
    } 
  }
</script>

<style scoped>
  .wp{
    display: block;
    text-decoration: none;
    font-size: 30px; 
    line-height: 50px;
    background-color: #fff;
    margin: 3px auto;
    width: 80%;
    position: relative;
  } 

  .delete{
    position: absolute;
    right: 5px;
    margin-top: 4px;
  }
  .done{
    text-decoration: line-through;
  }

</style>