exports.handleConnectionError = (err) => {
    if (err) {
        console.error("connection error raised");
    }
};

exports.handlePingPacket = (err) => {
    console.log("ping sended, recived completly");
};

exports.handleReconnectAttempt = (attempt) => {
    console.log("reconnect to server...", attempt);
};

exports.handleReconnectError = (err) => {
    if (err) {
        console.error("reconnect error : ", err);
    }
};
exports.handleReconnectFailed = (err) => {
    if (err) {
        console.error("reconnect failed");
    }
};