package net.zithium.tournaments.events;

import net.zithium.tournaments.tournament.Tournament;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class TournamentEndEvent extends Event {

    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private boolean cancelled = false;

    private Tournament tournament;

    public TournamentEndEvent(Tournament tournament) {
        this.tournament = tournament;
    }

    public Tournament getTournament() {
        return tournament;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }
}
