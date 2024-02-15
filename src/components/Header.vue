<template>
  <div class="frame">
    <router-link to="/choose">
      <button class="grid-content bg-purple">Select</button>
    </router-link>
    <router-link to="/edit">
      <button class="grid-content bg-purple">Edit</button>
    </router-link>
  </div>
</template>

<script>
export default {
  data() {
    return {
      navList: [
        { name: "/choose", navItem: "Select", navClass: "choose" },
        { name: "/edit", navItem: "Edit", navClass: "edit" },
      ],
    };
  },
};
</script>

<style scoped>
.frame {
  text-align: left;
  width: 800px;
  margin: 0px auto;
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
