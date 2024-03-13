<template>
  <p>{{ `[${msg1}] : ${msg2}` }}</p>
  <Component v-model:msg1="msg1" v-model:msg2="msg2" />
</template>

<script>
import Component from './components/Component.vue';

export default {
  name: '',
  components: { Component },
  //Composition Api
  setup() {
    
    return {
    }
  },

  //Options Api
  data() {
    return {
      msg1: '초기 메세지',
      msg2: '초기 메세지'
    }
  },
  methods: {}
}
</script>