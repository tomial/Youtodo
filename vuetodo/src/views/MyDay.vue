<template>
  <div id="content">
    <h1>My Day</h1>
    <BaseInputText> </BaseInputText>

    <TodoListItem> </TodoListItem>
  </div>

</template>

<script>
import BaseInputText from "@/components/BaseInputText.vue";
import TodoListItem from "../components/TodoListItem"
export default {
  name: 'Home',
  data() {
    return {

    }
  },
  components: {
    BaseInputText,
    TodoListItem
  },
  methods: {

  },
}
</script>
<style scoped>
* {
  margin: 0;
  padding: 0;
}
#content {
  background-color: #f1f1f1;
}

h1 {
  text-align: center;
  margin-top: 1rem;
}
</style>

