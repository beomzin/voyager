<template>
    <h2>글자색 변경</h2>
    <h3 :style="{ color: color }">{{ msg }}</h3>
    <input type="text" v-model="msg" />
    <br/>
    <button v-for="(value, name) in colors" :key="value" @click="submit(value)">{{ name }}</button>
</template>

<script>
import { ref } from 'vue'

export default {
    name: 'color-change',
    components: {},
    //Composition Api
    setup() {
        const msg = ref('')
        const colors = ref({
            red: '#fc385c',
            green: '#38fca2',
            blue: '#388ffc'
        })

        const color = ref('')

        const submit = (value) => {
            color.value = value
        }
        
        return {
            msg,
            colors,
            color,
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