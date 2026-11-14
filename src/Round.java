public class Round {
    private final Tournament tournament;

    public Round(Tournament tournament) {
        if (tournament == null) {
            throw new IllegalArgumentException("Round must belong to a Tournament.");
        }
        this.tournament = tournament;

        tournament.addRound(this);
    }

    public Tournament getTournament() {
        return tournament;
    }
}