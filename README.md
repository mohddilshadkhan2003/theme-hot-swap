# Theme Hot-Swap

<div align="center">

  <img src="https://img.shields.io/badge/JavaFX-Theme%20Switcher-blue?style=for-the-badge&logo=java" alt="JavaFX Theme Switcher" />
  <img src="https://img.shields.io/badge/Status-Active-success?style=for-the-badge" alt="Project Status" />
  <img src="https://img.shields.io/badge/Style-CSS%20Live%20Theme-lightgrey?style=for-the-badge" alt="CSS Live Theme" />

  <h2>Live theme switching for JavaFX apps without restart</h2>

</div>

Theme Hot-Swap is a lightweight JavaFX theme system that lets you change the appearance of an app instantly using CSS and live stylesheet updates. Instead of restarting the application every time you want to test a new color scheme, you can switch themes on the fly and preview the result immediately.

This project is ideal for desktop applications, dashboards, admin panels, and modern UI prototypes that need a polished look and fast theme customization.

---

## Why This Project Exists

Sometimes UI work becomes slow because every color change requires rebuilding or restarting the app. Theme Hot-Swap solves this by letting you:

- change themes instantly
- update CSS styles in real time
- preview different looks without restarting the app
- keep your interface consistent and modern
- build custom theme packs for your app

---

## Features

- Instant theme switching
- Real-time CSS reload
- JavaFX-friendly styling
- Clean dark UI theme examples
- Easy customization for custom branding
- Smooth preview experience for design testing
- Works well for dashboards and desktop apps

---

## Demo

This section is a place to showcase your app preview.

Add a screenshot, GIF, or screen recording of your JavaFX app here:

```md
![Theme Hot-Swap Demo](assets/demo.png)
```

If you want, replace the example above with your real screenshot later.

---

## Quick Start

### Requirements

Before running the project, make sure you have:

- Java JDK 17 or higher
- JavaFX SDK 17 or newer
- Git
- An IDE such as IntelliJ IDEA, Eclipse, or VS Code
- Maven or Gradle if your project uses build automation

### Install

Clone the repository:

```bash
git clone https://github.com/mohddilshadkhan2003/theme-hot-swap.git
cd theme-hot-swap
```

### Run the Project

If you are using JavaFX in a project, run it with your IDE or build tool.

#### Option 1: Run from IDE

1. Open the project in your IDE.
2. Make sure JavaFX is configured correctly.
3. Run the main class that starts the JavaFX application.

#### Option 2: Run with Maven

```bash
mvn clean install
mvn javafx:run
```

#### Option 3: Run with Gradle

```bash
gradle clean build
gradle run
```

> Note: This repo provides the theme concept and CSS examples. Depending on your setup, you may need to connect it to your own JavaFX application entry point.

---

## Example Theme

This project includes a dark green theme inspired by modern dashboard design.

```css
.root {
    -fx-base: #0b1c13;
    -fx-background: #07130d;
    -fx-accent: #3dff8f;
    -fx-text-base-color: #b9f5cf;
    -fx-control-inner-background: #0b1c13;
}

.app-root {
    -fx-background-color: #07130d;
    -fx-text-fill: #b9f5cf;
}

.primary-button {
    -fx-background-color: #3dff8f;
    -fx-text-fill: #03120a;
}
```

This example shows how a JavaFX UI can be styled with reusable variables and theme colors.

---

## How It Works

The idea is simple:

1. Your application loads CSS theme files.
2. The theme defines colors, backgrounds, buttons, text, and layout styling.
3. You switch or reload the stylesheet dynamically.
4. The interface updates instantly without restarting the app.

This makes it ideal for testing different looks, dark mode/light mode support, or branding variations.

---

## Project Layout

The repository is intentionally small and focused. At a minimum, you will usually work with:

```text
theme-hot-swap/
├── README.md
├── src/                  # Theme files and app source
├── resources/            # CSS / UI assets (if used in your app)
├── pom.xml               # Maven config (if used)
├── build.gradle          # Gradle config (if used)
└── target/               # Built output
```

> The exact folder layout may vary depending on whether this is used inside a larger JavaFX project.

---

## Common Use Cases

- dark mode switching
- business dashboard theming
- branding and custom UI themes
- desktop app design previews
- live style prototyping

---

## Customization

To create your own theme:

1. copy an existing CSS file
2. change the color variables
3. update button, panel, and text colors
4. reload the stylesheet in your JavaFX app

Example customization ideas:

- dark mode
- light mode
- purple luxury look
- green cyberpunk look
- blue enterprise dashboard

---

## Troubleshooting

### JavaFX is not found

Make sure JavaFX is installed and added to your project dependencies or IDE configuration.

### App does not start

Check:

- Java version is 17+
- JavaFX is included correctly
- main class is configured properly

### Theme does not apply

Verify that:

- your CSS file path is correct
- the stylesheet is loaded at app startup
- CSS class names match your JavaFX controls

---

## Contributing

We welcome improvements, ideas, and new theme packs.

1. Fork the project
2. Create a feature branch
3. Make your changes
4. Commit them
5. Open a pull request

---

## License

This project is open source and available for use in personal and educational projects.

If you want to add a formal license later, you can choose MIT or Apache 2.0.

---

## Final Note

Theme Hot-Swap is a simple but powerful idea: make UI design flexible, fast, and flexible enough to update instantly. If you are building a JavaFX application and want a polished theme system, this project is a great starting point.

If you want to make this README even more premium, I can also add:

- a custom banner image
- a full feature comparison table
- a screenshot gallery section
- a stronger landing page style layout for GitHub
