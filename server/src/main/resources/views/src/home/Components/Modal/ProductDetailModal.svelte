<script>
  import { scale } from "svelte/transition";
  import { auth } from "../../../stores/auth";
  import { products } from "../../../stores/products";
  let user;
  auth.subscribe((auth) => {
    user = auth.user;
  });

  export let bindVar;

  function closeProduct(code) {
    products.update((items) => {
      items = items.filter(function (item) {
        return item.code !== code;
      });

      bindVar.showProductDetailModal = false;
      return items;
    });
  }

  function cancleParticipant(code) {
    products.update((items) => {
      let item = items.find(function (item) {
        return item.code == code;
      });

      item.participants = item.participants.filter(
        (participant) => participant != user.username
      );
    });
  }
</script>

<div
  class="modal-bg"
  on:click|self={() => {
    bindVar.showProductDetailModal = !bindVar.showProductDetailModal;
  }}
>
  <modal id="product-detail-modal" transition:scale>
    <div class="top">
      <div class="img-wrapper">
        <img src={bindVar.targetProduct.img} alt="" />
      </div>
      <div class="info">
        <div class="label-code">
          <div class="label">
            <p>{bindVar.targetProduct.name}</p>
          </div>
          <div class="code">
            <p>{bindVar.targetProduct.code}</p>
          </div>
        </div>

        <div class="link">
          <a href={bindVar.targetProduct.url}>상품 링크</a>
        </div>
        <div class="price">
          <span class="text">(1인)</span>
          &nbsp
          <span class="divided-price"
            >{bindVar.targetProduct.divided_price}</span
          >
          &nbsp
          <p class="original-price">{bindVar.targetProduct.price}원</p>
        </div>
      </div>
    </div>

    <div class="mid">
      <div class="description">
        {bindVar.targetProduct.description}
      </div>
      <div class="participants">
        {#each bindVar.targetProduct.participants as participant}
          <div class="participant">
            <span>{participant}</span>
          </div>
        {/each}
      </div>
    </div>

    <div class="buttons">
      {#if bindVar.targetProduct.participants.includes(user.username)}
        <button
          class="cancle"
          on:click={cancleParticipant(bindVar.targetProduct.code)}
          >참여 취소</button
        >
      {:else if bindVar.targetProduct.register == user.username}
        <button
          class="close"
          on:click={() => {
            closeProduct(bindVar.targetProduct.code);
          }}>마감하기</button
        >
      {:else}
        <button class="participant">참여하기</button>
      {/if}
    </div>
  </modal>
</div>

<style lang="scss">
  $product-image-width: 100%;
  #product-detail-modal {
    position: absolute;
    top: 5%;
    left: 30%;
    width: 40%;
    background-color: var(--bg-more-light-color);
    padding: 2em;
<<<<<<< HEAD
=======
<<<<<<< Updated upstream
=======
>>>>>>> develop

    .top {
      display: grid;
      grid-template-areas: "img" "info";
      gap: 1em;
      .img-wrapper {
        grid-area: img;
        width: $product-image-width;
        height: $product-image-width;
        img {
          width: $product-image-width;
          height: $product-image-width;
        }
      }
      .info {
        grid-area: info;
        display: grid;
        grid-template-areas: "label-code" "link" "price";

        .label-code {
          grid-area: label-code;
          .label {
            display: inline;
<<<<<<< HEAD
            span {
=======
            p {
>>>>>>> develop
              font-size: 1.6em;
            }
          }
          .code {
            display: inline;
<<<<<<< HEAD
            span {
=======
            p {
>>>>>>> develop
              font-size: 1em;
              color: var(--sig);
            }
          }
        }

        .link {
<<<<<<< HEAD
=======
          margin-top: 1em;
>>>>>>> develop
          width: $product-image-width;
          grid-area: link;
          text-overflow: ellipsis;
        }

        .price {
          grid-area: price;
          display: flex;
          align-items: flex-end;
          justify-content: end;
<<<<<<< HEAD
=======
          .divided_price {
            color: var(--font-color);
          }
          .original-price {
            text-align: end;
            color: rgba(121, 121, 121, 0.5);
          }
>>>>>>> develop
        }
      }
    }
    .mid {
      padding: 0 1em;
      margin-top: 1.5em;
      .description {
        margin-bottom: 3em;
      }
      .participants {
        display: flex;
        gap: 1em;
        .participant {
          background-color: var(--sig);
          span {
            padding: 0.3em 0.5em;
            background-color: var(--sig);
            color: var(--font-dark-color);
          }

          &:hover {
            cursor: pointer;
          }
        }
      }
    }
<<<<<<< HEAD
=======

    .buttons {
      margin-top: 4em;
      button {
        width: 100%;
        border-radius: 0;
      }
      .cancle {
        background-color: #f85d5d;
        color: var(--font-dark-color);
      }

      .participant {
        background-color: var(--sig);
        color: var(--font-dark-color);
      }

      .close {
        background-color: #f57338;
        color: var(--font-dark-color);
      }
    }
>>>>>>> Stashed changes
>>>>>>> develop
  }
</style>
