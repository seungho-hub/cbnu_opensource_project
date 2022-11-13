<script>
  import { auth } from "../stores/auth";
  import Signin from "../auth/Signin.svelte";
  import { scale } from "svelte/transition";
</script>

{#if $auth.user}
  <section id="home" transition:scale>
    <h2>Home</h2>
    <button on:click={$auth.signout}>signout</button>
  </section>
{:else}
  <Signin />
{/if}

<style lang="scss">
  section#home {
    width: 90%;
    height: 90%;
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    background: #fff;
    border-radius: 10px;
    box-shadow: 1px 4px 22px -8px #0004;
    display: flex;
    overflow: hidden;
  }
</style>
