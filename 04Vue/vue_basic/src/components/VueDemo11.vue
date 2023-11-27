<template>
    <h3>Demo11: 事件处理</h3>
    <button @click="count1++">inline Add 1</button>
    <p>Count1 is : {{ count1 }}</p>
    <button @click="add()">method Add 1</button>
    <p>Count2 is : {{ count2 }}</p>
</template>

<script>
export default {
    data() {
        return {
            count1: 0,
            count2: 0
        }
    },
    methods: {
        add() {
            console.log("按钮2被点击")
            return this.count2++
        }
    }
}
</script>


<style scoped>

</style>