<template>
  <MyComponent title="Component 1" :data="[1, 2, 3]"></MyComponent>
  <RootNode msg="Message">
    <p>RootNode Example</p>
  </RootNode>
</template>
<script>
import MyComponent from './components/prop.vue';
import RootNode from './components/non-prop.vue'

export default {
  name: 'Props',
  components: { 
    MyComponent,
    RootNode
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