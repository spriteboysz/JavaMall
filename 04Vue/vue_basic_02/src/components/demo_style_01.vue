<template>
    <h3>Demo: Style绑定</h3>
    <p :style="{color:'red'}">Style绑定</p>
    <p :style="{color:activeColor}">Style绑定</p>
    <p :style="activeObj">Style绑定</p>
</template>

<script>
export default {
    data() {
        return {
            activeColor: "green",
            activeObj: {
                color: "red",
                fontSize: "30px"
            }
        }
    }
}
</script>

<style scoped>

</style>