<template>
    <h3>Demo04: 列表渲染</h3>
    <p v-for="book of books">{{ book }}</p>
    <div v-for="(user, index) in users" key="{{index}}">
        <p>{{ index }} {{ user.user_name }} {{ user.user_age }}</p>
    </div>
    <div v-for="(value, key, index) in users[0]" key="{{key}}">
        <p>{{ value }} {{ key }} {{ index }}</p>
    </div>
</template>

<script>
export default {
    data() {
        return {
            books: ["C", "C++", "Java", "Python"],
            users: [
                {
                    user_id: 1001,
                    user_name: "赵A",
                    user_age: 18
                },
                {
                    user_id: 1002,
                    user_name: "钱B",
                    user_age: 17
                },
                {
                    user_id: 1003,
                    user_name: "孙C",
                    user_age: 19
                }
                ,
                {
                    user_id: 1004,
                    user_name: "李D",
                    user_age: 18
                }
            ]
        }
    }
}
</script>


<style scoped>

</style>