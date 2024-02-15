<template>
  <div class="frame">
    <router-link to="/edit/model">
      <button class="grid-content bg-purple">Model</button>
    </router-link>
    <router-link to="/edit/device">
      <button class="grid-content bg-purple">Device</button>
    </router-link>
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  data() {
    return {};
  },
  methods: {
    //提交事件
    sumbit() {},
  },
  mounted() {},
};
</script>

<style scoped>
.frame {
  text-align: left;
  width: 800px;
  margin: 0px auto;
  margin-top: 15px;
}
.grid-content {
  border-radius: 4px;
  min-height: 36px;
  width: 80px;
  cursor: pointer;
  border: 0px;
  background: #d3dce6;
  margin-right: 10px;
  text-decoration: none;
  color: black;
}
.grid-content:hover {
  background: #99a9bf;
}
</style>
