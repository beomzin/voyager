<template>
    <h2>Small Items</h2>
    <p v-for="item in small_item_c" :key="item.id">{{ item.text }}</p>
    <p v-for="item in small_item_o" :key="item.id">{{ item.text }}</p>
    <h2>Large Item</h2>
    <p v-for="item in large_item_c" :key="item.id">{{ item.text }}</p>
    <p v-for="item in large_item_o" :key="item.id">{{ item.text }}</p>
</template>
<script>
import { reactive, computed } from 'vue';

export default {
    name: 'ComputedItem',
    components: {},
    //Composition Api
    setup() {
        const arr = reactive([
            { id: 1, text: '1번 아이템'},
            { id: 2, text: '2번 아이템'},
            { id: 3, text: '3번 아이템'},
            { id: 4, text: '4번 아이템'},
            { id: 5, text: '5번 아이템'}
        ])
        
        const small_item_c = computed(() => {
            return arr.filter((i) => i.id < 3) 
        })
        const large_item_c = computed(() => {
            return arr.filter((i) => i.id >= 3)
        })

        return {
            small_item_c,
            large_item_c            
        }
    },

    //Options Api
    data() {
        return {
            arr: [
                { id: 1, text: '1번 옵션 아이템'},
                { id: 2, text: '2번 옵션 아이템'},
                { id: 3, text: '3번 옵션 아이템'},
                { id: 4, text: '4번 옵션 아이템'},
                { id: 5, text: '5번 옵션 아이템'}
            ]
        }
    },
    computed: {
        small_item_o() {
            return this.arr.filter((i) => i.id < 3)
        },
        large_item_o() {
            return this.arr.filter((i) => i.id >= 3)
        }
    },

    methods: {}
}
</script>