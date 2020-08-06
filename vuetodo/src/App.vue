<template>
  <div id="app">
    <div class="wrapper">

      <!-- <router-link to="/">Home</router-link>
        <router-link to="/about">About</router-link> -->
      <SideBar id="bar"></SideBar>
      <router-view id="content" />
    </div>
  </div>
</template>
<script>
import SideBar from "./components/SideBar";
export default {
  components: {
    SideBar,
  }
}
</script>
<style>
* {
  margin: 0;
  padding: 0;
}
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;
  display: flex;
  width: 100%;
  height: 720px;
  background-image: url("./assets/bg.jpg");
  background-size: cover;
}

.wrapper {
  /* display: -webkit-flex; Safari */
  display: flex;
  width: 70%;
  margin: 50px auto;
  /* background-color: rgba(0,0,0,0.4); */
  background-color: white;
  /* border-radius: 8px; */
  justify-content: space-between;
  /* background-color: #e3e3e3; */
}
#content {
  /* margin-left: 20px; */
  /* background-color: #e3e3e3; */
  width: 80%;
  padding: 12px;
}

@media screen and (max-width: 750px) {
  #bar {
    /* visibility: hidden; */
    display: none;
  }
  #content {
    /* margin-left: 20px; */
    /* background-color: #e3e3e3; */
    width: 100%;
  }
}
</style>
