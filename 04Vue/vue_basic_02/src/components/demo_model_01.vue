<template>
    <h3>Demo: 表单输入绑定</h3>
    <form>
        <input type="text" v-model="message1"/>
        <p>{{ message1 }}</p>
        <input type="text" v-model.lazy="message2"/>
        <p>{{ message2 }}</p>
    </form>
</template>

<script>
export default {
    data() {
        return {
            message1: "",
            message2: ""
        }
    }
}
</script>

<style scoped>

</style>