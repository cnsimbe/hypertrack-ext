package hypertrackExt;

import com.hypertrack.lib.HyperTrack;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.json.JSONException;
import org.json.JSONArray;
import org.apache.cordova.PluginResult;

/**
 * This class echoes a string called from JavaScript.
 */
public class hyperTrack extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("disablePushNotification")) {
            HyperTrack.disablePersistentNotification(true);
            return true;
        }
        return false;
    }

}
