<template>
  <input
    type="text"
    class="newTodo"
    :value="value"
    v-on="listeners"
  />
</template>

<script>
export default {
  props: {
    value: {
      type: String,
      default: '',
    }
  },

  computed: {
    listeners() {
      // var vm = this;
      return {
        // Pass all component listeners directly to input
        ...this.$listeners,
        // Override input listener to work with v-model
        input: event => this.$emit('input', event.target.value)
      }
      // ...this.$listeners,


    }
  }

}
</script>

<style scoped>
.newTodo {
  display: block;
  position: absolute;
  bottom: 50px;
  left: 50%;
  transform: translateX(-50%);
  width: 80%;
  height: 50px;
  font-size: 20px;
}
</style>