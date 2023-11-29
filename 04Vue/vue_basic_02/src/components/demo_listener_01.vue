<template>
    <h3>Demo 侦听器</h3>
    <p>{{ message}}</p>
    <button @click="clickHandle">修改数据</button>
</template>

<script>
export default {
    data() {
        return {
            message: "Hello"
        }
    },
    methods:{
      clickHandle(){
          this.message = "Hello world!";
      }
    },
    watch:{
        message(newValue, oldValue){
            console.log(oldValue, newValue);
        }
    }
}
</script>


<style scoped>

</style>