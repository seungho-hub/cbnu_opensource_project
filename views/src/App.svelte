<script>
  //   import mainSocket from "./socket/socket";
  import Router from "svelte-spa-router";
  import Home from "./home/home.svelte";
</script>

<main>
  <Router
    routes={{
      "/*": Home,
    }}
  />
</main>

<style>
  main {
    width: 100vw;
    height: 100vh;
    background: var(--bg-color);
    display: flex;
    align-items: center;
    justify-content: center;
  }
</style>
