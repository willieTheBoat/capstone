<template>
  <div>
    <Header></Header>
    <router-view></router-view>
    <!-- <Choose></Choose> -->
  </div>
</template>

<style scoped></style>

<script>
import Header from "@/components/Header.vue";
export default {
  data() {
    return {
      navList: [
        { name: "/choose", navItem: "Select", navClass: "choose" },
        { name: "/edit", navItem: "Edit", navClass: "edit" },
      ],
    };
  },
  components: {
    Header,
  },
};
</script>
