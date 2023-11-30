<template>
    <h3>父组件01</h3>
    <DemoComponent11 :title="message" :age="age" :names="names" :book="book"/>
    <hr/>
    <DemoComponent12 @someEvent="getHandle"/>
    <p>接收数据：{{ msg }}</p>
    <hr/>
    <p>搜索内容：{{ content }}</p>
    <DemoComponent11 title="搜索" @searchEvent="getData"/>

    <p>---以下子组件---</p>
    <DemoComponent11 title/>
    <hr/>
    <DemoComponent12/>
</template>

<script>
import DemoComponent11 from "@/components/demo_component_11.vue"
import DemoComponent12 from "@/components/demo_component_12.vue"

export default {
    data() {
        return {
            message: "父组件传递字符串",
            age: 10,
            names: ["C", "C++", "Java"],
            book: {
                name: "C++编程思想",
                Author: "Deean",
                Price: 108.57
            },
            msg: "",
            content: ""
        }
    },
    methods: {
        getHandle(data) {
            this.msg = data
        },
        getData(data) {
            this.content = data
        }
    },
    components: {
        DemoComponent11,
        DemoComponent12
    }
}
</script>

<style scoped>

</style>