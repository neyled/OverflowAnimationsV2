package club.sk1er.mods.sk1eroldanimations.command;

import club.sk1er.mods.core.ModCore;
import club.sk1er.mods.sk1eroldanimations.Sk1erOldAnimations;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;

import java.util.Collections;
import java.util.List;

public class OldAnimationsCommand extends CommandBase {
    @Override
    public String getCommandName() {
        return "oldanimations";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/oldanimations";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) {
        ModCore.getInstance().getGuiHandler().open(Sk1erOldAnimations.oldAnimationsSettings.gui());
    }

    @Override
    public List<String> getCommandAliases() {
        return Collections.singletonList("animations");
    }

    @Override
    public int getRequiredPermissionLevel() {
        return -1;
    }
}
