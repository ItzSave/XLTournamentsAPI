package fun.lewisdev.tournaments.objective;

import fun.lewisdev.tournaments.tournament.Tournament;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import java.util.*;

public abstract class XLObjective {
    
    public XLObjective(String name) {}

    public abstract boolean loadTournament(FileConfiguration config);

    public boolean canExecute(Tournament tournament, Player player) {
        return true;
    }

    public String getIdentifier() {
        return null;
    }

    public List<Tournament> getTournaments() {
        return new ArrayList<>();
    }

}
