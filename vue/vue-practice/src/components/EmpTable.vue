<template>
    <table>
        <tr>
            <th>번호</th>
            <th>이름</th>
            <th>성별</th>
            <th>생년월일</th>
        </tr>
        <tr v-for="(emp, idx) in emps" :key="emp.no">
            <td>{{ idx + 1 }}</td>
            <td>{{ emp.name }}</td>
            <td>{{ emp.gender }}</td>
            <td>{{ emp.birth }}</td>
        </tr>
    </table>
</template>

<script setup>
import apiAxios from '@/api/axios'
import { ref } from 'vue'

const emps = ref()

apiAxios.getURL('api/emps')
    .then(res => {
        emps.value = res.data
        console.log(emps)
    })
    .catch(err => {
        console.log(err)
    })
</script>

<style scoped>
table {
    margin: 0px auto;
    border: 1px solid #000;
}

th {
    border-bottom: 2px solid #000;
}
</style>