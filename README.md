# Theme Hot-Swap 🎨

**Dynamic theme switching for JavaFX applications without restarting!**

## What is Theme Hot-Swap?

Theme Hot-Swap lets you change the look and feel of your JavaFX applications instantly—no need to restart your app. Switch between different color themes, update styles, and see the changes live with a beautiful preview dashboard.

### Key Features ✨

- **Live Theme Switching** - Change themes instantly without restarting your application
- **Hot-Reload Stylesheets** - Update CSS styles in real-time
- **Live Preview Dashboard** - See how your themes look before applying them
- **Easy to Use** - Simple integration with existing JavaFX projects
- **Modern Green Theme** - Includes a sleek default dark theme with neon green accents

---

## Getting Started 🚀

### What You Need

Before you get started, make sure you have these installed on your computer:

1. **Java Development Kit (JDK)** - Version 11 or higher
   - Download from: [oracle.com/java](https://www.oracle.com/java/technologies/downloads/)

2. **JavaFX SDK** - Version 11 or higher
   - Download from: [gluonhq.com/products/javafx](https://gluonhq.com/products/javafx/)

3. **Git** - To clone this repository
   - Download from: [git-scm.com](https://git-scm.com/)

4. **Maven or Gradle** - For building the project
   - Maven: [maven.apache.org](https://maven.apache.org/)
   - Gradle: [gradle.org](https://gradle.org/)

### Installation Steps

#### Step 1: Clone the Repository

```bash
git clone https://github.com/mohddilshadkhan2003/theme-hot-swap.git
cd theme-hot-swap
```

#### Step 2: Set Up Your Project

**If using Maven:**

Add JavaFX dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>org.openjfx</groupId>
    <artifactId>javafx-controls</artifactId>
    <version>21.0.1</version>
</dependency>
<dependency>
    <groupId>org.openjfx</groupId>
    <artifactId>javafx-fxml</artifactId>
    <version>21.0.1</version>
</dependency>
```

**If using Gradle:**

Add to your `build.gradle`:

```gradle
dependencies {
    implementation 'org.openjfx:javafx-controls:21.0.1'
    implementation 'org.openjfx:javafx-fxml:21.0.1'
}
```

#### Step 3: Build the Project

**Using Maven:**

```bash
mvn clean install
mvn javafx:run
```

**Using Gradle:**

```bash
gradle clean build
gradle run
```

#### Step 4: Run the Application

```bash
java -jar target/theme-hot-swap.jar
```

Or run directly from your IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)

---

## How to Use 💡

### Basic Usage

1. **Launch the Application** - Run the project using the commands above
2. **Open the Theme Dashboard** - Access the live preview dashboard
3. **Select a Theme** - Choose from available themes or create your own
4. **Watch It Change** - See your application's theme update instantly
5. **No Restart Needed** - Keep working without interrupting your workflow

### Creating Your Own Theme

Themes are defined using CSS stylesheets. Here's an example of the default theme colors:

```css
.root {
    -fx-base: #0b1c13;              /* Base color */
    -fx-background: #07130d;        /* Background */
    -fx-accent: #3dff8f;            /* Accent (neon green) */
    -fx-text-base-color: #b9f5cf;   /* Text color */
}

.primary-button {
    -fx-background-color: #3dff8f;
    -fx-text-fill: #03120a;
}
```

Create your own by modifying these colors and adding to the `src/styles/` directory.

---

## Project Structure 📁

```
theme-hot-swap/
├── README.md                 # This file
├── pom.xml / build.gradle    # Project dependencies
├── src/
│   ├── main/
│   │   ├── java/            # JavaFX application code
│   │   └── resources/       # Images, FXML files, stylesheets
│   └── test/                # Test files
└── target/                  # Compiled output (created after building)
```

---

## Troubleshooting 🔧

**Issue: "JavaFX not found"**
- Make sure JavaFX SDK is properly installed and configured in your IDE
- Add JavaFX modules to your project settings

**Issue: "Application won't start"**
- Check if Java 11+ is installed: `java -version`
- Verify all dependencies are downloaded: `mvn install` or `gradle build`

**Issue: "Themes not changing"**
- Make sure your CSS files are in the correct directory
- Check the console for error messages

---

## Contributing 🤝

Want to improve Theme Hot-Swap? We'd love your help!

1. Fork this repository
2. Create a new branch (`git checkout -b feature/amazing-feature`)
3. Make your changes
4. Commit your changes (`git commit -m 'Add amazing feature'`)
5. Push to the branch (`git push origin feature/amazing-feature`)
6. Open a Pull Request

---

## License 📄

This project is open source and available under the MIT License.

---

## Questions or Issues? 💬

If you have any questions or run into problems:
- Open an [Issue](https://github.com/mohddilshadkhan2003/theme-hot-swap/issues)
- Check the [Discussions](https://github.com/mohddilshadkhan2003/theme-hot-swap/discussions)
- Start a [Discussion](https://github.com/mohddilshadkhan2003/theme-hot-swap/discussions)

---

**Happy theming! 🎨**
