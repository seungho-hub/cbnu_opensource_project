import { writable } from "svelte/store";

const signin = (email, password, cb) => {
  //signined successfully
  auth.set({
    signin,
    signout,
    user: {
      username: "seungho-hub",
      email: "kmc54320@gmail.com",
      pfp: "https://i.ibb.co/9y7YWJG/40098653-289712878496176-911631268414750720-n.jpg",
      count_of_registered_product: 1,
      count_of_moadedProduct: 2,
      payment: {
        image: "https://i.postimg.cc/tRZdBjD6/card.png",
        card_number: "5412-75**-****-****",
      },
    },
  });
  cb(null);
};

const signout = (cb) => {
  auth.update((prevAuth) => ({
    ...prevAuth,
    user: null,
  }));
};
export const auth = writable({
  signin,
  signout,
});
