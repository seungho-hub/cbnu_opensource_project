<script>
  import SearchBox from "./SearchBox.svelte";
  import Products from "./Products.svelte";
  let isSearching = false;

  import ProductFormModal from "../Modal/ProductFormModal.svelte";
  let showProductFormModal = false;
</script>

<section id="content">
  <div class="search-box-wrapper">
    <SearchBox bind:isSearching />
  </div>

  <div class="funcs">
    <button
      class="product-modal-toggler"
      on:click={() => (showProductFormModal = !showProductFormModal)}
    >
      상품등록하기
    </button>
  </div>

  <div class="product-list-wrapper">
    <Products bind:isSearching />
  </div>

  {#if showProductFormModal}
    <ProductFormModal bind:showProductFormModal />
  {/if}
</section>

<style lang="scss">
  section#content {
    grid-area: content;
    padding: 0 1em;
    display: grid;
    grid-template-areas: "search-box" "funcs" "products";
    grid-template-rows: auto auto auto;
    grid-template-columns: 1fr;
    gap: 2em;
    .search-box-wrapper {
      grid-area: search-box;
      display: flex;
      justify-content: center;
      margin-top: 2em;
    }

    .funcs {
      grid-area: funcs;

      .product-modal-toggler {
        background-color: var(--sig);
        color: var(--font-dark-color);
      }
    }

    .product-list-wrapper {
      grid-area: products;
    }
  }
</style>
