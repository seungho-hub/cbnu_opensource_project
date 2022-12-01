<script>
  export let showProductFormModal;
</script>

<div
  class="modal-bg"
  on:click|self={() => {
    showProductFormModal = !showProductFormModal;
    console.log(showProductFormModal);
  }}
>
  <modal id="product-create-modal">
    <form class="product-form">
      <input type="file" hidden />
      <input type="text" name="" id="" />

      <button>등록하기</button>
    </form>
  </modal>
</div>

<style lang="scss">
  #product-create-modal {
    position: absolute;
    top: 5%;
    left: 30%;
    width: 40%;
    height: 60%;
    background-color: var(--bg-more-light-color);
    padding: 2em;

    .product-form {
      display: grid;

      input {
        background-color: var(--bg-color);
      }
    }
  }
</style>
