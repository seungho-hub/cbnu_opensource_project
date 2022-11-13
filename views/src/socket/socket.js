import io from "socket.io-client";

import handler from "./eventListener/connection";

const mainSocket = io("/");

// mainSocket.io.on("connection", handler.handleConnectionError);

// mainSocket.io.on("reconnect_attempt", handler.handleReconnectAttempt);
// mainSocket.io.on("reconnect_error", handler.handleReconnectError);
// mainSocket.io.on("reconnect_failed", handler.handleReconnectFailed);
// mainSocket.io.on("ping", handler.handlePingPacket);

// mainSocket.io.on("error", (err) => {
//     console.error(err);
// });

export default mainSocket;