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
  <modal id="product-detail-modal" transition:scale>
    <div class="top">
      <div class="img-wrapper">
        <img
          src="https://media.gucci.com/style/HEXEAF2DC_Center_0_0_2400x2400/1649338227/646953_XJD7O_9095_001_100_0000_Light--Gucci-Firenze-1921.jpg"
          alt=""
        />
      </div>
      <div class="info">
        <div class="label-code">
          <div class="label">
            <span>nike hoodie </span>
          </div>
          <div class="code">
            <span>#64442</span>
          </div>
        </div>

        <div class="link">
          <a
            href="https://www.stussy.co.kr/products/basic-stussy-hood-5?gclid=CjwKCAiAhKycBhAQEiwAgf19egM8xjWEBoQxB8P0hVQJLvJSYPpPGvwSSbW-_q7ATNj1wImOR9MqrxoCEegQAvD_BwE"
            >https://www.stussy.co.kr/products/basic-stussy-hood-5?gclid=CjwKCAiAhKycBhAQEiwAgf19egM8xjWEBoQxB8P0hVQJLvJSYPpPGvwSSbW-_q7ATNj1wImOR9MqrxoCEegQAvD_BwE</a
          >
        </div>
        <div class="price">
          <span>130,000 원</span>
        </div>
      </div>
    </div>

    <div class="mid">
      <div class="description">
        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam dapibus ac
        metus rutrum mollis. Mauris in est ut risus egestas congue. Donec et
        lectus non sapien malesuada ornare eget eget mauris.
      </div>
      <div class="participants">
        <div class="participant">
          <span>kangseungho</span>
        </div>

        <div class="participant">
          <span>seo</span>
        </div>
        <div class="participant">
          <span>jk </span>
        </div>
        <div class="participant">
          <span>undeducated kid </span>
        </div>
        <div class="participant">
          <span>ho-hub</span>
        </div>
      </div>
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
            span {
              font-size: 1.6em;
            }
          }
          .code {
            display: inline;
            span {
              font-size: 1em;
              color: var(--sig);
            }
          }
        }

        .link {
          width: $product-image-width;
          grid-area: link;
          text-overflow: ellipsis;
        }

        .price {
          grid-area: price;
          display: flex;
          align-items: flex-end;
          justify-content: end;
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
  }
</style>
