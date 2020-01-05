package flavins.com.codes;

public class Main {

    public static void main(String[] args) {
	    FootBallPlayer kanu = new FootBallPlayer("kanu");
	    BaseBallPlayer  Leuis =  new BaseBallPlayer("Leuis");
	    VolleyBallPlayer Pat = new VolleyBallPlayer("Pat");


	    Team<FootBallPlayer> Enyimba = new Team<>("Enyimba");

	    Enyimba.addPlayer(kanu);
	    //Enyimba.addPlayer(Leuis);
	    //Enyimba.addPlayer(Pat);


		Team<BaseBallPlayer>baseBallTeam = new Team<>("Aba Lions");

		baseBallTeam.addPlayer(Leuis);
    }
}
