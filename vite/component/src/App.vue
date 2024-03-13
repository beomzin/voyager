<template>
  <p>{{ title }}</p>
  <counter></counter>  
  <counter></counter>  
  <counter></counter>  
</template>

<script>
import Counter from './components/Counter.vue';

export default {
  components: { Counter },
  
  setup() {
    const title = 'Vue 3 Demo'

    return {
      title
    }
  }
}
</script>