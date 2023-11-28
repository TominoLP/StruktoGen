<script setup>
import Assignment from './components/Assignment.vue'

const elements = [
  { variableName: 'x', expression: '1 + 2' },
  { variableName: 'y', expression: 'x + 3' },
  { variableName: 'z', expression: 'y + 4' }
]

</script>


<template>

  <div id="app">
    <Assignment v-for="element in elements" :element="element" :key="element.variableName" />
  </div>

</template>

<style scoped>

</style>
