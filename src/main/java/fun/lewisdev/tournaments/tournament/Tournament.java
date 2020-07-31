package fun.lewisdev.tournaments.tournament;

import fun.lewisdev.tournaments.objective.XLObjective;
import fun.lewisdev.tournaments.utility.Timeline;
import org.bukkit.OfflinePlayer;

import java.util.*;

public class Tournament {

    public void update() {

    }

    public void clearParticipants() {

    }

    public String getTimeRemaining() {
        return "N/A";
    }

    public int getPosition(UUID uuid) {
        return 0;
    }

    public int getScore(UUID uuid) {
        return 0;
    }

    public OfflinePlayer getPlayerFromPosition(int position) {
        return null;
    }

    public int getScoreFromPosition(int position) {
        return 0;
    }

    public void addParticipant(UUID uuid, int score, boolean insertDatabase) {

    }

    public void addScore(UUID uuid, Integer amount) {

    }

    public int getPlayersCompletedChallenge() {
        return 0;
    }

    public String getStartDay() {
        return null;
    }

    public String getEndDay() {
        return null;
    }

    public String getStartMonth() {
        return null;
    }

    public String getEndMonth() {
        return null;
    }

    public boolean isParticipant(UUID uuid) {
        return true;
    }

    public Map<UUID, Integer> getParticipants() {
        return new HashMap<>();
    }

    public boolean hasFinishedChallenge(UUID uuid) {
        return true;
    }

    public void removeParticipant(UUID uuid) {

    }

    public Map<UUID, Integer> getSortedParticipants() {
        return new HashMap<>();
    }

    public double getParticipationCost() {
        return 0.0;
    }

    public boolean isAutomaticParticipation() {
        return true;
    }

    public List<String> getParticipationActions() {
        return new ArrayList<>();
    }

    public String getIdentifier() {
        return null;
    }

    public boolean isChallenge() {
        return true;
    }

    public int getChallengeGoal() {
        return 0;
    }

    public XLObjective getObjective() {
        return null;
    }

    public Timeline getTimeline() {
        return null;
    }

    public int getLeaderboardRefresh() {
        return 0;
    }

    public TournamentStatus getStatus() {
        return null;
    }

    public List<String> getDisabledWorlds() {
        return new ArrayList<>();
    }
}
