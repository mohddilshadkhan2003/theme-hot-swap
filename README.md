# Theme Hot-Swap

A JavaFX demo project that shows how to change the theme of an application at runtime without restarting it. The app keeps running in the same window, same JVM, and same state while the stylesheet is swapped live.

This project is a clean, beginner-friendly example of JavaFX theme hot-swapping using CSS files and `scene.getStylesheets().setAll(...)`.

## Why this project is useful

When building dashboards, admin tools, or build monitors, you often want to switch styles quickly while the app is already running.

In JavaFX, you can do this by:

- keeping the same `Scene`
- replacing the stylesheet list
- updating the UI instantly without restarting the app

This demo also includes a running build counter so you can see that the application state remains alive during the theme change.

## Features

- 4 themes built into the demo
- live hot-swap of CSS while app is running
- keyboard shortcuts for theme switching
- auto-cycle theme mode with 2.2 second delay
- build counter that continues working while themes change
- Maven + JavaFX project setup for JDK 21

## Theme shortcuts

Use the keyboard while the app is open:

- `1` → Daylight
- `2` → Midnight
- `3` → Dark Roast
- `4` → Terminal
- `Space` → toggle auto-cycle

## Project structure

```text
theme-hot-swap/
├── pom.xml
├── README.md
├── .gitignore
└── src/
    ├── main/
    │   ├── java/
    │   │   └── com/example/themehotswap/
    │   │       ├── BuildBoardApp.java
    │   │       ├── ThemeManager.java
    │   │       └── ThemePreset.java
    │   └── resources/
    │       └── css/
    │           ├── app.css
    │           └── themes/
    │               ├── daylight.css
    │               ├── midnight.css
    │               ├── roast.css
    │               └── terminal.css
```

## Requirements

Before running the project, make sure you have:

- JDK 21 installed
- Maven 3.9 or newer
- A terminal or command prompt

To confirm Java and Maven are installed:

```bash
java -version
mvn -version
```

If these commands work, you are ready to run the project.

## How to run the project

### 1) Open a terminal in the project folder

```bash
cd theme-hot-swap
```

### 2) Download project dependencies

```bash
mvn clean install
```

This step downloads JavaFX and Maven dependencies required by the project.

### 3) Start the app

```bash
mvn javafx:run
```

This starts the JavaFX application window.

### 4) Use the app

- Click theme buttons or press keys `1` to `4`
- Click `Auto-cycle` to switch themes automatically
- Click `Run build` to increase the build count and test that the app state survives the theme swap

## How theme hot-swap works

The main idea is very simple:

```java
scene.getStylesheets().setAll(
    getClass().getResource("/css/themes/midnight.css").toExternalForm(),
    getClass().getResource("/css/app.css").toExternalForm()
);
```

This replaces the active stylesheet list while the app is running.

Because the same `Scene` stays alive, the UI updates immediately without restarting the application.

## Important note about the app state

This demo keeps the same scene and same JVM instance. That means things like:

- the current build count
- the current stage/window
- other application state

stay alive while the style is changed.

This is the same concept used in real-world dashboards and monitoring tools.

## JavaFX version used

This project is configured for:

- Java 21
- JavaFX 21.0.2

## Clean build

If you want to build the project without running it:

```bash
mvn clean package
```

This creates a packaged Java application in the `target/` folder.

## Troubleshooting

### Error: Java version not supported

Use JDK 21. If your system has a different JDK version, install JDK 21 and set it as the active Java version.

### Error: Maven not found

Install Maven and make sure it is added to your system PATH.

### App does not start

Run:

```bash
mvn clean install
```

and then:

```bash
mvn javafx:run
```

If the project still does not start, check that JavaFX dependencies are properly downloaded and that your environment is using JDK 21.

## Summary

This project is a practical example of how to make a JavaFX application feel live and dynamic. It demonstrates a real world pattern used in dashboards and monitoring tools: change theme instantly, keep the application running, and preserve the state.

If you want a visual theme preview with live switching, this project gives you exactly that.
