
var exec = require('cordova/exec');
var hypertrackExt = {}


// Helper method to test sdk
hypertrackExt.disablePushNotification = function(disable, success, error) {
    exec(success, error, "hyperTrackExt", "disablePushNotification", [disable]);
};