<script>
  import Avatar from "./Avatar.svelte";

  import UserDetailModal from "../Modal/UserDetailModal.svelte";
  let showUserDetailModal = false;
</script>

<section id="top-bar">
  <Avatar bind:showUserDetailModal />

  {#if showUserDetailModal}
    <UserDetailModal bind:showUserDetailModal />
  {/if}
</section>

<style>
  #top-bar {
    grid-area: topbar;
    width: 100%;
    padding: 0.5em;
    display: grid;
    grid-template-areas: ". . . . . avatar";
    grid-template-columns: repeat(5, 1fr);
    grid-template-rows: 1fr;
    border-bottom: var(--border);
  }
</style>
