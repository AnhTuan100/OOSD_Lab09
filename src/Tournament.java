import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Tournament {
    private final League league;

    private final Set<Round> rounds;

    private final Set<Player> players;

    public Tournament(League league) {
        if (league == null) {
            throw new IllegalArgumentException("Tournament must belong to a League.");
        }
        this.league = league;
        this.rounds = new HashSet<Round>();
        this.players = new HashSet<Player>();

        league.addTournament(this);
    }

    public League getLeague() {
        return league;
    }

    public Set<Round> getRounds() {
        return Collections.unmodifiableSet(rounds);
    }

    void addRound(Round round) {
        if (round != null) {
            rounds.add(round);
        }
    }

    public Set<Player> getPlayers() {
        return Collections.unmodifiableSet(players);
    }

    public void addPlayer(Player player) {
        if (player != null && !players.contains(player)) {
            players.add(player);
            player.addTournament(this);
        }
    }

    public void removePlayer(Player player) {
        if (player != null && players.contains(player)) {
            players.remove(player);
            player.removeTournament(this);
        }
    }
}