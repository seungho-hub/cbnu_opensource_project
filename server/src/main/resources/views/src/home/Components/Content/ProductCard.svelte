<script>
  import { auth } from "../../../stores/auth";
  export let product;

  let user;
  auth.subscribe((auth) => {
    user = auth.user;
  });
</script>

<div id="card">
  <div class="left">
    <div class="img-wrapper">
      <img src={product.img} alt="" />
    </div>
  </div>
  <div class="right">
    <div class="name-code">
      <p class="name">
        {product.name}
        {#if product.participants.includes(user.username)}<span
            class="participainting">(참가중)</span
          >{/if}
      </p>
      <p class="code">{product.code}</p>
    </div>
    <p class="description">{product.description}</p>
    <div class="participants">
      {#each product.participants as participant}
        <div class="participant">
          {participant}
        </div>
      {/each}
    </div>
    <div class="price">
      <span class="text">(1인)</span>
      &nbsp
      <span class="divided-price"> {product.divided_price} </span>
      &nbsp
      <span class="original-price">{product.price}원</span>
    </div>
  </div>

  <!-- <div class="buttons">
    {#if product.participants.includes(user.username)}
      <button>참여취소</button>
    {:else}
      <button>참여하기</button>
    {/if}
  </div> -->
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
        background-color: black;
        img {
          width: $card-height;
          object-fit: cover;
        }
      }
    }
    .right {
      width: 100%;
      padding: 1em 1em;
      display: flex;
      flex-direction: column;
      justify-content: space-between;

      .name-code {
        margin-bottom: 0.8em;
        .name {
          font-size: 1.2em;
          font-weight: bold;

          .participainting {
            color: #f85d5d;
          }
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
        display: flex;
        justify-content: end;
        .divided_price {
          color: var(--font-color);
        }
        .original-price {
          text-align: end;
          color: rgba(121, 121, 121, 0.5);
        }
      }
    }
  }
</style>
