
var exec = require('cordova/exec');
var hypertrackExt = {}


// Helper method to test sdk
hypertrackExt.disablePushNotification = function() {
	return new Promise(function(res,rej){
		exec(res, rej, "hyperTrackExt", "disablePushNotification", []);
	})
};


module.exports = hypertrackExt