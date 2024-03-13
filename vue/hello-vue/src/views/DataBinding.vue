<template>
    <p>입력하세요</p>
    <input type="text" v-bind:value="abbr" />
    <input type="text" v-model="normal" />
    <hr/>
    <abbr :title="normal">{{ abbr }}</abbr>
</template>
<script>
import { ref, reactive } from 'vue';

export default {
    name: 'DataBinding',
    components: {},
    //Composition Api
    setup() {
        const abbr = ref('OBJ')
        const normal = reactive('BeomJin Oh')
        
        return {
            abbr,
            normal
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