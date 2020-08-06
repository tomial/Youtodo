<template>
  <ul>
    <el-row
      v-for="(todo, index) in todos"
      :key="index"
      class="list"
      style="width: 85%; margin: 4px auto"
    >
      <el-col :span="16">
        <el-checkbox
          v-model="todo.completed"
          :label="todo.text"
        ></el-checkbox>
        <!-- <div>{{todo.text}}</div> -->
      </el-col>
      <el-col :span="8">
        <i
          class="el-icon-delete hover"
          @click="delTodo(index)"
        >删除</i>
      </el-col>
    </el-row>

  </ul>

  <!-- <el-table>
    <el-table-column>

    </el-table-column>
    <el-table-column></el-table-column>
    <el-table-column></el-table-column>
  </el-table> -->

</template>

<script>
export default {
  data() {
    return {
      todos: [
        {
          // id: 1,
          text: "学习JavaScript",
          completed: true,
        },
        {
          text: "学习Vue.js"
        }
      ],
      idHover: false
    }
  },
  methods: {
    delTodo(index) {
      this.todos.splice(index, 1);
    },

  },
  mounted() {
    this.$bus.$on("addItem", (todoText) => {
      let todo = {
        // id: this.len + 1,
        text: todoText,
        completed: false,
      };
      this.todos.push(todo);

      console.log(JSON.stringify(this.todos));
    })
  }
}
</script>

<style scoped>
.hover {
  color: blue;
}
.list {
  height: 30px;
  line-height: 30px;
}
.list:hover {
  background-color: #e3e3e3;
  color: black;
}
</style>