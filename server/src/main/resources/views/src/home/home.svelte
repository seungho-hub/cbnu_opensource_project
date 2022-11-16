<script>
  import { auth } from "../stores/auth";
  import Signin from "../auth/Signin.svelte";
  import { scale } from "svelte/transition";
  import Topbar from "./Components/Topbar/TopBar.svelte"
  import Content from "./Components/Content/Content.svelte";
  import Sidebar from "./Components/Sidebar/Sidebar.svelte"
</script>

<section id="home" transition:scale>
  <Topbar/>
  <Content/>
  <Sidebar/>
</section>

<style lang="scss">
  section#home {
    margin: 1em;
    width: 100%;
    height: 100%;
    display : grid;
    grid-template-areas : "topbar topbar" "content sidebar";
    grid-template-rows : 4em auto;
    grid-template-columns : 3fr 1fr;
  }
</style>
