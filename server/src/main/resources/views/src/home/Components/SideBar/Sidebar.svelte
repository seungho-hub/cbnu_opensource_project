<section id="side-bar">
  <ul class="messages">
    <li>
      <div class="message">
        <span class="text">
          참여하신 #2c780a18-277f-40e0-9b22-2e2fa1f32d52 상품의 참여가
          마감되었습니다.
        </span>
      </div>
    </li>

    <li>
      <div class="message">
        #93751831-fe0f-4fea-80e5-85d8ae5278f3 상품에 참여했습니다.
      </div>
    </li>

    <li>
      <div class="message important">
        #2c780a18-277f-40e0-9b22-2e2fa1f32d52 상품의 결제가 완료되었습니다.
      </div>
    </li>

    <li>
      <div class="message">
        #93751831-fe0f-4fea-80e5-85d8ae5278f3 상품의 참여에 취소했습니다.
      </div>
    </li>
  </ul>
</section>

<style lang="scss">
  section#side-bar {
    grid-area: sidebar;
    border-left: var(--border);
    padding: 1em;

    .messages {
      margin-top: 2em;
      display: flex;
      gap: 1em;
      flex-direction: column;
      .message {
        padding: 1em;
        border-radius: 1em;
        background-color: var(--bg-more-light-color);
        &.important {
          background-color: var(--sig);
        }
      }
    }
  }
</style>
