var server = require("./server");
var router = require("./router");
var requestHandloers = require("./requestHandlers");

var handle = {}
handle["/"] = requestHandloers.start;
handle["/start"] = requestHandloers.start;
handle["upload"] = requestHandloers.upload;

server.start(router.route,handle);