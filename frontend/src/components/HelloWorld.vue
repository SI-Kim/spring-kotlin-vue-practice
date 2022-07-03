<template>
  <div>
    <p>title {{ title }} : {{ count }}</p>
    <button
        v-on:click="btnHandler"
    >Click</button>
  </div>
</template>
<script>
export default {
  name: 'HelloWorld',
  props: ['title'],
  data() {
    return {
      count: 0
    }
  },
  methods: {
    btnHandler() {
      this.count++;
    }
  }
}
</script>
<style>

</style>