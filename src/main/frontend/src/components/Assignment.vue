<template>
  <div class="assignment-block">
   {{element.type}} {{ element.variableName }} = {{ element.expression }}
  </div>
</template>

<script>

export default {
  props: {
    element: Object
  }
}
</script>

<style>
@import '../jetbrains-mono.css';

.assignment-block {
  border: 1px solid black;
  padding: 10px;
  margin: 5px;
  border-radius: 4px;
  font-family: 'JetBrains Mono', monospace;
}
</style>