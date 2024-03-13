<template>
    <div style="width: 200px">
        <ol>
            <li v-for="item in items" :key="item">{{ item }}</li>
        </ol>
    </div>
</template>
<script>
import { reactive } from 'vue';

export default {
    name: 'v-for',
    components: {},
    //Composition Api
    setup() {
        const items = reactive(['1번', '2번', '3번'])

        return {
            items
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