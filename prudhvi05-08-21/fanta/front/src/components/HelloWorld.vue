<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <ul><li v-for="(r, i) in res" v-bind:key="i">{{ r }}</li></ul>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String,
  },
  data() {
    return {
      res: []
    }
  },
  mounted() {
    fetch('/api').then(r => r.json())
    .then(body => {
      console.log(body)
      this.res = body
    })
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
