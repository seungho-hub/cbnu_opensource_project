import { writable } from "svelte/store";
import { socket } from "../socket/socket";

export function updateProducts() {
    products.update((prevProducts) => {});
}

export function addProduct(product) {
    products.update((prevProducts) => [...prevProducts, product]);
}

export function findProduct(code) {
    let result;
    // return new Promise((resolve, reject) => {
    //     socket.send("get/product", code);

    //     socket.on("r-get/product", (product) => [resolve(product)]);
    // });
}

function deleteProduct() {}

export const products = writable([{
        code: "#242644",
        name: "nike hoodie",
        img: "https://media.gucci.com/style/HEXEAF2DC_Center_0_0_2400x2400/1649338227/646953_XJD7O_9095_001_100_0000_Light--Gucci-Firenze-1921.jpg",
        description: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam dapibus ac metus rutrum mollis. Mauris in est ut risus egestas congue. Donec et lectus non sapien malesuada ornare eget eget mauris. ",
        price: "1,300,000",
    },
    {
        code: "#97242",
        name: "nike hoodie",
        img: "https://media.gucci.com/style/DarkGray_Center_0_0_490x490/1519402505/200035_KQWBG_9791_001_100_0000_Light.jpg",
        description: "Ut sit amet bibendum nibh. Phasellus vestibulum non quam ut vestibulum. Mauris at sapien ullamcorper, interdum tortor nec, tempus tortor. Vestibulum sollicitudin odio sit amet lobortis iaculis.",
        price: 130000,
    },
    {
        code: "#74533",
        name: "nike hoodie",
        img: "https://cdn.jentestore.io/resource/products/674094/674094_1.jpg",
        description: "Integer at lacinia purus. Phasellus porttitor, nisl ut vestibulum faucibus, tortor mauris tempus mauris, eu tincidunt turpis lectus a ligula. Sed quis elit tempor",
        price: "600,000",
    },
    {
        code: "#64442",
        name: "nike hoodie",
        img: "https://cdn.jentestore.io/resource/products/627665/627665_1.jpg?_=32754256",
        description: "Mauris condimentum in nisl in pulvinar. Aenean porta turpis sed aliquet tincidunt. Suspendisse potenti. Mauris condimentum ex est, id porta mauris lobortis a. Donec consequat pellentesque",
        price: "4,590,000",
    },
    {
        code: "#74533",
        name: "nike hoodie",
        img: "https://cdn.jentestore.io/resource/products/674094/674094_1.jpg",
        description: "Integer at lacinia purus. Phasellus porttitor, nisl ut vestibulum faucibus, tortor mauris tempus mauris, eu tincidunt turpis lectus a ligula. Sed quis elit tempor",
        price: "600,000",
    },
    {
        code: "#74533",
        name: "nike hoodie",
        img: "https://cdn.jentestore.io/resource/products/674094/674094_1.jpg",
        description: "Integer at lacinia purus. Phasellus porttitor, nisl ut vestibulum faucibus, tortor mauris tempus mauris, eu tincidunt turpis lectus a ligula. Sed quis elit tempor",
        price: "600,000",
    },
]);