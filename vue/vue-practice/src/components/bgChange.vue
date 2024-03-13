<template>
    <h2>배경색 변경</h2>
    <input type="text" v-model="color" placeholder="ex) red, #fc385c"/>
    <button @click="submit">change</button>
    <div class="a" :style="change">{{ text }}</div>
</template>

<script>
import { ref } from 'vue'

export default {
    name: 'bg-change',
    components: {},
    //Composition Api
    setup() {
        const color = ref('')
        const change = ref('')
        const text = ref('')

        const submit = () => {
            change.value = {
                backgroundColor: color.value,
                borderColor: color.value
            }

            text.value = color.value
        }
        

        return {
            color,
            change,
            text,
            submit
        }
    },

    //Options Api
    data() {
        return {
            
        }
    },
    methods: {}
}
</script>

<style>
.a {
 width: 100px;
 height: 100px;
 border: 1px solid #000;
 margin: 0px auto;
}
</style>