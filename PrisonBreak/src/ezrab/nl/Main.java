package ezrab.nl;

import ezrab.nl.listeners.Login;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        PluginManager pluginManager = this.getServer().getPluginManager();
        pluginManager.registerEvents(new Login(), this);
    }

    @Override
    public void onDisable() {
    }
}
