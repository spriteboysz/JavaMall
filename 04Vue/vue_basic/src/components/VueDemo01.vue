<template>
    <h3>Demo01: 文本插值</h3>
    <p>字符串: {{ msg }}</p>
    <p>数值加减: {{ num + 1 }}</p>
    <p>三目运算：{{ ok ? "Yes" : "No" }}</p>
    <p>字符串处理：{{ ss.split("").reverse().join("") }}</p>
    <p v-html="rawHtml"></p>
</template>

<script>
export default {
    data() {
        return {
            msg: "Hello World!",
            num: 10,
            ok: true,
            ss: "大家好",
            rawHtml: "<a herf='https://www.baidu.com'>百度</a>"
        }
    }
}
</script>

