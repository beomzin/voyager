<template>
    <p>{{ counter }}</p>
    <p v-if="counter < 5">5보다 작다.</p>
    <p v-else>5보다 크거나 같다</p>
    <button @click="counter++">클릭</button>
</template>
<script>
import { ref } from 'vue'

export default {
    name: 'v-if',
    components: {},
    //Composition Api
    setup() {
        let counter = ref(0)
        
        return {
           counter 
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