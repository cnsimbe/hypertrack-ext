/********* hypertrack-ext.m Cordova Plugin Implementation *******/
#import "hypertrackExt.h"
#import <objc/runtime.h>


@implementation AppDelegate (notification)

- (BOOL)application:(UIApplication *)application didFinishLaunchingWithOptions:(NSDictionary *)launchOptions {
    ...
    [HyperTrack registerForNotifications];
}

-(void)application:(UIApplication *)application didRegisterForRemoteNotificationsWithDeviceToken:(nonnull NSData *)deviceToken{
    ...
    [HyperTrack didRegisterForRemoteNotificationsWithDeviceTokenWithDeviceToken:deviceToken];
}

-(void)application:(UIApplication *)application didFailToRegisterForRemoteNotificationsWithError:(nonnull NSError *)error{
    ...
    [HyperTrack didFailToRegisterForRemoteNotificationsWithErrorWithError:error];
}

- (void)application:(UIApplication *)application didReceiveRemoteNotification:(NSDictionary *)userInfo{
    if ([HyperTrack isHyperTrackNotificationWithUserInfo:userInfo]){
        [HyperTrack didReceiveRemoteNotificationWithUserInfo:userInfo];
    }

    // Additional handling for RCTPushNotificationManager
}

@end
