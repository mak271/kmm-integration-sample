//
//  simpleLoginIOSApp.swift
//  simpleLoginIOS
//
//  Created by DEVELOPER on 25.07.2022.
//

import SwiftUI
import shared

@main
struct simpleLoginIOSApp: App {
    var body: some Scene {
        WindowGroup {
            ContentView(viewModel: .init(loginRepository: LoginRepository(dataSource: LoginDataSource()), loginValidator: LoginDataValidator()))
        }
    }
}
