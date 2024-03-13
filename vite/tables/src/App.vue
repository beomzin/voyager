<template>
  <MyTable :header="header" :rows="rows" />  
</template>

<script>
import MyTable from './components/MyTable.vue';

export default {
  name: 'App',
  components: { MyTable },

  //Options Api
  data() {
    return {
      header: ['1번 제목', '2번 제목'],
      rows: [
        [{ data: '1번 내용' }, { data: '2번 내용' }],
        [{ data: '1번 내용 2', colspan: 2 }],
        [{ data: '1번 내용 3', rowspan: 3 }, { data: '2번 내용 3'}],
        [{ data: '2번 내용 4' }],
        [{ data: '2번 내용 5' }]
      ]
    }
  },
  methods: {}
}
</script>