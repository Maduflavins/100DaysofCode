package flavins.com.codes;

public class Main {

    public static void main(String[] args) {
	    League<Team<FootBallPlayer>> footballLeague = new League<>("CAF");
	    Team<FootBallPlayer>kanoPillers = new Team<>("Kano Pillerss");
	    Team<FootBallPlayer>eyimbaCity = new Team<>("Eyinmab City");
	    Team<FootBallPlayer>Rangers = new Team<>("Ragngers United");

	    Team<BaseBallPlayer>Yobe = new Team<>("Yobe Stars");


	    footballLeague.addTeam(kanoPillers);
	    footballLeague.addTeam(eyimbaCity);
	    footballLeague.addTeam(Rangers);

	    kanoPillers.matchResult(eyimbaCity, 3, 0);
	    Rangers.matchResult(eyimbaCity, 3, 4);
	    eyimbaCity.matchResult(kanoPillers, 1, 2);

	    footballLeague.sortLeagueTable();
    }
}
