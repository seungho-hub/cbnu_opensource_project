<script>
  import Avatar from "./Avatar.svelte";
</script>

<section id="top-bar">
  <Avatar />
</section>

<style>
  #top-bar {
    grid-area: topbar;
    width: 100%;
    padding : 0.5em;
    display: grid;
    grid-template-areas: ". . . . . avatar";
    grid-template-columns: repeat(10, 1fr);
    grid-template-rows: 1fr;
    border-bottom : var(--border);
  }
</style>
