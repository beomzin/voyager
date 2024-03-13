import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import GuGu from '@/views/GuGu.vue'
import CssChange from '@/views/cssChange.vue'
import SampleDB from '@/views/SampleDB.vue'

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/gugu',
    name: 'gugu',
    component: GuGu
  },
  {
    path: '/csschange',
    name: 'css-change',
    component: CssChange
  },
  {
    path: '/sampledb',
    name: 'sample-db',
    component: SampleDB
  },

]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
