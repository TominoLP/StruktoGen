<script setup>

</script>

<template>
    <div class="forLoop-Block">
      <div class="forLoop-var">
        {{element.variable}}}; {{element.condition}}; {{element.increment}}
      </div>
      <div class="forLoop-expr">
        {{element.expression}}
      </div>
    </div>
</template>

<style scoped>

.forLoop-Block {
  border: 1px solid black;
  padding: 10px;
  margin: 5px;
  border-radius: 4px;
  font-family: 'JetBrains Mono', monospace;
}

.forLoop-var {
  border: 1px solid black;
  padding: 10px;
  margin: 5px;
  border-radius: 4px;
  font-family: 'JetBrains Mono', monospace;
}

.forLoop-expr {
  border: 1px solid black;
  padding: 10px;
  margin: 5px;
  border-radius: 4px;
  font-family: 'JetBrains Mono', monospace;
}

</style>