<script>
  import { scale } from "svelte/transition";
  export let showProductDetailModal;
</script>

<div
  class="modal-bg"
  on:click|self={() => {
    showProductDetailModal = !showProductDetailModal;
  }}
>
  <modal id="product-detail-modal" transition:scale> sd </modal>
</div>

<style lang="scss">
  $product-image-width: 15em;
  #product-detail-modal {
    position: absolute;
    top: 5%;
    left: 30%;
    width: 40%;
    background-color: var(--bg-more-light-color);
    padding: 2em;
  }
</style>
