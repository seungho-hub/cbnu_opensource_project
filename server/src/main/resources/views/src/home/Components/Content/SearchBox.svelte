<script>
  import { products } from "../../../stores/products";

  let searchText;
  export let isSearching;
  function search(searchText) {
    isSearching = true;
    console.log(searchText);

    products.update((items) => {
      let results = [];

      items.find((item) => {
        if (item.code.includes(searchText)) {
          console.log(item);
          results.push(item);
        }
      });

      return results;
    });

    setTimeout(() => {
      isSearching = false;
      console.log(isSearching);
    }, 2000);

    console.log(isSearching);
  }
</script>

<div id="search-box">
  <i class="fa-solid fa-magnifying-glass" />
  <input
    type="text"
    bind:value={searchText}
    on:input={() => {
      search(searchText);
    }}
  />
</div>

<style lang="scss">
  #search-box {
    grid-area: search-box;
    height: 2.5em;
    padding: 0.2em 1em;
    background-color: var(--bg-more-light-color);
    display: flex;
    align-items: center;

    input {
      width: 20em;
    }
  }
</style>
