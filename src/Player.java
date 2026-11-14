import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Player {
    private final Set<Tournament> tournaments;

    public Player() {
        this.tournaments = new HashSet<Tournament>();
    }

    public Set<Tournament> getTournaments() {
        return Collections.unmodifiableSet(tournaments);
    }

    public void addTournament(Tournament tournament) {
        if (tournament != null && !tournaments.contains(tournament)) {
            tournaments.add(tournament);
            tournament.addPlayer(this);
        }
    }

    public void removeTournament(Tournament tournament) {
        if (tournament != null && tournaments.contains(tournament)) {
            tournaments.remove(tournament);
            tournament.removePlayer(this);
        }
    }
}