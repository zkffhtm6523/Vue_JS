// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
//ES6 문법은 자바와 비슷, node_modules에 깔린 문법
import Vue from 'vue'   //vue 라이브러리 import
import App from './App' //App.vue
import axios from 'axios'

import { library } from '@fortawesome/fontawesome-svg-core'
import { fas } from '@fortawesome/free-solid-svg-icons'
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'

//fas가 전체 다 가져오는 것
library.add(fas)

Vue.component('font-awesome-icon', FontAwesomeIcon)

//hint 같은 거 받을 수 있음
Vue.config.productionTip = false
Vue.prototype.$http = axios

/* eslint-disable no-new */
new Vue({
  el: '#app',
  //component import 해서 쓰겠다고 설정 위에 import하고 component 설정
  components: { App },
  template: '<App/>'
})
