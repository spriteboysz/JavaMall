<template>
    <h3>Demo02: 属性绑定</h3>
    <div :id="dynamicId" :class="dynamicClass" :title="dynamicTitle">测试</div>
    <button :disabled="dynamicButton">Button</button>
    <div v-bind="ObjectOfAttrs">测试多属性绑定</div>
</template>

<script>
export default {
    data() {
        return {
            dynamicClass: "appClass",
            dynamicId: "appId",
            dynamicTitle: null,
            dynamicButton: false,
            ObjectOfAttrs: {
                class: "appClass",
                id: "appId"
            }
        }
    }
}
</script>


<style>
.appClass {
    color: red;
    font-size: 30px;
}
</style>