package com.example.themehotswap;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.util.Duration;

import java.net.URL;
import java.util.List;

public class ThemeManager {
    private final Scene scene;
    private final List<ThemePreset> themes = List.of(ThemePreset.values());
    private final Timeline autoCycleTimeline;
    private int currentIndex = 0;

    public ThemeManager(Scene scene) {
        this.scene = scene;
        autoCycleTimeline = new Timeline(new KeyFrame(Duration.seconds(2.2), event -> cycleToNext()));
        autoCycleTimeline.setCycleCount(Timeline.INDEFINITE);
        applyTheme(ThemePreset.DAYLIGHT);
    }

    public void applyTheme(ThemePreset preset) {
        currentIndex = themes.indexOf(preset);
        URL themeUrl = getClass().getResource(preset.getStylesheetPath());
        URL appCssUrl = getClass().getResource("/css/app.css");

        if (themeUrl == null || appCssUrl == null) {
            throw new IllegalStateException("Could not load theme CSS resources.");
        }

        scene.getStylesheets().setAll(themeUrl.toExternalForm(), appCssUrl.toExternalForm());
        scene.setUserData(preset.name());
    }

    public void applyThemeByIndex(int index) {
        if (index < 0 || index >= themes.size()) {
            return;
        }
        applyTheme(themes.get(index));
    }

    public void cycleToNext() {
        int nextIndex = (currentIndex + 1) % themes.size();
        applyTheme(themes.get(nextIndex));
    }

    public void startAutoCycle() {
        autoCycleTimeline.play();
    }

    public void stopAutoCycle() {
        autoCycleTimeline.stop();
    }

    public boolean isAutoCycleRunning() {
        return autoCycleTimeline.getStatus() == Animation.Status.RUNNING;
    }

    public ThemePreset getCurrentTheme() {
        return themes.get(currentIndex);
    }
}
