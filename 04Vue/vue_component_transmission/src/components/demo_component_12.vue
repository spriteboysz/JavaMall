<template>
    <h3>子组件12</h3>
    <button @click="clickHandle">传递数据</button>
</template>

<script>
export default {
    data() {
        return {
            msg: "子组件12中DATA"
        }
    },
    methods: {
        clickHandle() {
            return this.$emit("someEvent", this.msg)
        }
    }
}

</script>

<style scoped>

</style>