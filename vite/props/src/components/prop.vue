<template>
    <h3 v-text="title" />
    <span v-for="i in data" :key="i">{{ i }}</span>
</template>
<script>
import { ref } from 'vue'

export default {
    name: 'my-component',
    components: {},
    props: {
        title: String,
        required: true,
        validator: function (value) {
            return typeof value == String
        },
        
        data: {
            type: Object,
            default: () => {
                return []
            }
        }
    },

    //Composition Api
    setup() {
        const count = ref(0)

        return {
            count
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