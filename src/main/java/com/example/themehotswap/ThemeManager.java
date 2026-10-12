package com.example.themehotswap;

public enum ThemePreset {
    DAYLIGHT("Daylight", "/css/themes/daylight.css"),
    MIDNIGHT("Midnight", "/css/themes/midnight.css"),
    ROAST("Dark Roast", "/css/themes/roast.css"),
    TERMINAL("Terminal", "/css/themes/terminal.css");

    private final String label;
    private final String stylesheetPath;

    ThemePreset(String label, String stylesheetPath) {
        this.label = label;
        this.stylesheetPath = stylesheetPath;
    }

    public String getLabel() {
        return label;
    }

    public String getStylesheetPath() {
        return stylesheetPath;
    }
}
