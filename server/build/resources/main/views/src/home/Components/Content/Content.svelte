<script>
  import SearchBox from "./SearchBox.svelte";
  import Products from "./Products.svelte";
  let isSearching = false;
  $: {
    console.log("at content : ", isSearching);
  }
</script>

<section id="content">
  <div class="search-box-wrapper">
    <SearchBox bind:isSearching />
  </div>

  <div class="product-list-wrapper">
    <Products bind:isSearching />
  </div>
</section>

<style lang="scss">
  section#content {
    grid-area: content;
    padding: 1em;
    display: grid;
    grid-template-areas: "search-box" ".";
    grid-template-rows: 1fr 7fr;

    .search-box-wrapper {
      grid-area: search-box;

      display: flex;
      justify-content: center;
    }
  }
</style>
