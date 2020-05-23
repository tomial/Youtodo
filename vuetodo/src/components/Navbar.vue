<template>
  <div>
    <nav class="teal lighten-2">
    <div class="nav-wrapper container row ">
      <router-link to="/" class="brand-logo  hidden center">Youtodo</router-link>
      <router-link to="/" class="brand-logo col s8">Youtodo</router-link>
      <ul id="nav-mobile" class="right hide-on-med-and-down col s3">
        <!-- <li class=""><router-link to="/new"><i class="material-icons">add</i></router-link></li> -->
        <li class=""><router-link to="/login"><i class="material-icons">account_circle</i></router-link></li>
        <li class=""><router-link to="/setting"><i class="material-icons">settings</i></router-link></li>  
      </ul>
    </div>
  </nav>
  </div>
</template>

<script>
  export default {
    
  }
</script>

<style scoped>

.hidden{
  visibility: hidden;
}
@media (max-width: 990px) {
  .hidden{
    visibility:visible;
  }
}
</style>