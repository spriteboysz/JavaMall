<template>
    <h3>Demo Event 01: 事件参数</h3>
    <button @click="addCount">Add</button>
    <p>{{ count }}</p>
</template>

<script>
export default {
    data() {
        return {
            count: 0
        }
    },
    methods: {
        addCount(e) {
            e.target.innerHTML = "Add " + this.count
            this.count++
        }
    }
}
</script>


<style scoped>

</style>