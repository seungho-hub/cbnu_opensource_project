<script>
  let searchText;
  export let isSearching;
  function search() {
    isSearching = true;
    setTimeout(() => {
      isSearching = false;
      console.log(isSearching);
    }, 2000);

    console.log(isSearching);
  }
</script>

<div id="search-box">
  <i class="fa-solid fa-magnifying-glass" />
  <input type="text" bind:value={searchText} on:input={search} />
</div>

<style lang="scss">
  #search-box {
    grid-area: search-box;
    height: 2.5em;
    padding: 0.2em 1em;
    margin-top: 2em;
    background-color: var(--bg-more-light-color);
    display: flex;
    align-items: center;

    input {
      width: 20em;
    }
  }
</style>
