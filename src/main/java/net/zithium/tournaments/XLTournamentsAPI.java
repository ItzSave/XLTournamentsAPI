package net.zithium.tournaments;

import net.zithium.tournaments.objective.XLObjective;
import net.zithium.tournaments.tournament.Tournament;

public interface XLTournamentsAPI {

    /**
     * Register an objective
     *
     * @param objective The objective to register
     */
    void registerObjective(XLObjective objective);

    /**
     * Register an objective with a required dependency
     *
     * @param objective The objective to register
     * @param requiredPlugin The required plugin in order for the objective to function
     */
    void registerObjective(XLObjective objective, String requiredPlugin);

    /**
     * Get a tournament
     *
     * @param identifier The ID of the tournament (file name)
     *
     * @return The Tournament object if found, otherwise null
     */
    Tournament getTournament(String identifier);

}
