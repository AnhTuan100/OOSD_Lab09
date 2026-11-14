import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class League {
    private final Set<Tournament> tournaments;

    public League() {
        this.tournaments = new HashSet<Tournament>();
    }

    public Set<Tournament> getTournaments() {
        return Collections.unmodifiableSet(tournaments);
    }

    void addTournament(Tournament tournament) {
        if (tournament != null) {
            tournaments.add(tournament);
        }
    }
}