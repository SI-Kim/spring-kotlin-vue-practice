<template>
  <div id="app">
    <header-box />
    <hello-world title="hhhh"/>
    <footer-box />
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'
import FooterBox from './layouts/FooterBox.vue';
import HeaderBox from './layouts/HeaderBox.vue';

export default {
  name: 'App',
  components: {
    HeaderBox,
    FooterBox,
    HelloWorld
  }
}
</script>
<style>
#app {
  width: 100vw;
  height: 100vh;
  margin: 0;
}
</style>
