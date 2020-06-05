<template>
  <div id="app">
    <div class="wrapper">
      <div id="aside-nav">
        <!-- <router-link to="/">Home</router-link>
        <router-link to="/about">About</router-link> -->
        <SideBar></SideBar>
      </div>
      <router-view id="content" />
    </div>
  </div>
</template>
<script>
import  SideBar  from "./components/SideBar";
export default{
  components: {
    SideBar,
  }
}
</script>
<style>
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

.wrapper{
  display: flex;
  width: 70%;
  margin: 50px auto;
  /* background-color: rgba(0,0,0,0.4); */
  background-color: white;
  /* border-radius: 8px; */
  justify-content: space-between;
}
#content{
  /* margin-left: 20px; */
  /* background-color: #e3e3e3; */
  width: 80%;
}
#aside-nav {
  /* padding: 30px; */
  width: 20%;
  /* background-color: rgba(0,0,0,0.4); */
  /* border-radius: 8px; */
  
}

#aside-nav a {
  font-weight: bold;
  color: #2c3e50;
  display: block;
}

#aside-nav a.router-link-exact-active {
  color: #236d4b;
}

</style>
