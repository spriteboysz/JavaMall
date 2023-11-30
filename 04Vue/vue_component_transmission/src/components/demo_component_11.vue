<template>
    <h3>子组件11</h3>
    <p>字符串</p>
    <p> {{ title }}</p>
    <p>数值</p>
    <p>{{ age }}</p>
    <p>数组</p>
    <p v-for="(name, index) in names" :key="index">{{ name }}</p>
    <p>对象</p>
    <p v-for="(v, k, index) in book" :key="index">{{ index }} {{ k }} {{ v }}</p>

    搜索：<input type="text" v-model="search">
</template>

<script>
export default {
    data() {
        return {
            search: ""
        }
    },
    methods: {},
    watch: {
        search(newValue, oldValue) {
            this.$emit("searchEvent", newValue)
        }
    },
    // props: ["title", "age", "names", "book"]
    props: {
        title: {
            type: [String, Number, Array, Object],
            default: "未定义",
            required: true
        },
        age: {
            type: Number,
            default: 0
        },
        names: {
            type: Array,
            default() {
                return ["空"]
            }
        },
        book: {
            type: Object
        }
    }
}

</script>

<style scoped>

</style>