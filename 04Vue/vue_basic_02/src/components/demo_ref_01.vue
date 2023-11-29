<template>
    <h3>Demo: 模版引用</h3>
    <div ref="container" class="container">{{ content }}</div>
    <input type="text" ref="username"/>
    <button @click="getElementHandle">获取元素</button>
</template>

<script>
export default {
    data() {
        return {
            content: "容器"
        }
    },
    methods: {
        getElementHandle() {
            console.log(this.$refs.container.innerHTML = "HAHA")
            console.log(this.$refs.username.value)
        }
    }
}
</script>


<style scoped>

</style>