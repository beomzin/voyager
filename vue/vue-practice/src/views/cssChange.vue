<template>
    <BgChange />
    <hr/>
    <ColorChange />
</template>

<script>
import BgChange from '@/components/bgChange.vue'
import ColorChange from '@/components/ColorChange.vue'

export default {
    name: 'css-change',
    components: {
        BgChange,
        ColorChange
    },
    //Composition Api
    setup() {
        
        return {
            
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