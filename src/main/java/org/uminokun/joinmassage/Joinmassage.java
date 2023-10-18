package org.uminokun.joinmassage;

import org.bukkit.plugin.java.JavaPlugin;

public final class Joinmassage extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("onEnableメソッドが呼び出されたよ！！");
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("test")) {
            // プレイヤーが /basic を実行すると、この部分の処理が実行されます...
            return true;
        } else if (cmd.getName().equalsIgnoreCase("basic")) {
            // プレイヤーが /basic2 を実行すると、この部分の処理が実行されます...
            if (!(sender instanceof Player)) {
                sender.sendMessage("このコマンドはゲーム内から実行してください。");
            } else {
                Player player = (Player) sender;
                // コマンドの実行処理...
            }
            return true;
        }
        return false;
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("onDisableメソッドが呼び出されたよ！！");
    }
}
