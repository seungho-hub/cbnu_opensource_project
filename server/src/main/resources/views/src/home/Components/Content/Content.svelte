<script>
  import SearchBox from "./SearchBox.svelte";
  import Products from "./Products.svelte";
  let isSearching = false;

  import ProductFormModal from "../Modal/ProductFormModal.svelte";
  let showProductFormModal = false;

  import { products } from "../../../stores/products";
  import { auth } from "../../../stores/auth";
  let user;
  auth.subscribe((auth) => {
    user = auth.user;
  });

  function filterMine() {
    let results = [];
    products.update((itmes) => {
      itmes.forEach((item) => {
        if (item.register == user.username) {
          results.push(item);
        }
      });

      return results;
    });
  }

  function filterParticipant() {
    let results = [];
    products.update((itmes) => {
      itmes.forEach((item) => {
        if (item.participants.includes(user.username)) {
          results.push(item);
        }
      });

      return results;
    });
  }
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
    <button class="filter-mine" on:click={filterMine}>
      내가 등록한 상품 보기
    </button>
    <button class="filter-participant" on:click={filterParticipant}>
      내가 참여중인 상품 보기
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
    grid-template-areas: "search-box" "." "funcs" "products";
    grid-template-rows: 38px 2em 35px auto;
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

      .filter-mine {
        background-color: var(--bg-more-light-color);
      }

      .filter-participant {
        background-color: var(--bg-more-light-color);
      }
    }

    .product-list-wrapper {
      grid-area: products;
    }
  }
</style>
