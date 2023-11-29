<template>
    <div>
        <h3>Article</h3>
        <MyComponent/>
    </div>
</template>

<script>

import {defineComponent} from "vue";
import MyComponent from "@/components/MyComponent.vue";

export default defineComponent({
    components: {MyComponent}
})
</script>


<style scoped>
h3 {
    width: 80%;
    text-align: center;
    line-height: 100px;
    box-sizing: border-box;
    margin: 50px auto 0;
    background: #999;
}
</style>