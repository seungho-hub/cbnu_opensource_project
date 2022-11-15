<script>
  import { auth } from "../stores/auth";
  import Signin from "../auth/Signin.svelte";
  import { scale } from "svelte/transition";
</script>

<section id="home" transition:scale>
  <h2>Home</h2>
  <button on:click={$auth.signout}>signout</button>
</section>

<style lang="scss">
  section#home {
    margin: 1em;
    background-color: red;
    width: 100%;
    height: 100%;
  }
</style>
