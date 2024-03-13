import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import DataBinding from '@/views/DataBinding.vue'
import EventListener from '@/views/EventListener.vue'
import v_if from '@/views/v-if.vue'
import v_for from '@/views/v-for.vue'

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/about',
    name: 'about',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
  },
  {
    path: '/dataBinding',
    name: 'DataBinding',
    component: DataBinding
  },
  {
    path: '/eventListener',
    name: 'EventListener',
    component: EventListener
  },
  {
    path: '/v_if',
    name: 'v-if',
    component: v_if
  },
  {
    path: '/v_for',
    name: 'v-for',
    component: v_for
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
