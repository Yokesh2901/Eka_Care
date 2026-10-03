# Eka Care 📱

> **Android application prototype for collecting and managing user profile information.**

Eka Care is an Android application prototype built with **Java and Android Jetpack components**. The current implementation provides a form-based workflow for entering a user's name, age, date of birth, and address, with a ViewModel and repository structure plus Room database components.

## ✨ Highlights

- 📱 Native Android application
- 🧾 User information form
- 📅 Date of Birth picker
- 🔢 Age validation
- 🏠 Address collection
- 🧠 ViewModel-based application flow
- 🗂️ Repository pattern
- 💾 Room database components
- 🎨 Material Design dependencies
- 🧪 Unit and instrumentation test setup
- 🔧 Android SDK 34 target configuration

## 🧩 Current User Flow

```text
             Open App
                │
                ▼
        User Information
                │
      ┌─────────┼─────────┐
      ▼         ▼         ▼
    Name       Age        DOB
      │         │         │
      └─────────┼─────────┘
                │
             Address
                │
                ▼
             Validate
                │
                ▼
            Save User
                │
                ▼
          Update LiveData
```

## 🏗️ Architecture

```text
┌──────────────────────┐
│     MainActivity     │
│    UI / Input Flow   │
└──────────┬───────────┘
           │
           ▼
┌──────────────────────┐
│     UserViewModel    │
│   State / UI Logic   │
└──────────┬───────────┘
           │
           ▼
┌──────────────────────┐
│    UserRepository    │
│    Data Boundary     │
└──────────┬───────────┘
           │
           ▼
┌──────────────────────┐
│     Room Layer       │
│ DAO / Database       │
└──────────────────────┘
```

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| Java | Android application logic |
| Android SDK | Native Android platform |
| AndroidX | Application compatibility |
| Material Components | UI components |
| ViewModel | UI state management |
| LiveData | Observable state |
| Room | Local database layer |
| Gradle | Build system |
| JUnit | Unit testing |
| Espresso | UI testing |

## 📂 Project Structure

```text
Eka_Care/
├── app/
│   ├── build.gradle
│   └── src/
│       ├── main/
│       │   ├── AndroidManifest.xml
│       │   ├── java/
│       │   │   ├── UserDao.java
│       │   │   ├── UserDatabase.java
│       │   │   ├── UserDetails.java
│       │   │   └── com/example/ekacare/
│       │   │       ├── MainActivity.java
│       │   │       ├── User.java
│       │   │       ├── UserRepository.java
│       │   │       └── UserViewModel.java
│       │   └── res/
│       │       └── layout/activity_main.xml
│       ├── test/
│       └── androidTest/
├── gradle/
├── gradlew
├── gradlew.bat
└── settings.gradle
```

## 🚀 Getting Started

### Prerequisites

- Android Studio
- JDK 8+
- Android SDK API 34
- Android emulator or physical Android device

### Clone

```bash
git clone https://github.com/Yokesh2901/Eka_Care.git
cd Eka_Care
```

Open the project in Android Studio, allow Gradle sync to finish, select a device, and run the app.

### Build from Windows

```bash
gradlew.bat assembleDebug
```

### Run tests

```bash
gradlew.bat test
```

## 📝 Form Validation

The current application checks:

- Name is not empty
- Age is provided
- Age is a positive integer
- Date of Birth is selected
- Address is provided

The DOB field uses Android's `DatePickerDialog`.

## 💾 Data Layer

The repository contains Room-related components including:

- `UserDetails`
- `UserDao`
- `UserDatabase`

It also contains `UserRepository` and `UserViewModel` layers.

> **Current status:** the persistence layer is a prototype. The current repository save method does not yet perform a complete database insert, so this should not be presented as a production healthcare-data platform.

## 🧪 Testing

The project includes scaffolding for:

- Local unit tests
- Android instrumentation tests
- Espresso UI tests

## 🔐 Privacy & Security

The application collects personal information such as name, age, date of birth, and address. A production version should add appropriate:

- Secure/encrypted storage
- Access controls
- Consent and privacy disclosures
- Data retention/deletion policies
- Secure backend communication
- Authentication and authorization

This repository is a development prototype and requires additional security and compliance work before handling real sensitive data.

## 🔮 Roadmap

- [ ] Complete Room persistence
- [ ] Add profile retrieval and editing
- [ ] Improve MVVM separation
- [ ] Add dependency injection
- [ ] Add encrypted local storage
- [ ] Add authentication
- [ ] Add backend/API integration
- [ ] Expand automated tests
- [ ] Improve Material UI
- [ ] Add release configuration

## 🎯 What This Project Demonstrates

**Android Development → Java → MVVM Concepts → ViewModel/LiveData → Room → Form Validation → Native UI**

The project demonstrates how a simple Android form can be structured into reusable UI, state-management, repository, and persistence layers.

## 👨‍💻 Author

**Yokesh S.**

Built as an Android development and local-data architecture project.

## 📄 License

No explicit open-source license is currently defined in this repository.

⭐ **Build simple. Structure clean. Scale later.**
