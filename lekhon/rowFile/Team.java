package rowFile;
public abstract class Team{
     protected String teamName;

	
	public Team(){}

	
	public abstract void setTeamName(String teamName);
	public abstract String getTeamName();
	
	public abstract void insertPlayer(int index, Player p);
	public abstract Player getPlayer(int index);

    public abstract void removePlayer(int index);
    public abstract void transferPlayer(int from, int to, Team t);
    public abstract void exchangePlayer(int index1, int index2, Team t);
    public abstract void showTeam();
    public abstract String getTeam();
	public abstract Player[] getAllPlayer();


    public abstract int getIndex(String s2);
	
	
	

}