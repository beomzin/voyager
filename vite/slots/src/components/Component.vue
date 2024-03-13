<template>
    <ul style="list-style-type: none">
      <li v-for="i in items">
        <slot :item="i"></slot>
      </li>
    </ul>
  </template>
  
  <script>
  export default {
    data() {
      return {
        items: [1, 2, 3],
      }
    },
  }
  </script>