<template>
  <footer class="footer">Footer Area</footer>
</template>

<script>
export default {
  name: "FooterBox"
  ,mounted: function () {
    console.log("footer")
  }
}

</script>

<style scoped>
  footer {
    width: 100vw;
    height: 10vh;
    background-color: lightblue;
    bottom: 0;
    position: absolute;
  }
</style>