package io.github.schntgaispock.slimehud.util;

import java.util.logging.Level;

import org.bukkit.ChatColor;
import org.bukkit.boss.BarColor;

import io.github.schntgaispock.slimehud.SlimeHUD;

public class Util {
    
    public static BarColor pickBarColorFromName(String name) {
        char colorCode = name.trim().toLowerCase().startsWith("§") ? name.charAt(1) : ' ';
        switch (colorCode) {
            case '4':
            case 'c':
                return BarColor.RED;
            
            case '6':
            case 'e':
                return BarColor.YELLOW;

            case '2':
            case 'a':
                return BarColor.GREEN;

            case '3':
            case 'b':
                return BarColor.BLUE;

            case '1':
            case '5':
            case '9':
                return BarColor.PURPLE;
        
            case 'd':
                return BarColor.PINK;

            default:
                return BarColor.WHITE;
        }

    }

    public static BarColor pickBarColorFromColor(String color) {
        switch (color.trim()) {
            case "red":
            case "yellow":
            case "green":
            case "blue":
            case "purple":
            case "pink":
            case "white":
                return BarColor.valueOf(color.toUpperCase());

            case "default":
            case "inherit":
                return BarColor.WHITE;
        
            default:
                SlimeHUD.log(Level.WARNING, "[WAILA HUD] 无效的 BossBar 颜色: " + color, "[WAILA HUD] 将使用默认的白色...");
                return BarColor.WHITE;
        }
    }

    public static ChatColor getColorFromCargoChannel(int channel) {
        switch (channel) {
            case 1:
                return ChatColor.WHITE;
            case 2:
                return ChatColor.GOLD;
            case 3:
                return ChatColor.BLUE; // No magenta
            case 4:
                return ChatColor.AQUA;
            case 5:
                return ChatColor.YELLOW;
            case 6:
                return ChatColor.GREEN;
            case 7:
                return ChatColor.LIGHT_PURPLE;
            case 8:
                return ChatColor.DARK_GRAY;
            case 9:
                return ChatColor.GRAY;
            case 10:
                return ChatColor.DARK_AQUA;
            case 11:
                return ChatColor.DARK_PURPLE;
            case 12:
                return ChatColor.DARK_BLUE;
            case 13:
                return ChatColor.RED; // No brown
            case 14:
                return ChatColor.DARK_GREEN;
            case 15:
                return ChatColor.DARK_RED;
            case 16:
                return ChatColor.BLACK;
        
            default:
                return ChatColor.WHITE;
        }
    }


}
