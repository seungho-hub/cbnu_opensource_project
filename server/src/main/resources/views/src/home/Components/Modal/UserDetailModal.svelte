<script>
  import { auth } from "../../../stores/auth";
  import { scale } from "svelte/transition";
  export let showUserDetailModal;

  let user;
  auth.subscribe((auth) => {
    user = auth.user;
  });

  var clientKey = "test_ck_D5GePWvyJnrK0W0k6q8gLzN97Eoq";
  var tossPayments = TossPayments(clientKey); // 클라이언트 키로 초기화하기

  function registerPayment() {
    tossPayments.requestBillingAuth("카드", {
      // 결제 수단 파라미터
      // 빌링키 발급 요청을 위한 파라미터
      customerKey: "test",
      successUrl: "http://172.30.1.59/user/payments/toss/billing_auth/success",
      failUrl: "http://172.30.1.59/user/payments/toss/billing_auth/fail",
    });
  }
</script>

<div
  class="modal-bg"
  on:click|self={() => {
    showUserDetailModal = false;
  }}
>
  <modal id="user-detail-modal" transition:scale>
    <div class="pfp-wrapper">
      <div class="pfp">
        <img src={user.pfp} alt="" />
      </div>
    </div>
    <div class="info">
      <div class="left">
        <p class="username">{user.username}</p>
        <p class="email">{user.email}</p>
      </div>
      <div class="right">
        <p class="instagram">@_educated_kid</p>
      </div>
    </div>
    <div class="payment">
      <h2>결제 수단</h2>
      <div class="card-wrapper">
        <div class="card">
          <div class="img-wrapper">
            {#if user.payment}
              <img src={user.payment.image} alt="" />
            {:else}
              <div class="plz-register-payment">결제수단을 등록해주세요</div>
            {/if}
          </div>
          {#if user.payment}
            <div class="number">
              <div class="card-number">
                {user.payment.card_number}
              </div>
            </div>
          {:else}{/if}
        </div>
      </div>
      <div class="buttons">
        {#if user.payment}
          <button class="delete">결제수단 삭제</button>
          <button class="change" on:click={registerPayment}
            >결제수단 변경</button
          >
        {:else}
          <button id="registerPaymentBtn" on:click={registerPayment}
            >결제수단 생성</button
          >
        {/if}
      </div>
    </div>
  </modal>
</div>

<style lang="scss">
  $pfp-width: 15em;
  $pfp-height: 15em;
  $payment-width: 15em;
  #user-detail-modal {
    position: absolute;
    top: 5%;
    left: 30%;
    width: 40%;
    background-color: var(--bg-more-light-color);
    padding: 2em;
    display: grid;
    grid-template-areas: "pfp" "info" "payment";
    grid-template-rows: 3fr 1fr 5fr;
    .pfp-wrapper {
      grid-area: pfp;
      display: flex;
      align-items: center;
      justify-content: center;
      .pfp {
        justify-content: center;
        width: $pfp-width;
        height: $pfp-height;
        display: flex;
        align-items: center;
        justify-content: center;
        border-radius: calc($pfp-width / 2);
        overflow: hidden;
        background-color: black;
        img {
          width: 100%;
        }
      }
    }

    .info {
      grid-area: info;
      display: flex;
      justify-content: end;
      flex-direction: column;
      padding-bottom: 1em;
      border-bottom: 0.5px solid gray;

      display: flex;
      flex-direction: row;
      justify-content: space-between;
      .left {
        text-align: start;
      }
      .right {
        display: flex;
        align-items: flex-end;
        p {
          padding-bottom: 0.5em;
          background-color: #f3ec78;
          background-image: radial-gradient(
            circle at 30% 107%,
            #fdf497 0%,
            #fdf497 5%,
            #fd5949 45%,
            #d6249f 60%,
            #285aeb 90%
          );
          background-size: 100%;
          -webkit-background-clip: text;
          -moz-background-clip: text;
          -webkit-text-fill-color: transparent;
          -moz-text-fill-color: transparent;
        }
      }
      .username {
        color: var(--sig);
        font-size: 1.4em;
        margin-bottom: 0.3em;
      }

      .email {
        font-size: 0.8em;
        color: gray;
      }
    }

    .payment {
      grid-area: payment;
      margin-top: 2em;
      h2 {
        text-align: center;
        font-size: 1.4em;
      }
      .card-wrapper {
        display: flex;
        align-items: center;
        justify-content: center;
        .card {
          margin-top: 3em;
          border: none;

          img {
            width: $payment-width;
            border-radius: 0.8em;
          }

          .number {
            margin-top: 0.5em;
          }
        }
      }

      .buttons {
        margin-top: 2em;
        display: flex;
        flex-direction: row;
        align-items: center;
        justify-content: center;
        gap: 1em;
        .delete {
          background-color: #f85d5d;
          color: var(--font-dark-color);
        }
        .change {
          background-color: var(--sig);
          color: var(--font-dark-color);
        }

        #registerPaymentBtn {
          background-color: var(--sig);
          color: var(--font-dark-color);
        }
      }
    }
  }
</style>
