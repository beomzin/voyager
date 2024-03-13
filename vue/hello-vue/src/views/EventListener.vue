<template>
    <p>{{ counter + counter2 }}</p>
    <button @click="counter++">클릭</button>
    <button @click="onClick">클릭</button>
</template>
<script>
import { ref } from 'vue'

export default {
    name: 'EventListener',
    components: {},
    //Composition Api
    setup() {
        let counter = ref(0)

        const onClick = (evt) => {
            if(evt) {
                evt.preventDefault()
                counter.value++
            }
        }

        return {
            counter,
            onClick
        }
    },

    //Options Api
    data() {
        return {
            counter2 : 0
        }
    },
    methods: {
        onClick2: (evt) => {
            if(evt) {
                evt.preventDefault()
            }
            this.counter2++
        }
    }
}
</script>