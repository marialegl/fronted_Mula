import UIKit
import shared

@UIApplicationMain
class AppDelegate: UIResponder, UIApplicationDelegate {
    

    var window: UIWindow?

    func application(
        _ application: UIApplication,
        didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey: Any]?
    ) -> Bool {
        window = UIWindow(frame: UIScreen.main.bounds)

        startSplash {
            self.showMainScreen()
        }

        return true
    }

    // Función para mostrar la pantalla principal
    private func showMainScreen() {
        let mainViewController = MainViewController() // Cambia esto al controlador principal de tu app
        window?.rootViewController = mainViewController
        window?.makeKeyAndVisible()
    }
}
