<template>
    <h3>Demo Event 01: 事件参数</h3>
    <button @click="addCount1">Add</button>
    <p>{{ count }}</p>
    <button @click="addCount2('Hello', $event)">Add</button>
    <p>{{ count }}</p>

    <p @click="getNameHandler(book, $event)" v-for="(book,index) in books" :key="index">{{ book }}</p>
</template>

<script>
export default {
    data() {
        return {
            count: 0,
            books: ["C", "C++", "Java", "Python"]
        }
    },
    methods: {
        addCount1() {
            this.count++
        },
        addCount2(msg, e) {
            console.log(msg)
            e.target.innerHTML = "Add " + this.count
            this.count++
        },
        getNameHandler(name, e) {
            console.log(name);
            console.log(e)
        }
    }
}
</script>


<style scoped>

</style>