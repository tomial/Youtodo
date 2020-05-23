<template>
  <!-- 列出所有 -->
  <div>
    <ul class="collection">
      <li
        v-for="todo in todos"
        :key="todo.id"
        class="collection-item"
        :class="{completed: todo.completed}"
      >
        <label>
          <input
            class="toggle"
            type="checkbox"
            v-model="todo.completed"
          />
          <span>{{todo.desc}}</span>
        </label>
        <div class="chip">
          {{todo.tag}}
        </div>
        <button
          class="destroy"
          @click="removeTodo(todo)"
        ></button>
      </li>

    </ul>
    <div class="new"><a class="btn-floating btn-large waves-effect waves-light red lighten-2"><i class="material-icons">add</i></a></div>
  </div>

</template>

<script>

// import {getRequest} from '@/utils/api'

// import axios from 'axios'
export default {
  data() {
    return {
      list: [
        { id: 1, name: "小志" },
        { id: 2, name: "呆呆" },
      ],
      todos: [
        {
          id: 1,
          todo_id: 1,
          desc: "新建一个vue项目",
          deadline: '2020-5-24',
          tag: 'work',
          completed: false,

        },
        {
          id: 2,
          todo_id: 2,
          desc: "买衣服",
          deadline: '2020-5-23',
          tag: 'shopping',
          completed: true,
        },
        {
          id: 3,
          todo_id: 2,
          desc: "买衣服",
          deadline: '2020-5-23',
          tag: 'shopping',
          completed: false,
        },
      ]

    }
  },
  created() {

  },
  methods: {
    removeTodo(todo) {
      console.log(todo);
    }
  }
}
</script>

<style scoped>
p {
  display: inline;
}
ul li label span {
  font-weight: 900;
  font-size: 1.5rem;
}

.completed span {
  text-decoration: line-through;
  color: #d9d9d9;
}
button {
  margin: 0;
  padding: 0;
  border: 0;
  background: none;
  font-size: 100%;
  vertical-align: baseline;
  font-family: inherit;
  font-weight: inherit;
  color: inherit;
  -webkit-appearance: none;
  appearance: none;
  -webkit-font-smoothing: antialiased;
}

.destroy {
  display: none;
  position: absolute;
  top: 0;
  right: 10px;
  bottom: 0;
  width: 40px;
  height: 40px;
  margin: auto 0;
  font-size: 30px;
  color: #cc9a9a;
  margin-bottom: 11px;
  transition: color 0.2s ease-out;
}
.collection .collection-item {
  position: relative;
}

.collection li .destroy:after {
  content: "×";
}

.collection li:hover .destroy {
  display: block;
}

.new {
  /* position: absolute;
  bottom: 100px;
  right: 200px; */

  list-style: none;
}
</style>