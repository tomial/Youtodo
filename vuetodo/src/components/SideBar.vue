<template>
  <div class="tac">
    <div class="logo">Youtodo</div>
    <div class="avatar-wp">
      <el-avatar
        :size="40"
        :src="circleUrl"
      ></el-avatar>
      <router-link
        to='/login'
        class="name"
      >未登录</router-link>
    </div>

    <el-menu
      default-active="$route.path"
      class="el-menu-vertical-demo"
      @open="handleOpen"
      @close="handleClose"
      router
    >
      <el-menu-item index="/">
        <i class="el-icon-sunny"></i>
        <span slot="title">我的一天</span>
      </el-menu-item>
      <el-menu-item index="/important">
        <i class="el-icon-star-off"></i>
        <span slot="title">重要</span>
      </el-menu-item>
      <el-menu-item index="/planned">
        <i class="el-icon-date"></i>
        <span slot="title">已计划日程</span>
      </el-menu-item>
      <el-menu-item index="/assigned">
        <i class="el-icon-user"></i>
        <span slot="title">已分配给你</span>
      </el-menu-item>
      <el-menu-item index="/flagged">
        <i class="el-icon-collection-tag"></i>
        <span slot="title">标记的电子邮件</span>
      </el-menu-item>
      <el-menu-item index="/tasks">
        <i class="el-icon-house"></i>
        <span slot="title">任务</span>
      </el-menu-item>
    </el-menu>

  </div>
</template>

<script>
export default {
  data() {
    return {
      circleUrl: "https://cube.elemecdn.com/3/7c/3ea6beec64369c2642b92c6726f1epng.png",
    }
  },

  methods: {
    handleOpen(key, keyPath) {
      console.log(key, keyPath);
    },
    handleClose(key, keyPath) {
      console.log(key, keyPath);
    }
  }
}
</script>

<style scoped>
.logo {
  padding: 14px 0px 14px 14px;
  color: #606266;
  font-size: 16px;
}
.avatar-wp {
  padding-left: 14px;
  /* background-color: #e3e3e3; */
  display: flex;
}
.name {
  display: block;
  align-self: center;
  margin-left: 5px;
  font-size: 12px;
  cursor: pointer;
}
</style>