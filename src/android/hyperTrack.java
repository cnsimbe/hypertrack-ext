package hypertrackExt;

import io.intercom.android.sdk.api.Api;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.apache.cordova.PluginResult;

/**
 * This class echoes a string called from JavaScript.
 */
public class hyperTrack extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("disablePushNotification")) {
            boolean disable = args.getBoolean(0);
            HyperTrack.disablePersistentNotification(disable);
            return true;
        }
        return false;
    }

}
