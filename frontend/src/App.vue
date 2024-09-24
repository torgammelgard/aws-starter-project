<template>
  <div id="app">
    <h1>Test Backend Request</h1>
    <button @click="fetchData">Get Backend Data</button>
    <p v-if="backendData">{{ backendData }}</p>
  </div>
</template>

<script>
export default {
  data() {
    return {
      backendData: null
    };
  },
  methods: {
    async fetchData() {
      try {
        const response = await fetch('http://localhost:8080/api/test');  // Ensure the backend is running on port 8080
        const data = await response.text();
        this.backendData = data;
      } catch (error) {
        console.error("Error fetching data from backend:", error);
      }
    }
  }
};
</script>

<style scoped>
button {
  margin: 20px;
  padding: 10px 20px;
  background-color: #4CAF50;
  color: white;
  border: none;
  cursor: pointer;
}

button:hover {
  background-color: #45a049;
}
</style>