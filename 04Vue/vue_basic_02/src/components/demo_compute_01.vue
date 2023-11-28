<template>
    <h3>Demo：计算属性</h3>
    <p>{{ book.content.length > 0 ? "Yes" : "No" }}</p>
    <p>{{ bookContent }}</p>
    <p>{{ bookMethod() }}</p>
</template>

<script>
export default {
    data() {
        return {
            book: {
                name: "编程思想",
                content: ["Java", "C++", "C"]
            }
        }
    },
    computed: {
        bookContent() {
            return this.book.content.length > 0 ? "Yes" : "No"
        }
    },
    methods: {
        bookMethod() {
            return this.book.content.length > 0 ? "Yes" : "No"
        }
    }
}
</script>

<style scoped>

</style>