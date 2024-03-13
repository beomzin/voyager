<template>
  <div id="date">
    {{ date }}
  </div>
  <div id="date2">
    {{ date2 }}
  </div>
  <hr/>
  <p>{{ msg }}</p>
  <hr/>
  <p>줄임말과 원래말을 입력하세요</p>
  <input type="text" v-bind:value="abbr" />
  <input type="text" v-model="normal" />
  <hr/>
  <abbr :title="normal">{{ abbr }}</abbr>
  <hr/>
  <p>{{ counter }}</p>
  <p v-if="counter < 5">5보다 작습니다.</p>
  <p v-else>5와 같거나 큽니다.</p>
  <button @click.prevent="counter++" @keyup.enter.prevent>클릭하면 숫자가 올라갑니다.</button>
  <hr/>
  <div style="width: 200px">
    <ol>
      <li v-for="item in items">{{ item }}</li>
    </ol>
  </div>
</template>

<script>
import {ref} from 'vue'
import {reactive} from 'vue'

export default {
  data() {
    return {
      date2: Date().toString(),
    }
  },

  setup() {
    const date = Date().toString()
    const msg = "HELLO"
    const abbr = ref('OBJ')
    const normal = ref('OH BEOMJIN')

    let counter = ref(0)

    const items = reactive(['1번', '2번', '3번'])

    return {
      date, 
      msg,
      abbr, normal,
      counter,
      items
    }
  },
}
</script>
