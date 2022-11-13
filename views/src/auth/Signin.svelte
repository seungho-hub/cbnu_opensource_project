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
  <section class="login">
    <div class="login_box">
      <div class="left">
        <div class="contact">
          <form on:submit|preventDefault={submit}>
            <h3>계정</h3>
            <input type="email" placeholder="E-MAIL" bind:value={email} />
            <input
              type="password"
              placeholder="PASSWORD"
              bind:value={password}
            />
            <div class="account-btns">
              <button class="account-btn signin" type="submit">로그인</button>
              <button class="account-btn signup" type="button">계정생성</button>
            </div>

            <div class="oauth-btns">
              <button class="oauth-btn google">
                <img src="../images/google.png" alt="" />
                <span>Google 계정으로 로그인</span></button
              >
              <button class="oauth-btn kakao"
                ><img src="../images/kakao.png" alt="" /><span
                  >Kakao 계정으로 로그인</span
                ></button
              >
            </div>
          </form>
        </div>
      </div>
      <div class="right">
        <div class="right-text">
          <h2>MoA MoA</h2>
          <h5>많은 사람들과 돈을 모아 목표를 달성해보세요</h5>
        </div>
      </div>
    </div>
  </section>
</section>

<style lang="scss">
  img {
    width: 100%;
  }

  .login {
    position: relative;
  }

  .login_box {
    width: 1050px;
    height: 600px;
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    background: #fff;
    border-radius: 10px;
    box-shadow: 1px 4px 22px -8px #0004;
    display: flex;
    overflow: hidden;

    .left {
      width: 41%;
      height: 100%;
      padding: 25px 25px;
    }

    .right {
      width: 59%;
      height: 100%;
    }
  }

  .left {
    .top_link {
      a {
        color: #452a5a;
        font-weight: 400;
      }

      height: 20px;
    }

    .contact {
      display: flex;
      align-items: center;
      justify-content: center;
      align-self: center;
      height: 100%;
      width: 73%;
      margin: auto;

      .oauth-btns {
        display: flex;
        flex-direction: column;

        .oauth-btn {
          padding: 0.5em 1em;
          border: none;

          border-radius: 8px;
          display: flex;
          align-items: center;

          background: var(--btn-color);
          color: #fff;
          font-weight: bold;
          -webkit-box-shadow: 0px 9px 15px -11px rgba(88, 54, 114, 1);
          -moz-box-shadow: 0px 9px 15px -11px rgba(88, 54, 114, 1);
          box-shadow: 0px 9px 15px -11px rgba(88, 54, 114, 1);
          margin: 5px;

          img {
            margin-right: 1em;
            width: 1.5em;
            height: 1.5em;
          }
          &.google {
            background-color: white;
            color: var(--font-color);
          }

          &.kakao {
            background-color: #fff43b;
            color: var(--font-color);
          }
        }
      }
    }

    h3 {
      text-align: center;
      margin-bottom: 40px;
    }

    input {
      border: none;
      width: 80%;
      margin: 15px 0px;
      border-bottom: 1px solid #4f30677d;
      padding: 0.8em 1em;
      width: 100%;
      overflow: hidden;
      background: transparent;
      font-weight: 600;
      font-size: 0.9em;
      transition-duration: 0.3s;

      &:focus {
        outline: none;
      }
    }

    background: linear-gradient(-45deg, #dcd7e0, #fff);
  }

  .account-btns {
    display: flex;
    flex-direction: row;
    gap: 1em;
    .account-btn {
      flex: 1 1;
      border: none;
      padding: 1em 2em;
      border-radius: 8px;

      background: var(--btn-color);
      color: #fff;
      -webkit-box-shadow: 0px 9px 15px -11px rgba(88, 54, 114, 1);
      -moz-box-shadow: 0px 9px 15px -11px rgba(88, 54, 114, 1);
      box-shadow: 0px 9px 15px -11px rgba(88, 54, 114, 1);
    }
    margin-bottom: 3em;
  }

  .right {
    background: linear-gradient(
        212.38deg,
        rgba(242, 57, 127, 0.7) 0%,
        rgba(175, 70, 189, 0.71) 100%
      ),
      url(https://i.ibb.co/yVqyn8g/3d59c7cd-bde0-47fd-8604-41a1880ab3b5.jpg);
    background-size: cover;
    color: #fff;
    position: relative;

    .right-text {
      height: 100%;
      position: relative;
      transform: translate(0%, 45%);
    }
  }

  .right-text {
    h2 {
      display: block;
      width: 100%;
      text-align: center;
      font-size: 50px;
      font-weight: 500;
    }

    h5 {
      display: block;
      width: 100%;
      text-align: center;
      font-size: 19px;
      font-weight: 400;
    }
  }

  .right .right-inductor {
    position: absolute;
    width: 70px;
    height: 7px;
    background: #fff0;
    left: 50%;
    bottom: 70px;
    transform: translate(-50%, 0%);
  }

  .top_link img {
    width: 28px;
    padding-right: 7px;
    margin-top: -3px;
  }
</style>
