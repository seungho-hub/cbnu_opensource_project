<script>
  import ProductCard from "./ProductCard.svelte";
  import { slide } from "svelte/transition";
  export let isSearching;

  $: {
    console.log("at products : ", isSearching);
  }

  let products = [
    {
      code: "#242644",
      name: "nike hoodie",
      img: "https://media.gucci.com/style/HEXEAF2DC_Center_0_0_2400x2400/1649338227/646953_XJD7O_9095_001_100_0000_Light--Gucci-Firenze-1921.jpg",
      description:
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam dapibus ac metus rutrum mollis. Mauris in est ut risus egestas congue. Donec et lectus non sapien malesuada ornare eget eget mauris. ",
      price: "1,300,000",
    },
    {
      code: "#97242",
      name: "nike hoodie",
      img: "https://media.gucci.com/style/DarkGray_Center_0_0_490x490/1519402505/200035_KQWBG_9791_001_100_0000_Light.jpg",
      description:
        "Ut sit amet bibendum nibh. Phasellus vestibulum non quam ut vestibulum. Mauris at sapien ullamcorper, interdum tortor nec, tempus tortor. Vestibulum sollicitudin odio sit amet lobortis iaculis.",
      price: 130000,
    },
    {
      code: "#74533",
      name: "nike hoodie",
      img: "https://cdn.jentestore.io/resource/products/674094/674094_1.jpg",
      description:
        "Integer at lacinia purus. Phasellus porttitor, nisl ut vestibulum faucibus, tortor mauris tempus mauris, eu tincidunt turpis lectus a ligula. Sed quis elit tempor",
      price: "600,000",
    },
    {
      code: "#64442",
      name: "nike hoodie",
      img: "https://cdn.jentestore.io/resource/products/627665/627665_1.jpg?_=32754256",
      description:
        "Mauris condimentum in nisl in pulvinar. Aenean porta turpis sed aliquet tincidunt. Suspendisse potenti. Mauris condimentum ex est, id porta mauris lobortis a. Donec consequat pellentesque",
      price: "4,590,000",
    },
    {
      code: "#74533",
      name: "nike hoodie",
      img: "https://cdn.jentestore.io/resource/products/674094/674094_1.jpg",
      description:
        "Integer at lacinia purus. Phasellus porttitor, nisl ut vestibulum faucibus, tortor mauris tempus mauris, eu tincidunt turpis lectus a ligula. Sed quis elit tempor",
      price: "600,000",
    },
    {
      code: "#74533",
      name: "nike hoodie",
      img: "https://cdn.jentestore.io/resource/products/674094/674094_1.jpg",
      description:
        "Integer at lacinia purus. Phasellus porttitor, nisl ut vestibulum faucibus, tortor mauris tempus mauris, eu tincidunt turpis lectus a ligula. Sed quis elit tempor",
      price: "600,000",
    },
  ];
</script>

{#if isSearching}
  <div class="loader">Loading...</div>
{:else}
  <ul class="products">
    {#each products as product}
      <li transition:slide><ProductCard {product} /></li>
    {/each}
  </ul>
{/if}

<style lang="scss">
  ul.products {
    grid-area: products;
    height: calc(100vh - 15em);
    overflow: scroll;
    li {
      display: flex;
      align-items: center;
      justify-content: center;
    }
  }
  .loader {
    color: #ffffff;
    font-size: 0.5em;
    margin: 100px auto;
    width: 0.5em;
    height: 0.5em;
    border-radius: 50%;
    position: relative;
    text-indent: -9999em;
    -webkit-animation: load4 1.3s infinite linear;
    animation: load4 1.3s infinite linear;
    -webkit-transform: translateZ(0);
    -ms-transform: translateZ(0);
    transform: translateZ(0);
  }
  @-webkit-keyframes load4 {
    0%,
    100% {
      box-shadow: 0 -3em 0 0.2em, 2em -2em 0 0em, 3em 0 0 -1em, 2em 2em 0 -1em,
        0 3em 0 -1em, -2em 2em 0 -1em, -3em 0 0 -1em, -2em -2em 0 0;
    }
    12.5% {
      box-shadow: 0 -3em 0 0, 2em -2em 0 0.2em, 3em 0 0 0, 2em 2em 0 -1em,
        0 3em 0 -1em, -2em 2em 0 -1em, -3em 0 0 -1em, -2em -2em 0 -1em;
    }
    25% {
      box-shadow: 0 -3em 0 -0.5em, 2em -2em 0 0, 3em 0 0 0.2em, 2em 2em 0 0,
        0 3em 0 -1em, -2em 2em 0 -1em, -3em 0 0 -1em, -2em -2em 0 -1em;
    }
    37.5% {
      box-shadow: 0 -3em 0 -1em, 2em -2em 0 -1em, 3em 0em 0 0, 2em 2em 0 0.2em,
        0 3em 0 0em, -2em 2em 0 -1em, -3em 0em 0 -1em, -2em -2em 0 -1em;
    }
    50% {
      box-shadow: 0 -3em 0 -1em, 2em -2em 0 -1em, 3em 0 0 -1em, 2em 2em 0 0em,
        0 3em 0 0.2em, -2em 2em 0 0, -3em 0em 0 -1em, -2em -2em 0 -1em;
    }
    62.5% {
      box-shadow: 0 -3em 0 -1em, 2em -2em 0 -1em, 3em 0 0 -1em, 2em 2em 0 -1em,
        0 3em 0 0, -2em 2em 0 0.2em, -3em 0 0 0, -2em -2em 0 -1em;
    }
    75% {
      box-shadow: 0em -3em 0 -1em, 2em -2em 0 -1em, 3em 0em 0 -1em,
        2em 2em 0 -1em, 0 3em 0 -1em, -2em 2em 0 0, -3em 0em 0 0.2em,
        -2em -2em 0 0;
    }
    87.5% {
      box-shadow: 0em -3em 0 0, 2em -2em 0 -1em, 3em 0 0 -1em, 2em 2em 0 -1em,
        0 3em 0 -1em, -2em 2em 0 0, -3em 0em 0 0, -2em -2em 0 0.2em;
    }
  }
  @keyframes load4 {
    0%,
    100% {
      box-shadow: 0 -3em 0 0.2em, 2em -2em 0 0em, 3em 0 0 -1em, 2em 2em 0 -1em,
        0 3em 0 -1em, -2em 2em 0 -1em, -3em 0 0 -1em, -2em -2em 0 0;
    }
    12.5% {
      box-shadow: 0 -3em 0 0, 2em -2em 0 0.2em, 3em 0 0 0, 2em 2em 0 -1em,
        0 3em 0 -1em, -2em 2em 0 -1em, -3em 0 0 -1em, -2em -2em 0 -1em;
    }
    25% {
      box-shadow: 0 -3em 0 -0.5em, 2em -2em 0 0, 3em 0 0 0.2em, 2em 2em 0 0,
        0 3em 0 -1em, -2em 2em 0 -1em, -3em 0 0 -1em, -2em -2em 0 -1em;
    }
    37.5% {
      box-shadow: 0 -3em 0 -1em, 2em -2em 0 -1em, 3em 0em 0 0, 2em 2em 0 0.2em,
        0 3em 0 0em, -2em 2em 0 -1em, -3em 0em 0 -1em, -2em -2em 0 -1em;
    }
    50% {
      box-shadow: 0 -3em 0 -1em, 2em -2em 0 -1em, 3em 0 0 -1em, 2em 2em 0 0em,
        0 3em 0 0.2em, -2em 2em 0 0, -3em 0em 0 -1em, -2em -2em 0 -1em;
    }
    62.5% {
      box-shadow: 0 -3em 0 -1em, 2em -2em 0 -1em, 3em 0 0 -1em, 2em 2em 0 -1em,
        0 3em 0 0, -2em 2em 0 0.2em, -3em 0 0 0, -2em -2em 0 -1em;
    }
    75% {
      box-shadow: 0em -3em 0 -1em, 2em -2em 0 -1em, 3em 0em 0 -1em,
        2em 2em 0 -1em, 0 3em 0 -1em, -2em 2em 0 0, -3em 0em 0 0.2em,
        -2em -2em 0 0;
    }
    87.5% {
      box-shadow: 0em -3em 0 0, 2em -2em 0 -1em, 3em 0 0 -1em, 2em 2em 0 -1em,
        0 3em 0 -1em, -2em 2em 0 0, -3em 0em 0 0, -2em -2em 0 0.2em;
    }
  }
</style>
