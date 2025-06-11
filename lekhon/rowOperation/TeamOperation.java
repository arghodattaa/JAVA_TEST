package rowOperation;
import rowFile.*;

public class TeamOperation extends Team{
    
    public Player[] players = new PlayerOperation[15];
    public  void setTeamName(String teamName){
        this.teamName = teamName;
    }
	public String getTeamName(){
        return teamName;
    }
	public int getIndex( String s){
		for(int i = 0; i<15; i++){
			if( players[i] != null &&  players[i].getPlayerName().equals(s)){
				players[i] = null;
				return i;
			}
			
		}
		return -1;
	}
	public void setPlayers(PlayerOperation p){
           for( int i = 0; i<15; i++){
			   if(players[i] == null){
				players[i] = p;
				//return true;
			   }
		   }
		 //  return false;
	}
	
	
	public  void insertPlayer(int index, Player p){
        players[index] = p;
    }
	public  Player getPlayer(int index){
        return players[index];
    }
    public void removePlayer(int index){
		players[index] = null;
	}

    public void transferPlayer(int from, int to, Team t){
		t.insertPlayer(to, players[from]);
		players[from] = null;
		System.out.println("Transfer Complete! ");
	}
    public void exchangePlayer(int index1, int index2, Team t){
		Player p = players[index1];
		players[index1] = t.getPlayer(index2);
		t.insertPlayer(index2,p);
		System.out.println("Exchange Complete!");
	}
    public void showTeam(){
		System.out.println("-------- "+teamName+" --------");
		for(int i=0;i<players.length;i++){
			if(players[i] != null){
				System.out.println("-------- "+i+" --------");
				players[i].showPlayer();
			}
		}
		System.out.println("-------------------------\n");
	}
    	public String getTeam(){
		String data="";
		data += "******** "+teamName+" **********\n";
		for(int i=0;i<players.length;i++){
			if(players[i] != null){
				data+= "~~~~~~~~ "+i+" ~~~~~~~~\n";
				data+= players[i].getPlayer();
			}
		}
		data+= "*******************************\n";
		
		return data;
	}
    public Player[] getAllPlayer(){
		return players;
	}
}
