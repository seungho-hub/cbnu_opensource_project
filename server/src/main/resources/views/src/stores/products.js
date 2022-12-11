import { writable } from "svelte/store";

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
        code: "#3d5c47f8-5f53-4814-b04f-c412d3f52cf2",
        register: "s_rain",
        name: "vape smile 오버사이즈 hoodie",
        img: "https://image.msscdn.net/images/goods_img/20201027/1664849/1664849_1_500.jpg?t=20201028161258",
        description: "예쁜 후디 돌려입으실분~ 참여해주세요",
        url: "http://www.google.co.kr",
        price: "1,300,000",
        divided_price: "325,000원",
        participants: ["seungho-hub", "killer-jo", "dongukk"],
        count_of_participants: 3,
    },
    {
        code: "#0dd48276-97bd-4443-a7e8-8ce5607c3759 ",
        register: "영지",
        name: "석교동 수영장 설치",
        img: "https://mblogthumb-phinf.pstatic.net/MjAxODAyMTNfMTU1/MDAxNTE4NDk1OTI1MTgz.V1vWMkzNUbZ0hDq9ewBor49nQ0CpOM7f9dFSE0eE2EMg.I2SXL4eMhi--gU3YUMKn_kink6ms6lMPlYN3Pkfn5FQg.JPEG.xivill/%EC%88%98%EC%98%81%EC%9E%A5.jpg?type=w800",
        description: "여름을 맞아 수영장을 설치하려고 합니다~ 참여해주신 분들만 이용가능하고 관리는 제가 할겁니다~",
        url: "https://www.moncler.com/ko-kr/men/outerwear/lightweight-down-jackets/helianthe-short-down-jacket-black-H20911A001185396Q999.html?size=5&ds_rl=1290932&gclid=CjwKCAiA-dCcBhBQEiwAeWidtWNJu_GcgtYp9hY2dhP1VCMIUImD1NpomNJpe6DNbNxmPsdxt9kp2BoCUpIQAvD_BwE&gclsrc=aw.ds",
        price: "6,000,000",
        divided_price: "600,000원",
        participants: [
            "김주영",
            "이선희",
            "도정임",
            "강승호",
            "주주",
            "클럽",
            "주연이",
            "김은비",
            "고미소",
        ],
        count_of_participants: 10,
    },
    {
        code: "#2cca255a-96ac-4dce-a1c7-39ee28da51cc",
        register: "balse_101",
        name: "몽클 쇼트 다운",
        img: "https://moncler-cdn.thron.com/delivery/public/image/moncler/H20911A001185396Q999_R/dpx6uv/std/1024x1536/helianthe-%EC%87%BC%ED%8A%B8-%EB%8B%A4%EC%9A%B4-%EC%9E%AC%ED%82%B7.jpg?scalemode=centered&adjustcrop=reduce&quality=80&format=WEBP",
        description: "우영이가 갖고싶다는데 돈이 없어서 못샀던거 생일선물로 사줍시다~",
        url: "https://www.moncler.com/ko-kr/men/outerwear/lightweight-down-jackets/helianthe-short-down-jacket-black-H20911A001185396Q999.html?size=5&ds_rl=1290932&gclid=CjwKCAiA-dCcBhBQEiwAeWidtWNJu_GcgtYp9hY2dhP1VCMIUImD1NpomNJpe6DNbNxmPsdxt9kp2BoCUpIQAvD_BwE&gclsrc=aw.ds",
        price: "1,150,000",
        divided_price: "575,000원",
        participants: ["seungho-hub"],
        count_of_participants: 1,
    },
    {
        code: "#f5adf4ee-8d21-4791-8b7a-25b681bc5e48",
        name: "코오롱 캠프 텐트 공유 하실분들~",
        register: "seungho-hub",
        img: "https://t1.daumcdn.net/cfile/tistory/2626D635519ADFAB09",
        description: "여름시즌이라 소풍을 많이 가는데 텐트 렌탈 비용이 너무 비싸더라고요~ 같이 사서 일정맞춰서 사용하면 좋을 것 같아요!",
        url: "https://www.moncler.com/ko-kr/men/outerwear/lightweight-down-jackets/helianthe-short-down-jacket-black-H20911A001185396Q999.html?size=5&ds_rl=1290932&gclid=CjwKCAiA-dCcBhBQEiwAeWidtWNJu_GcgtYp9hY2dhP1VCMIUImD1NpomNJpe6DNbNxmPsdxt9kp2BoCUpIQAvD_BwE&gclsrc=aw.ds",
        price: "1,720,000",
        divided_price: "344,000원",
        participants: ["김지윤", "uneducated-kid", "blase_101", "엄정아"],
        count_of_participants: 4,
    },

    {
        code: "#2c780a18-277f-40e0-9b22-2e2fa1f32d52",
        register: "xhung_a",
        name: "모노그램 모티프 드레스",
        img: "https://assets.burberry.com/is/image/Burberryltd/ECD5AE5E-75D8-4A1B-BF94-D7D5B7C2FB68?$BBY_V2_SL_1x1$&wid=1251&hei=1251",
        description: "화사가 입고나왔을때 갖고싶다고 한 게 기억나서 사줄려고 합니다!",
        url: "https://kr.burberry.com/monogram-motif-rib-knit-wool-dress-p80584011?istCompanyId=3de8510c-ef25-4fc0-84fd-230462aae87d&istFeedId=67c9ca4f-56ad-4a7a-9ae5-cb214e3a488a&istItemId=rxpqlrqir&istBid=t&pla=true&gclid=CjwKCAiA-dCcBhBQEiwAeWidtdI9OgiVSzRo46ybWZOuNuXLr7WpLeBudYbaVmbGbWwBfpkT0-rTyhoC558QAvD_BwE&gclsrc=aw.ds",
        price: "980,000",
        divided_price: "196,000원",
        participants: ["s_rain", "educated_kid", "blase_101", "_xhunga"],
        count_of_participants: 5,
    },
]);