<template>
    <h3>Demo 数组侦测</h3>
    <h4>添加数据</h4>
    <button @click="addBookHandler">添加图书</button>
    <ul>
        <li v-for="(book, index) in books" :key="index"> {{ book }}</li>
    </ul>
    <h4>合并数组</h4>
    <button @click="concatHandler">合并数组</button>
    <br/>
    数组1
    <label v-for="(num, index) in nums1" :key="index"> {{ num }} </label>
    数组2
    <label v-for="(num, index) in nums2" :key="index"> {{ num }} </label>
</template>

<script>
export default {
    data() {
        return {
            books: ["C", "C++", "Java", "Python"],
            nums1: [1, 2, 3, 4, 5],
            nums2: [6, 7, 8, 9, 10]
        }
    },
    methods: {
        addBookHandler() {
            this.books.push("Vue");
            this.books.concat("JavaScript"); // filter, concat, slice
            console.log(this.books);
            this.books = this.books.concat("ABC");
        },
        concatHandler() {
            this.nums1 = this.nums1.concat(this.nums2);
        }
    }
}
</script>

<style scoped>

</style>