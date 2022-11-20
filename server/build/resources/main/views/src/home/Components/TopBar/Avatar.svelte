<script>
  import { auth } from "../../../stores/auth";
</script>

<div class="avatar">
  <div class="profile-image-wrapper">
    <img
      src="https://thumbs.dreamstime.com/b/default-avatar-profile-vector-user-profile-default-avatar-profile-vector-user-profile-profile-179376714.jpg"
      class="profile-image"
      alt=""
    />
  </div>
  <div class="username-wrapper">
    <span> {$auth.username} </span>
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
