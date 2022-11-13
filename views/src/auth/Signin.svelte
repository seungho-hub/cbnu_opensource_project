<script>
  import { scale } from "svelte/transition";
  import { auth } from "../stores/auth";

  let email;
  let password;

  function submit() {
    $auth.signin(email, password, (err) => {
      if (err) {
        alert(err);
      }
    });
  }
</script>

<section class="signin-section" transition:scale>
  <h4 class="logo">
    <img src="../favicon.png" class="logo-img" /><span class="logo-text"
      >MoA MoA</span
    >
  </h4>
  <form id="signin-form" on:submit|preventDefault={submit}>
    <input type="email" placeholder="E-MAIL" bind:value={email} />
    <input type="password" placeholder="PASSWORD" bind:value={password} />
    <div class="account-btns">
      <button class="account-btn signin" type="submit">로그인</button>
      <a href="#" class="account-btn signup">계정이 없으신가요?</a>
    </div>

    <div class="oauth-btns">
      <button class="oauth-btn google">
        <img src="../images/google.png" alt="" />
        <span>구글 계정으로 로그인</span></button
      >
      <button class="oauth-btn kakao"
        ><img src="../images/kakao.png" alt="" /><span
          >카카오 계정으로 로그인</span
        ></button
      >
    </div>
  </form>
</section>

<style lang="scss">
  @import url("https://fonts.googleapis.com/css2?family=Permanent+Marker&display=swap");
  .signin-section {
    position: absolute;
    top: 25%;
    left: 35%;
    width: 30%;
    height: 40%;

    display: flex;
    flex-direction: column;
    align-items: center;

    .logo {
      display: flex;
      justify-content: center;
      gap: 1em;
      margin-bottom: 2em;

      .logo-img {
        width: 3em;
      }
      .logo-text {
        font-family: "Permanent Marker", cursive;
        color: var(--font-color);
        display: flex;
        align-items: center;
        font-size: 2em;
      }
    }

    #signin-form {
      display: flex;
      align-items: center;
      flex-direction: column;
      gap: 2em;
      width: 60%;
      input {
        background-color: var(--bg-more-light-color);
        color: var(--font-color);
        width: 100%;
      }

      .account-btns {
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        width: 100%;
        gap: 1em;
        .signin {
          width: 100%;
          background-color: var(--sig);
          color: var(--font-dar-color);
        }
        .signup {
          font-size: 0.8em;
        }
      }
    }
  }

  .oauth-btns {
    display: flex;
    flex-direction: column;
    align-items: center;
    width: 100%;
    .oauth-btn {
      padding: 0.5em 1em;
      width: 100%;
      border-radius: 8px;
      display: flex;
      align-items: center;

      background: var(--btn-color);
      color: #fff;
      -webkit-box-shadow: 0px 9px 15px -11px rgba(88, 54, 114, 1);
      -moz-box-shadow: 0px 9px 15px -11px rgba(88, 54, 114, 1);
      box-shadow: 0px 9px 15px -11px rgba(88, 54, 114, 1);
      margin: 5px;

      img {
        margin-right: 1em;
        width: 1.5em;
        height: 1.5em;
      }
      span {
        width: 100%;
      }
      &.google {
        background-color: white;
        color: var(--font-dark-color);
      }

      &.kakao {
        background-color: #fff43b;
        color: var(--font-dark-color);
      }
    }
  }
</style>
