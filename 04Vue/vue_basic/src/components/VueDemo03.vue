<template>
    <h3>Demo03：条件渲染-IF</h3>
    <div v-if="flag1">你能看见我吗</div>
    <div v-else-if="flag2">那你还是看看我吧</div>
    <div v-else>default</div>

    <div v-show="flag2">v-show</div>
</template>

<script>
export default {
    data() {
        return {
            flag1: false,
            flag2: true
        }
    }
}
</script>


<style scoped>

</style>