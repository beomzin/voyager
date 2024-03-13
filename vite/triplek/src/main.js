import { createApp } from 'vue/dist/vue.esm-bundler.js'
import { store } from './store/index.js'
import App from './App.vue'
import './style.css'
import './index.css'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap/dist/js/bootstrap.esm.min.js'

createApp(App).use(store).mount('#app')