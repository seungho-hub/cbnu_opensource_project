<script>
  export let product;
</script>

<div id="card">
  <div class="left">
    <div class="img-wrapper">
      <img src={product.img} alt="" />
    </div>
  </div>
  <div class="right">
    <p class="name-code">
      <span class="name">{product.name}</span>
      &nbsp
      <span class="code">{product.code}</span>
    </p>
    <p class="description">{product.description}</p>
    <div class="participants">
      <div class="participant">seungho</div>
      <div class="participant">kmc</div>
    </div>
    <p class="price">{product.price}원</p>
  </div>
</div>

<style lang="scss">
  $card-width: 100%;
  $card-height: 14em;
  $img-width: 10em;
  #card {
    width: $card-width;
    height: $card-height;
    display: flex;
    transition-duration: 0.2s;
    margin-bottom: 2em;
    background-color: var(--bg-more-light-color);
    &:hover {
      cursor: pointer;
      transform: translateY(-3%);
    }
    .left {
      .img-wrapper {
        width: $card-height;
        height: $card-height;
        overflow: hidden;
        display: flex;
        align-items: center;
        justify-content: center;
        img {
          width: $card-height;
          object-fit: cover;
        }
      }
    }
    .right {
      padding: 1em 1em;
      display: flex;
      flex-direction: column;
      justify-content: space-between;

      .name-code {
        margin-bottom: 0.8em;
        .name {
          font-size: 1.2em;
          font-weight: bold;
        }
        .code {
          font-size: 1em;
          color: var(--sig);
        }
      }

      .description {
        width: 100%;
        font-size: 1em;
        margin-bottom: 0.5em;
        // white-space: nowrap;
        overflow: hidden;
        text-overflow: ellipsis;
        color: gray;
      }
      .participants {
        display: flex;
        gap: 1em;
        .participant {
          padding: 0.3em 0.5em;
          background-color: var(--sig);
          color: var(--font-dark-color);
        }
      }
      .price {
        font-size: 1.1em;
        text-align: end;
      }
    }
  }
</style>
