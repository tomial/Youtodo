<template>
  <div class="row container">
    <form class="col s12">
      <div class="row">
        <h3>todo空间</h3>
      </div>
      <div class="row">
        <div class="input-field col s12">
          <i class="material-icons prefix">account_circle</i>
          <input
            id="name"
            type="text"
            class="validate"
            v-model="loginForm.username"
          >
          <label for="email">Username</label>
        </div>
      </div>
      <div class="row">
        
        <div class="input-field col s12">
          <i class="material-icons prefix">lock</i>
          <input
            id="password"
            type="password"
            class="validate"
            v-model="loginForm.password"
          >
          <label for="password">Password</label>
        </div>
      </div>
      <p>
        <label>
          <input
            type="checkbox"
            class="filled-in"
            v-model="checked"
          />
          <span>记住密码</span>
        </label>
      </p>
      <input type="submit" value="登录" class=" bigger teal lighten-2" @click="submitClick">
    </form>
  </div>

</template>

<script>

import postRequest from '../utils/api'
export default {
  data() {
    return {
      
      loginForm: {
        username: 'mudai',
        password: '123'
      },
      checked: false,
      loading: false,
    }
  },
  methods: {
    submitClick:function() {
      this.loading = true;
      postRequest("http://35.220.210.125:8080/user/2",{
        username:this.loginForm.username,
        password:this.loginForm.password,
      }).then(res =>{
        this.loading = false;
        if(res.status == 200){
          //登录成功
          let data = res.data;
          if(data.status == 'success'){
            this.$router.replace({path:'/home'})
          } else {
            this.$alert('登录失败')
          }
        }else {
          this.$alert('登录失败')
        }
      })
    }
  },
  
}
</script>

<style scoped>
.login-container {
  box-sizing: border-box;
  margin: 100px auto;
  width: 500px;
  height: 400px;
}
.check-box {
  box-sizing: border-box;
  padding-bottom: 15px;
}
h3 {
  text-align: center;
}
.bigger{
  border: none;
  border-radius: 3px;
  width: 100%;
  height: 50px;
  font-size: 20px;
  color: #263238;
}
</style>