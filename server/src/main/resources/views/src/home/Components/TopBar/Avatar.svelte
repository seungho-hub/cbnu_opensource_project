<script>
  import { auth } from "../../../stores/auth";
  export let showUserDetailModal;
  let user;
  auth.subscribe((auth) => {
    user = auth.user;
  });
</script>

<div
  class="avatar"
  on:click={() => {
    showUserDetailModal = true;
  }}
>
  <div class="profile-image-wrapper">
    <img src={user.pfp} class="profile-image" alt="" />
  </div>
  <div class="username-wrapper">
    <span> {user.username} </span>
  </div>
</div>

<style lang="scss">
  .avatar {
    grid-area: "avatar";
    width: auto;
    height: 3em;
    padding: 1em;
    display: flex;
    align-items: center;
    &:hover {
      cursor: pointer;
    }
    .profile-image-wrapper {
      width: 2em;
      height: 2em;
      border-radius: 1em;
      overflow: hidden;
      img.profile-image {
        width: 100%;
      }
      margin-right: 1em;
    }

    .username-wrapper {
      color: var(--font-color);
    }
  }
</style>
