import VueRouter from "vue-router";
import Choose from "@/components/Choose.vue";
import Edit from "@/components/Edit.vue";
import Model from "@/components/Model.vue";
import Device from "@/components/Device.vue";

export default new VueRouter({
  routes: [
    {
      path: "/choose",
      name: "choose",
      component: Choose,
    },
    {
      path: "/edit",
      name: "edit",
      component: Edit,
      children: [
        {
          path: "model",
          component: Model,
        },
        {
          path: "device",
          component: Device,
        },
      ],
    },
  ],
});
