<template>

  <el-input
    placeholder="What are you want to do？"
    v-model="todoText"
    @change="addItem"
  >

  </el-input>
</template>

<script>
export default {
  data() {
    return {
      todoText: "",
    }
  },
  methods: {
    addItem() {
      this.$bus.$emit("addItem", this.todoText)
      this.todoText = "";
    }
  },

}
</script>

<style scoped>
</style>