<template>
    <h3>Demo: Class绑定</h3>
    <p :class="myClass">class样式绑定</p>
    <p :class="objClass">class样式绑定-对象</p>
    <p :class="[arrActive, arrHasError]">class样式绑定-数组</p>
</template>

<script>
export default {
    data() {
        return {
            myClass: "demo",
            isActive: true,
            hasError: true,
            objClass: {
                'active': true,
                'text-danger': true
            },
            arrActive: 'active',
            arrHasError: 'text-danger'
        }
    }
}
</script>


<style scoped>
.active {
    font-size: 30px;
}

.text-danger {
    color: red
}
</style>