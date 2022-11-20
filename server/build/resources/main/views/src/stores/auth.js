import { writable } from "svelte/store";
import socket from "../socket/socket";
import { nativgate } from "svelte-routing";

const signin = (email, password, cb) => {
    //send email, password to socket server
    const res = {
        status: 200,
        message: "찾을 수 없는 계정입니다.",
    };

    //signined successfully
    if (true) {
        auth.update((prevAuth) => ({
            ...prevAuth,
            user: {
                username: "seungho-hub",
                email: "kmc54320@gmail.com",
            },
        }));
        cb(null);
    } else {
        cb("로그인에 실패했습니다.");
    }
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