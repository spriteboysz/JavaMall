<template>
    <h3>Demo Event 02: 事件修饰符</h3>
    <h4>阻止默认事件</h4>
    <a @click="clickHandler01" href="https://www.baidu.com">百度</a>
    <a @click.prevent="clickHandler02" href="https://www.baidu.com">百度</a>
    <h4>阻止事件冒泡</h4>
    <div @click="clickDiv01">
        <p @click="clickP01">冒泡测试</p>
    </div>
    <div @click="clickDiv02">
        <p @click.stop="clickP02">冒泡测试</p>
    </div>
</template>

<script>
export default {
    data() {
        return {}
    },
    methods: {
        clickHandler01(e) {
            e.preventDefault();
            console.log("链接被点击")
        },
        clickHandler02(e) {
            // e.preventDefault();
            console.log("链接被点击")
        },
        clickDiv01() {
            console.log("DIV")
        },
        clickP01(e) {
            e.stopPropagation()
            console.log("P")
        },
        clickDiv02() {
            console.log("DIV")
        },
        clickP02(e) {
            // e.stopPropagation()
            console.log("P")
        }
    }
}

</script>


<style scoped>

</style>