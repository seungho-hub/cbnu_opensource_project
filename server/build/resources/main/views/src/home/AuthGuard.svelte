<script>
  import { auth } from "../stores/auth";
  import Signin from "../auth/Signin.svelte";
  import Home from "./home.svelte";
</script>

{#if $auth.user}
  <Home />
{:else}
  <Signin />
{/if}

<style lang="scss">
</style>
