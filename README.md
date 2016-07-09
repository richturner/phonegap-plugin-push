#phonegap-plugin-push MODIFIED

This is a modified version of the [ponegap-plugin-push](https://github.com/phonegap/phonegap-plugin-push) plugin that allows the cordova app to be started in the background when a silent (data) push notification is received. It uses the [cordova-plugin-background-app](https://github.com/MobileChromeApps/cordova-plugin-background-app) plugin to provide the background launching and please refer to that plugins documentation to see how you can detect a background (no UI) start up of your app.

There are very few changes to the original plugin code and currently implementation is limited to Android.

> Register and receive push notifications

# What is this?

This plugin offers support to receive and handle native push notifications with a **single unified API**, and **with no dependency on any other plugins**.

- [Reporting Issues](docs/ISSUES.md)
- [Installation](docs/INSTALLATION.md)
- [API reference](docs/API.md)
- [Typescript support](docs/TYPESCRIPT.md)
- [Examples](docs/EXAMPLES.md)
- [Platform support](docs/PLATFORM_SUPPORT.md)
- [Cloud build support (PG Build, IntelXDK)](docs/PHONEGAP_BUILD.md)
- [Push notification payload details](docs/PAYLOAD.md)
- [Contributing](.github/CONTRIBUTING.md)
- [License (MIT)](MIT-LICENSE)
