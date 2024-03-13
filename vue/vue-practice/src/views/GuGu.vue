<template>
  <h2>구구단</h2>
  <input type="text" v-model.number="dan" />
  <button @click="submit">check</button>
  <hr/>
  <div v-for="i in result" :key="i">{{ i }}</div>
</template>

<script>
import { ref } from 'vue'

export default {
  name: 'GuGu',
  components: {},
  //Composition Api
  setup() {
    const dan = ref('')
    const result = ref([])
    
    const submit = () => {
      result.value = []

      for(var i = 2; i < 10; i++) {
         result.value.push(dan.value + " X " + i + " = " + dan.value * i)
      }
    }
    
    return {
      dan,
      result,
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