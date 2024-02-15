<template>
  <div>
    <el-table
      :data="
        tableData.filter(
          (data) =>
            !search || data.name.toLowerCase().includes(search.toLowerCase())
        )
      "
      style="width: 100%"
    >
      <!-- <el-table-column label="Date" prop="date"> </el-table-column> -->
      <el-table-column label="Name" prop="name"> </el-table-column>
      <el-table-column align="right">
        <template slot="header" slot-scope="scope">
          <el-input v-model="search" size="mini" placeholder="Search" />
        </template>
        <template slot-scope="scope">
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)"
            >Edit</el-button
          >
          <el-button
            size="mini"
            type="danger"
            @click="handleDelete(scope.$index, scope.row)"
            >Delete</el-button
          >
        </template>
      </el-table-column>
    </el-table>

    <el-dialog
      title="Edit"
      :visible.sync="dialogVisible"
      width="400px"
      :before-close="handleClose"
    >
      <div style="display: flex">
        <div class="title-frame">Name:</div>
        <div>
          <el-input v-model="this.selected.name" :disabled="true"></el-input>
        </div>
      </div>

      <div style="display: flex; margin-top: 20px">
        <div class="title-frame">CPU frequency:</div>
        <div>
          <el-input v-model="this.selected.cpuFrequency"></el-input>
        </div>
      </div>

      <div style="display: flex; margin-top: 20px">
        <div class="title-frame">SRAM:</div>
        <div>
          <el-input v-model="this.selected.sram"></el-input>
        </div>
      </div>

      <div style="display: flex; margin-top: 20px">
        <div class="title-frame">Flash:</div>
        <div>
          <el-input v-model="this.selected.flash"></el-input>
        </div>
      </div>

      <div style="display: flex; margin-top: 20px">
        <div class="title-frame">CPU Architecture:</div>
        <div>
          <el-input v-model="this.selected.cpuArch"></el-input>
        </div>
      </div>

      <span slot="footer" class="dialog-footer">
        <el-button @click="dialogVisible = false">Cancel</el-button>
        <el-button type="primary" @click="dialogVisible = false"
          >Confirm</el-button
        >
      </span>
    </el-dialog>
  </div>
</template>

<script>
export default {
  data() {
    return {
      tableData: [
        // {
        //   date: "2016-05-02",
        //   name: "Apollo3 Blue",
        // },
        // {
        //   date: "2016-05-04",
        //   name: "DISCO-F746NG",
        // },
        // {
        //   date: "2016-05-01",
        //   name: "Arduino Nano 33 BLE Sense",
        // },
      ],
      search: "",
      selected: {},
      dialogVisible: false,
    };
  },
  methods: {
    handleEdit(index, row) {
      // console.log(index, row);
      this.selected = row;
      this.dialogVisible = true;
      console.log(this.selected);
    },
    handleDelete(index, row) {
      console.log(index, row);
    },
    handleClose(done) {
      // this.$confirm("确认关闭？")
      //   .then((_) => {
      //     done();
      //   })
      //   .catch((_) => {});
      this.dialogVisible = false;
    },
    findAllDevice() {
      this.$http.get("http://localhost:8081/findAllDevice").then((res) => {
        this.tableData = res.data;
        console.log(this.tableData);
      });
    },
  },
  mounted() {
    this.findAllDevice();
  },
};
</script>

<style>
.title-frame {
  font-weight: bold;
  margin-top: 10px;
  margin-right: 10px;
  width: 80px;
}
</style>
