<template>
  <Inject></Inject>
</template>

<script>
import Inject from './components/Inject.vue';
import { provide } from 'vue'

export default {
  name: '',
  components: { Inject },
  provide: {
    msg: '메세지'
  }
}
</script>