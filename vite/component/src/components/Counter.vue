<template>
  <span>{{ counter_header }}</span>
  <button @click="count++" v-text="count" />
  <hr/> 
</template>
<script>
import { ref } from 'vue'

export default {
  name: 'counter-header',
  components: {},
  //Composition Api
  setup() {
    const counter_header = 'Counter '
    const count = ref(0)
    
    return {
      count,
      counter_header
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